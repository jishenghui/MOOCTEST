package net.mooctest;

import org.junit.Test;

import net.mooctest.BJTree.ExternalNode;
import net.mooctest.BJTree.InternalNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AirportTest2 {

	

	@Test
	public void test2(){
		BJTree<Integer, Integer> bjTree = new BJTree<>();
		try {
			bjTree.delete(1);
			bjTree.clear();
			assertNull(bjTree.find(1));
			assertNull(bjTree.getMax());
			assertNull(bjTree.getMin());
			assertNotNull(bjTree.getPreorderList());
			assertNull(bjTree.findDown(2));
			assertNull(bjTree.findUp(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (int i = 0; i < 5; i++) {
			try {
				bjTree.insert(i, i+1, 0.3f);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}
//		for (int i = 0; i < 5; i++) {
//			try {
//				bjTree.find(i);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}		
//		}
//		assertNotNull(bjTree.getMax());
//		assertNotNull(bjTree.getMin());
//		assertNotNull(bjTree.getPreorderList());
//		assertNotNull(bjTree.findDown(2));
//		assertNotNull(bjTree.findUp(2));
//		for (int i = 0; i < 5; i++) {
//			try {
//				bjTree.delete(i);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}		
//		}

	}
	

}
