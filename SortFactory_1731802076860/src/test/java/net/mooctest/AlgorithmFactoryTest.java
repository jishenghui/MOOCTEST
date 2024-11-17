package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.stubbing.Answer1;

public class AlgorithmFactoryTest {

	@Test
	public void test() {
		int ex=0;
		AlgorithmFactory factory = new AlgorithmFactory();
		Algorithm algorithm1 = factory.getAlgorithm("QuickSort");
		assertTrue(algorithm1 instanceof OptimizedQuickSort);
		Algorithm algorithm2 = factory.getAlgorithm("Bubblesort");
		assertTrue(algorithm2 instanceof BubbleSort);
		Algorithm algorithm3 = factory.getAlgorithm("Parallelmergesort");
		assertTrue(algorithm3 instanceof ParallelMergeSort);
		AlgorithmManager algorithmManager = new AlgorithmManager();
		algorithmManager.addAlgorithm(algorithm1);
		algorithmManager.addAlgorithm(algorithm2);
		algorithmManager.addAlgorithm(algorithm3);
		assertEquals(null,algorithmManager.getAlgorithm("a") );
		assertEquals(algorithm3, algorithmManager.getAlgorithm("Parallel Merge Sort"));
		assertEquals(algorithm2, algorithmManager.getAlgorithm("Bubble Sort"));
		assertEquals(algorithm1, algorithmManager.getAlgorithm("Optimized Quick Sort"));

		ArrayDataStructure arrayDataStructure = new ArrayDataStructure(10);
		int[]array=new int[10];
		for (int i = 0; i < 10; i++) {
			arrayDataStructure.add(i);
			array[i]=i;
		}
		assertArrayEquals(array,arrayDataStructure.toArray());


		try {
			Algorithm algorithm4 = factory.getAlgorithm("zzz");
		} catch (AlgorithmNotFoundException e) {
			ex++;
		}
		assertEquals(1,ex );

	}

	@Test
	public void testAlgorithmManager (){

	}

}
