package net.mooctest;

import static net.mooctest.Utils.mask;

class Node {
    //  int x, y;
    //  int g, f;

    static final int F_BITS = 16;
    static final int F_MASK = mask(F_BITS);

    static final int G_BITS = 16;
    static final int G_MASK = mask(G_BITS);
    static final int G_SHIFT = F_BITS;

    static final long G_F_MASK_COMPLEMENT = ~((long) G_MASK << G_SHIFT | F_MASK);

    static final int Y_BITS = 16;
    static final int Y_MASK = mask(Y_BITS);
    static final int Y_SHIFT = G_SHIFT + G_BITS;

    static final int X_BITS = 16;
    static final int X_MASK = mask(X_BITS);
    static final int X_SHIFT = Y_SHIFT + Y_BITS;

    static long toNode(int x, int y, int g, int f) {
        if (f < 0) { // 如果这里报错，Cost类里改成2:3? 或者保存h而不是f?
            throw new TooLongPathException("TooBigF");
        }
        return (long) x << X_SHIFT | (long) y << Y_SHIFT | (long) g << G_SHIFT | f;
    }

    static int getX(long l) {
        return (int) (l >>> X_SHIFT);
    }

    static int getY(long l) {
        return (int) (l >>> Y_SHIFT & Y_MASK);
    }

    static int getG(long l) {
        return (int) (l >> G_SHIFT & G_MASK);
    }

    static int getF(long l) {
        return (int) (l & F_MASK);
    }

    static long setGF(long l, int g, int f) { // f一定比原f值更小，g一定小于等于f，所以两个值都>0
        return l & G_F_MASK_COMPLEMENT | ((long) g << G_SHIFT) | f;
    }
}
