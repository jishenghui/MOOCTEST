package net.mooctest;
public final class ExtBoolArray {

    private boolean[] werte;

    public ExtBoolArray(int len) {
        werte = new boolean[len];
    }

    public void setTrue(int a, int b) {
        for (int i = a; i <= b; i++) {
            werte[i] = true;
        }
    }

    public boolean isFalse(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (werte[i]) {
                return false;
            }
        }
        return true;
    }

    public int left() {
        int result = 0;
        for (int i = 0; i < werte.length; i++) {
            if (!werte[i]) {
                result++;
            }
        }
        return result;
    }
}
