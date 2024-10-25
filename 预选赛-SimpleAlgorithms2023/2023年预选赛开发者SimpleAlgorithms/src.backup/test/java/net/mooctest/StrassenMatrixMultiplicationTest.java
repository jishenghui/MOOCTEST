package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class StrassenMatrixMultiplicationTest {

    @Test
    public void testMatrixMultiplication() {
        StrassenMatrixMultiplication strassen = new StrassenMatrixMultiplication();
        
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
        int[][] expected = {
            {19, 22},
            {43, 50}
        };
        
        int[][] result = strassen.multiply(A, B);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMatrixAddition() {
        StrassenMatrixMultiplication strassen = new StrassenMatrixMultiplication();
        
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
        int[][] expected = {
            {6, 8},
            {10, 12}
        };
        
        int[][] result = strassen.add(A, B);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMatrixSubtraction() {
        StrassenMatrixMultiplication strassen = new StrassenMatrixMultiplication();
        
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
        int[][] expected = {
            {-4, -4},
            {-4, -4}
        };
        
        int[][] result = strassen.sub(A, B);
        
        assertArrayEquals(expected, result);
    }
}
