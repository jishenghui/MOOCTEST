package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class MaximumMinimumWindowTest {

    @Test
    public void testCalculateMaxOfMin() {
        int[] input = new int[] {10, 20, 30, 50, 10, 70, 30};
        int[] expected = new int[] {70, 30, 20, 10, 10, 10, 10};

        int[] result = MaximumMinimumWindow.calculateMaxOfMin(input, input.length);

        assertTrue(true);
    }
}
