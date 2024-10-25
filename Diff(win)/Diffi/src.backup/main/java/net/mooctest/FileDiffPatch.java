package net.mooctest;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDiffPatch {

    public static void createPatch(String origfn, String newfn, String patch) {
        createPatch(origfn, newfn, patch, false);
    }
 
    public static void createPatch(String origfn, String newfn, String patch, boolean verbose) {
        try {
            if (verbose) {
                System.out.println("Reading file A...");
            }
            String a = StringFromFile.readString(origfn);
            if (verbose) {
                System.out.println("Reading file B...");
            }
            String b = StringFromFile.readString(newfn);
            if (verbose) {
                System.out.println("Looking for links...");
            }
            long t = System.currentTimeMillis();
            RelativeString r = StringIncrementor.diff(a, b, verbose);
            FileOutputStream C = new FileOutputStream(patch);
            r.bytesToStream(C);
            C.close();
            if (verbose) {
                System.out.println("Patch successfully created in " + (System.currentTimeMillis() - t) / 1000.0 + " seconds");
            }
            if (verbose) {
                System.out.println(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doPatch(String origfn, String newfn, String patch) {
        doPatch(origfn, newfn, patch, false);
    }

    public static void doPatch(String origfn, String newfn, String patch, boolean verbose) {
        FileInputStream A = null;
        try {
            if (verbose) {
                System.out.println("Reading file A...");
            }
            String a = StringFromFile.readString(origfn);
            if (verbose) {
                System.out.println("Reading Patch...");
            }
            FileInputStream B = new FileInputStream(patch);
            RelativeString r = new RelativeString(B);
            B.close();
            System.out.println(r);
            long t = System.currentTimeMillis();
            String c = StringIncrementor.patch(a, r, verbose);
            FileOutputStream C = new FileOutputStream(newfn);
            DataOutputStream DC = new DataOutputStream(C);
            DC.writeBytes(c);
            DC.flush();
            DC.close();
            if (verbose) {
                System.out.println("Patch successfully applied in " + (System.currentTimeMillis() - t) / 1000.0 + " seconds");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
