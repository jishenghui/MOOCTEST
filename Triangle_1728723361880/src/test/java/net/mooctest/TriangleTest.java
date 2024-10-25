package net.mooctest;
import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {
	
	Triangle T1 = new Triangle(2, 3, 4);

	@Test
	public void testIsTriangle() {
		assertEquals(true, T1.isTriangle(T1));
	}

}
