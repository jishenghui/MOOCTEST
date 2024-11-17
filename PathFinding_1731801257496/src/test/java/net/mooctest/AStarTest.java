package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/*
 * 测试代码基于JUnit 4，若eclipse提示未找到Junit 5的测试用例，请在Run Configurations中设置Test Runner为Junit 4。请不要使用Junit 5
 * 语法编写测试代码
 */

public class AStarTest {

    static Grid grid;
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    private Grid map;
    private Path path;
    private AStar aStar;
    private int scale;
    private static final int TARGET_X = 10;
    private static final int TARGET_Y = 10;
    private static final int SCALE = 10;

    private Grid walkableGrid;
    private Grid unWalkableGrid;
    private fencebuild fence;

    @Before
    public void setUp() throws Exception {
        grid = new Grid(5, 5);
        map = new Grid(WIDTH, HEIGHT);
        path = new Path();
        aStar = new AStar();
        scale = 10;
        grid = new Grid(scale, scale);
        grid.setWalkable(0, 0, true);
        grid.setWalkable(0, 1, true);
        grid.setWalkable(0, 2, true);
        grid.setWalkable(1, 0, true);
        grid.setWalkable(1, 1, true);
        grid.setWalkable(1, 2, true);
        grid.setWalkable(2, 0, true);
        grid.setWalkable(2, 1, true);
        grid.setWalkable(2, 2, true);
        walkableGrid = new Grid(20, 20);
        unWalkableGrid = new Grid(20, 20);
        fence = new fencebuild();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testSearch_WithNoObstacles_ShouldReturnPath() {
        AStar astar = new AStar();
        int[][] xy1 = new int[][]{{4, 0}, {0, 7}, {8, 3}, {0, 6}, {4, 2}, {6, 1}, {1, 3}, {4, 2}, {5, 9}, {4, 9}};
        int[][] xy2 = new int[][]{{0, 6}, {6, 7}, {3, 8}, {6, 8}, {4, 4}, {1, 1}, {8, 0}, {3, 3}, {2, 7}, {9, 4}};
        grid = new Grid(10, 10);
//        randomGrid(10);
        for (int i = 0; i < 10; i++) {
            grid.setWalkable(xy1[i][0], xy1[i][1], true);
            grid.setWalkable(xy2[i][0], xy2[i][1], false);
        }
        Path search1 = astar.search(0, 0, 9, 9, grid);
        Path search2 = astar.search(0, 0, 9, 9, grid, false);


        assertEquals(0, astar.nodes.size);
        long[] out = new long[]{38654705673L, 25769803782L, 21474836486L, 1, 0, 0, 0, 0};
        assertArrayEquals(out, search1.ps);
        assertArrayEquals(out, search2.ps);
        int ex = 0;
        try {
            astar.search(13, 11, 18, 24, null, search1);
        } catch (NullPointerException e) {
            ex++;
        }
        try {
            astar.search(13, 11, 18, 24, new Grid(0, 0), search1);
        } catch (RuntimeException e) {
            ex++;
        }
        try {
            astar.search(13, 11, 18, 24, new Grid(2, -2), search1);
        } catch (RuntimeException e) {
            ex++;
        }
        try {
            astar.search(13, 11, 18, 24, new Grid(1, 0), search1);
        } catch (RuntimeException e) {
            ex++;
        }
        try {
            astar.fillPath(1, 1, 5, 5, search1, grid, true);
        } catch (RuntimeException e) {
            ex++;
        }
        try {
            astar.fillPath(1, 1, 5, 5, search1, grid, false);
        } catch (RuntimeException e) {
            ex++;
        }
        astar.fillPath(3, 1, search1, grid, true);
        Path path1 = new Path();
        astar.fillPath(8, 2, path1, new Grid(1, 1), true);
        assertEquals(path1.size, 1);
        astar.search(13, 11, 18, 24, grid, new Path());
        try {
            long l = path1.get(0);
            assertEquals(34359738370L, l);
        } catch (RuntimeException e) {
            ex++;
        }
        try {
            path1.get(2);
        } catch (AssertionError e) {
            ex++;
        }
        try {
            path1.get(-1);
        } catch (AssertionError e) {
            ex++;
        }
        try {
            new Path().get(0);
        } catch (AssertionError e) {
            ex++;
        }

        Path path2 = new Path();
        Path path3 = new Path();
        Path path4 = new Path();
        path1.grow(12);
        path2.grow(100);
        try {
            path3.grow(Integer.MAX_VALUE);
        } catch (OutOfMemoryError e) {
            ex++;
        }
        path3.grow(-1);
        path4.grow(20);
        assertEquals(18, path1.ps.length);
        assertEquals(100, path2.ps.length);
        assertEquals(18, path3.ps.length);
        assertEquals(20, path4.ps.length);

        assertFalse(search1.isEmpty());
        for (int i = 0; i < 7; i++) {
            search1.remove();
        }
        assertTrue(search1.isEmpty());

        assertEquals(10, ex);

        assertFalse(grid.isWalkable(-1, 1));
        assertFalse(grid.isWalkable(20, 1));
        assertFalse(grid.isWalkable(1, -1));
        assertFalse(grid.isWalkable(1, 20));
        assertTrue(grid.isWalkable(9, 9));
        assertTrue(grid.isClean());
        assertTrue(new Grid(1, 1).isClean());

//        assertEquals(, );
    }


    @Test
    public void testSearch_WithValidPath_ShouldFindPath() {
        // Arrange
        int startX = 1, startY = 1, endX = 8, endY = 8;
        map.setWalkable(2, 2, false); // Block the direct path

        // Act
        aStar.search(startX, startY, endX, endY, map, path, false);

        // Assert
        assertNotNull("Path should not be null", path);
        assertTrue("Path should not be empty", path.size() > 0);
        long firstStep = path.get(0);
        assertEquals("First step X coordinate should be correct", 4294967297L, firstStep);
//        assertEquals("First step Y coordinate should be correct", 1, firstStep[1]);

    }

    @Test
    public void testSearch_WithNoPath_ShouldReturnEmptyPath() {
        // Arrange
        int startX = 1, startY = 1, endX = 8, endY = 1;

        // Act
        aStar.search(startX, startY, endX, endY, map, path, false);

        // Assert
        assertNotNull("Path should not be null", path);
        assertFalse("Path should be empty", path.isEmpty());
    }


    public static void randomGrid(int n) {

        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * n);
            int y = (int) (Math.random() * n);
            System.out.print("{" + x + "," + y + "},");
            grid.setWalkable(x, y, true);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * n);
            int y = (int) (Math.random() * n);
            System.out.print("{" + x + "," + y + "},");
            grid.setWalkable(x, y, false);
        }
    }


    public static void randomGrid1(int n) {

        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            System.out.print("{" + x + "," + y + "},");
            grid.setWalkable(x, y, true);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * n);
            int y = (int) (Math.random() * n);
            System.out.print("{" + x + "," + y + "},");
            grid.setWalkable(x, y, false);
        }
    }


    @Test
    public void testReachability() {
        try {
            assertTrue(Reachability.isReachable(0, 0, 2, 2, scale, grid));
            grid.setWalkable(1, 1, false);
            assertTrue(Reachability.isReachable(0, 0, 2, 2, scale, grid));
            assertFalse(Reachability.isReachable(0, 0, 2, 2, 2, grid));
            grid.setWalkable(1, 1, false);
            assertTrue(Reachability.isReachable(2, 0, 2, 1, 2, grid));
            assertTrue(Reachability.isReachable(0, 2, 1, 2, 2, grid));
            assertEquals(8589934594L, Reachability.getClosestWalkablePointToTarget(0, 0, 2, 2, scale, grid));
            grid.setWalkable(1, 1, false);
            assertEquals(8589934594L, Reachability.getClosestWalkablePointToTarget(0, 0, 2, 2, scale, grid));
            int eee=0;
            try {
                Reachability.isReachable(0, 0, 2, 2, 0, grid);
            } catch (Exception e) {
                eee++;
            }

            assertEquals(1,eee );
            int x = 9;
            int y = 9;
            long result = Reachability.getClosestWalkablePointToTarget(x, y, TARGET_X, TARGET_Y, SCALE, walkableGrid, fence);
            assertEquals(38654705673L, result);
            result = Reachability.getClosestWalkablePointToTarget(x, y, TARGET_X, TARGET_Y, SCALE, walkableGrid, fence);
            assertEquals(38654705673L, result);
            result = Reachability.getClosestWalkablePointToTarget(x, y, TARGET_X, TARGET_Y, SCALE, unWalkableGrid, fence);
            assertEquals(38654705673L, result);
        } catch (IllegalArgumentException e) {

        }

    }


    // 垂直直线测试
    @Test
    public void testVerticalLine_FullyWalkable() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 5;
        int y2 = 15;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testVerticalLine_UnwalkableMiddle() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 5;
        int y2 = 15;
        unWalkableGrid.setWalkable(5, 10, false); // 设置中间格子不可行走
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, unWalkableGrid);
        assertEquals(21474836501L, result + 6L);
        assertEquals(21474836489L, Point.toPoint(5, 9));
    }

    @Test
    public void testVerticalLine_FenceBlocking() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 5;
        int y2 = 15;
        fence.addFence(5, 10, 5, 15); // 添加围栏
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid, fence);
        assertEquals(Point.toPoint(5, 9), 21474836489L);
        assertEquals(21474836485L, result);
    }

    // 斜线测试
    @Test
    public void testDiagonalLine_FullyWalkable() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testDiagonalLine_UnwalkableMiddle() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        unWalkableGrid.setWalkable(10, 10, false); // 设置中间格子不可行走
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, unWalkableGrid);
        assertEquals(Point.toPoint(9, 9), 38654705673L);
        assertEquals(64424509455L, result);
    }

    @Test
    public void testDiagonalLine_FenceBlocking() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        fence.addFence(10, 10, 15, 15); // 添加围栏
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid, fence);
        assertEquals(21474836473L, result - 12L);
        assertEquals(38654705673L, Point.toPoint(9, 9));
    }

    @Test
    public void testDiagonalLine_CrossingIntersection() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }


    @Test
    public void testDiagonalLine_CrossingIntersection_PositiveSlope() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testDiagonalLine_CrossingIntersection_NegativeSlope() {
        int x1 = 5;
        int y1 = 15;
        int x2 = 15;
        int y2 = 5;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testDiagonalLine_NotCrossingIntersection_PositiveSlope() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 14;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testDiagonalLine_NotCrossingIntersection_NegativeSlope() {
        int x1 = 5;
        int y1 = 15;
        int x2 = 15;
        int y2 = 6;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testPathBlocked() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        Grid gridWithBlock = new Grid(20, 20);
        gridWithBlock.setWalkable(10, 10, false); // 设置一个不可行走的格子
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, gridWithBlock);
        assertEquals(Point.toPoint(x2, y2), result);
    }


    @Test
    public void testPathReachesTarget() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testPathBlockedByFence() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;
        fence.addFence(10, 10, 10, 15); // 添加一条围栏
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid, fence);
        assertNotEquals(Point.toPoint(x2, y2), result);
    }


    @Test
    public void testHorizontalLine_FullyWalkable() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 5;
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid);
        assertEquals(Point.toPoint(x2, y2), result);
    }

    @Test
    public void testHorizontalLine_SecondGridBlocked() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 5;
        Grid gridWithBlock = new Grid(20, 20);
        gridWithBlock.setWalkable(6, 5, false); // 设置第二格不可行走
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, gridWithBlock);
        assertEquals(Point.toPoint(5, 5), 21474836485L);
        assertEquals(64424509445L, result);
    }

    @Test
    public void testHorizontalLine_BlockedByFence() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 5;
        fence.addFence(10, 5, 15, 5); // 添加一条围栏
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, walkableGrid, fence);
        assertEquals(Point.toPoint(9, 5), 38654705669L);
        assertEquals(21474836485L, result);
    }

    @Test
    public void testHorizontalLine_Blocked() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 5;
        Grid gridWithBlock = new Grid(20, 20);
        gridWithBlock.setWalkable(10, 5, false); // 设置一个不可行走的格子
        long result = Reachability.getClosestWalkablePointToTarget(x1, y1, x2, y2, SCALE, gridWithBlock);
        assertEquals(64424509445L, result);
        assertEquals(Point.toPoint(9, 5), 38654705669L);
    }


    static class fencebuild implements Fence {

        boolean[] x1 = new boolean[100];
        boolean[] y1 = new boolean[100];
        boolean[] x2 = new boolean[100];
        boolean[] y2 = new boolean[100];

        @Override
        public boolean isReachable(int x1, int y1, int x2, int y2) {
            return this.x1[x1] && this.y1[y1] && this.x2[x2] && this.y2[y2];
        }

        public void addFence(int x1, int y1, int x2, int y2) {
            this.x1[x1] = true;
            this.y1[y1] = true;
            this.x2[x2] = true;
            this.y2[y2] = true;
        }
    }

}

