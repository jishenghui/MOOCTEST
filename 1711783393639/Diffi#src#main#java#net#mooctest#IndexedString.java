package net.mooctest;
public final class IndexedString {

    private char[] values;
    private int[][] index;

    private int count(char c) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == c) {
                result++;
            }
        }
        return result;
    }

    public IndexedString(String s) {
        values = new char[s.length()];
        s.getChars(0, s.length(), values, 0);
        index = new int[256][];
        for (char c = 0; c < 256; c++) {
            index[c] = new int[count(c)];
            int idx = 0;
            for (int i = 0; i < values.length; i++) {
                if (values[i] == c) {
                    index[c][idx++] = i;
                }
            }
        }
    }

    public int indexOf(char[] target) {
        char first = target[0];
        int tl = target.length;
        int max = values.length - tl;
        int[] idxa = index[first];
        int idxl = idxa.length;
        int j;
        int end;

        for (int idx = 0; idx < idxl; idx++) {
            /* Look for first character. */
            int i = idxa[idx];

            /* Found first character, now look at the rest of v2 */
            if (i <= max) {
                j = i + 1;
                end = i + tl;
                for (int k = 1; j < end && values[j] == target[k]; j++, k++) {
                    ;
                }
                if (j == end) {
                    /* Found whole string. */
                    return i;
                }
            }
        }
        return -1;
    }
}