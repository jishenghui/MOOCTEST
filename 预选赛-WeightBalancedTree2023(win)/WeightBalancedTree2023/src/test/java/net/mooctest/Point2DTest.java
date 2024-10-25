package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {

    @Test
    public void test() {
        Point2D point2D = new Point2D();
        assertEquals(2, point2D.getDim());

        point2D = new Point2D(1, 2);
        assertEquals(1, point2D.get(0), 0.0001);
        assertEquals(1, point2D.getX(), 0.0001);
        assertEquals(2, point2D.getY(), 0.0001);
        assertEquals("(1.0,2.0)", point2D.toString());

        float[] coord = {1, 2};
        point2D = new Point2D(coord);
        assertEquals(1, point2D.get(0), 0.0001);
        assertEquals(1, point2D.getX(), 0.0001);
        assertEquals(2, point2D.getY(), 0.0001);
        assertEquals("(1.0,2.0)", point2D.toString());

        point2D = new Point2D(point2D);
        assertEquals(1, point2D.get(0), 0.0001);
        assertEquals(1, point2D.getX(), 0.0001);
        assertEquals(2, point2D.getY(), 0.0001);
        assertEquals("(1.0,2.0)", point2D.toString());

    }

    @Test
    public void getDim() {
    }

    @Test
    public void get() {
    }

    @Test
    public void getX() {
    }

    @Test
    public void getY() {
    }

    @Test
    public void testToString() {
    }
}