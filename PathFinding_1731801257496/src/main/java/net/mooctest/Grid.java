package net.mooctest;

import static net.mooctest.Utils.check;
import static net.mooctest.Utils.mask;

public class Grid {

    static final int NODE_BITS = 12;
    static final int NODE_MASK = mask(NODE_BITS);
    static final int NODE_NULL = 0;
    static final int NODE_CLOSED = NODE_MASK;

    static final int NODE_PARENT_DIRECTION_BITS = 3; // 8方向
    static final int NODE_PARENT_DIRECTION_MASK = mask(NODE_PARENT_DIRECTION_BITS);
    static final int NODE_PARENT_DIRECTION_SHIFT = NODE_BITS;
    static final int NODE_PARENT_DIRECTION_SHIFT_MASK =
            NODE_PARENT_DIRECTION_MASK << NODE_PARENT_DIRECTION_SHIFT;

    static final int WALKABLE_BITS = 1;
    static final int WALKABLE_MASK = mask(WALKABLE_BITS);
    static final int WALKABLE_SHIFT = NODE_PARENT_DIRECTION_SHIFT + NODE_PARENT_DIRECTION_BITS;
    static final int WALKABLE_SHIFT_MASK = WALKABLE_MASK << WALKABLE_SHIFT;

    // const
    static final int DIRECTION_UP = 0;
    static final int DIRECTION_DOWN = 1;
    static final int DIRECTION_LEFT = 2;
    static final int DIRECTION_RIGHT = 3;
    static final int DIRECTION_LEFT_UP = 4;
    static final int DIRECTION_LEFT_DOWN = 5;
    static final int DIRECTION_RIGHT_UP = 6;
    static final int DIRECTION_RIGHT_DOWN = 7;

    static final int MAX_OPEN_NODE_SIZE = NODE_MASK - 1; // 全0全1都被用了

    // data
    final short[][] grid;
    final int width;
    final int height;

    public Grid(int width, int height) {
        check(width > 0 && width <= Node.X_MASK + 1);
        check(height > 0 && height <= Node.Y_MASK + 1);
        this.grid = new short[width][height];
        this.width = width;
        this.height = height;
    }

    int info(int x, int y) {
        return grid[x][y] & (WALKABLE_SHIFT_MASK | NODE_MASK);
    }

    static boolean isUnwalkable(int info) {
        return (info & WALKABLE_SHIFT_MASK) != 0;
    }

    static boolean isNullNode(int info) {
        return info == NODE_NULL;
    }

    static boolean isClosedNode(int info) {
        return info == NODE_CLOSED;
    }

    static int openNodeIdx(int info) {
        assert info > 0 && info <= MAX_OPEN_NODE_SIZE;
        return info - 1;
    }

    void nodeClosed(int x, int y) {
        grid[x][y] |= NODE_CLOSED;
    }

    void openNodeIdxUpdate(int x, int y, int idx) {
        assert idx >= 0 && idx < MAX_OPEN_NODE_SIZE;
        grid[x][y] = (short) (grid[x][y] & ~NODE_MASK | (idx + 1));
    }

    void nodeParentDirectionUpdate(int x, int y, int d) {
        assert d >= 0 && d <= NODE_PARENT_DIRECTION_MASK;
        grid[x][y] =
                (short)
                        (grid[x][y] & ~NODE_PARENT_DIRECTION_SHIFT_MASK | (d << NODE_PARENT_DIRECTION_SHIFT));
    }

    int nodeParentDirection(int x, int y) {
        return grid[x][y] >>> NODE_PARENT_DIRECTION_SHIFT & NODE_PARENT_DIRECTION_MASK;
    }

    void clear() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] &= WALKABLE_SHIFT_MASK;
            }
        }
    }

    boolean isClean() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((grid[i][j] & (NODE_PARENT_DIRECTION_SHIFT_MASK | NODE_MASK)) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setWalkable(int x, int y, boolean flag) {
        if (flag) {
            grid[x][y] &= ~WALKABLE_SHIFT_MASK;
        } else {
            grid[x][y] |= WALKABLE_SHIFT_MASK;
        }
    }

    public boolean isWalkable(int x, int y) {
        if (x < 0 || x >= width) {
            return false;
        }
        if (y < 0 || y >= height) {
            return false;
        }
        return (grid[x][y] & WALKABLE_SHIFT_MASK) == 0;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
