package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmFactoryTest {

	@Test
	public void test() {
		AlgorithmFactory factory = new AlgorithmFactory();
		Algorithm algorithm = factory.getAlgorithm("QuickSort");
		assertTrue(algorithm instanceof OptimizedQuickSort);
	}

}
