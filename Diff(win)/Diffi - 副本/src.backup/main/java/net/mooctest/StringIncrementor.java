package net.mooctest;
public class StringIncrementor {

    public static RelativeString diff(String a, String b) {
        return diff(a, b, false);
    }

    public static RelativeString diff(String a, String b, boolean verbose) {
        RelativeString result = new RelativeString();
        ExtBoolArray vergeben = new ExtBoolArray(b.length());
        System.out.println("Creating index...");
        IndexedString ai = new IndexedString(a);
        System.out.println("Searching links...");
        char[] target = new char[13];
        for (int posB = 0; posB < b.length() - 12; posB++) {
            int l = 13;
            
            b.getChars(posB, posB + 13, target, 0);
            int posA = ai.indexOf(target);
            if (posA == -1) {
                if (verbose && posB % (b.length() / 1000) == 0) {
                    System.out.println("@ " + (Math.round(posB / (double) b.length() * 1000) / 10.0) + "%");
                }
                continue;
            }
            int posALast = posA;
            while (posA != -1 && posB + l < b.length() && posA + l < a.length()) {
                l++;
                if (a.charAt(posA + l - 1) != b.charAt(posB + l - 1)) {
                    posALast = posA;
                   
                    char[] target2 = new char[l];
                    b.getChars(posB, posB + l, target2, 0);
                    posA = ai.indexOf(target2);
                }
            }
            if (posA == -1) {
                l--;
                posA = posALast;
            }
            vergeben.setTrue(posB, posB + l - 1);
            StringLink sl = new StringLink(posA, posB, l);
            if (verbose) {
                System.out.println(sl + " @ " + (Math.round(posB / (double) b.length() * 1000) / 10.0) + "%");
            }
            result.addLink(sl);
            posB += l - 1;
        }
        StringBuilder rest = new StringBuilder();
        synchronized (rest) {
            for (int i = 0; i < b.length(); i++) {
                if (vergeben.isFalse(i, i)) {
                    rest.append(b.charAt(i));
                }
            }
        }
        result.setAbsolute(rest.toString());
        return result;
    }

    public static String patch(String a, RelativeString r) {
        return patch(a, r, false);
    }

    public static String patch(String a, RelativeString r, boolean verbose) {
        StringBuilder result = new StringBuilder(r.getLength());
        int posAbs = 0;
        for (int i = 0; i < r.linksCount(); i++) {
            StringLink si = r.getLink(i);
            if (result.length() != si.getPosNew()) {
                int diff = si.getPosNew() - result.length();
                if (verbose) {
                    System.out.println("Adding " + diff + " absolute Bytes from pos#" + posAbs);
                }
                result.append(r.getAbsolute().substring(posAbs, posAbs + diff));
                posAbs += diff;
            }
            if (verbose) {
                System.out.println("Adding Link: " + si);
            }
            result.append(a.substring(si.getPosOrig(), si.getPosOrig() + si.getLen()));
        }
        result.append(r.getAbsolute().substring(posAbs));
        return result.toString();
    }
}
