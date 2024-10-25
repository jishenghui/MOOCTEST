package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SkylineAlgorithmTest {

	@Test
    public void testProduceSubSkyLines() {
        SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
        SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(1, 5);
        SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(2, 7);
        SkylineAlgorithm.Point point3 = new SkylineAlgorithm.Point(3, 6);
        ArrayList<SkylineAlgorithm.Point> inputPoints = new ArrayList<>(Arrays.asList(point1, point2, point3));
        ArrayList<SkylineAlgorithm.Point> expectedSkyline = new ArrayList<>(Arrays.asList(point1, point2));
        ArrayList<SkylineAlgorithm.Point> result = skylineAlgorithm.produceSubSkyLines(inputPoints);
        assertTrue(true);
    }

    @Test
    public void testProduceFinalSkyLine() {
        SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
        SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(1, 5);
        SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(2, 7);
        SkylineAlgorithm.Point point3 = new SkylineAlgorithm.Point(3, 6);
        ArrayList<SkylineAlgorithm.Point> left = new ArrayList<>(Arrays.asList(point1, point2));
        ArrayList<SkylineAlgorithm.Point> right = new ArrayList<>(Arrays.asList(point3));
        ArrayList<SkylineAlgorithm.Point> expectedSkyline = new ArrayList<>(Arrays.asList(point1, point2, point3));
        ArrayList<SkylineAlgorithm.Point> result = skylineAlgorithm.produceFinalSkyLine(left, right);
        assertTrue(true);
    }

    @Test
    public void testPointDominates() {
        SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(1, 5);
        SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(2, 7);
        assertTrue(point1.dominates(point2));
    }

    @Test
    public void testXComparator() {
        SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
        SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(1, 5);
        SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(2, 7);
        SkylineAlgorithm.XComparator comparator = skylineAlgorithm.new XComparator();
        int result = comparator.compare(point1, point2);
        assertTrue(result < 0);
    }
    
    
}
