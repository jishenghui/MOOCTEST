package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import net.mooctest.BJTree.Node;

public class AirportTest {

	@Test
	public void test() {
		Airport airport = new Airport("123");
		Airport airport2 = new Airport("123","123123","1231","22222",1,1);
		System.out.println();
		assertNotNull(airport.getCity());
		assertNotNull(airport.getCode());
		assertNotNull(airport2.getCountry());
		assertNotNull(airport2.getName());
		assertNotNull(airport2.getString("123"));
		
		assertNotNull(airport2.getX());
		assertNotNull(airport2.getY());
		assertNotNull(airport2.getPoint2D());
		assertNotNull(airport2.getCoord(1));
		System.out.println(airport);
		System.out.println(airport2);
		System.out.println(airport2.getString("default"));
		System.out.println(airport2.getString("code-only"));
		System.out.println(airport2.getString("full"));
		System.out.println(airport2.getString("attributes"));
	}
	
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
				bjTree.insert(i, i+1, 0.2f);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}
		for (int i = 0; i < 5; i++) {
			try {
				bjTree.find(i);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}
		assertNotNull(bjTree.getMax());
		assertNotNull(bjTree.getMin());
		assertNotNull(bjTree.getPreorderList());
		assertNotNull(bjTree.findDown(2));
		assertNotNull(bjTree.findUp(2));
		for (int i = 0; i < 5; i++) {
			try {
				bjTree.delete(i);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}

	}
	

	
	
	@Test
	public void test4() {
		BJTree<String, Airport> tree = new BJTree<>();
		CommandHandler commandHandler = new CommandHandler(tree);
		try {
			commandHandler.processCommand("123");
			commandHandler.processCommand(":");
			commandHandler.processCommand("1:insert:insert");
//			commandHandler.processCommand(":insert");
//			commandHandler.processCommand("delete");
		} catch (Exception e) {
			// TODO 自动生成�? catch �?
			e.printStackTrace();
		}
	}
	
	@Test
	public void test5() {
		Point2D point2d = new Point2D();
		float[] a = {1.2f,3f};
		float[] b = {1.2f,3f,1f};
		Point2D point2d1 = new Point2D(a);
		try {
			Point2D point2d3 = new Point2D(b);
		} catch (AssertionError e) {
			// TODO: handle exception
		}
		
		Point2D point2d2 = new Point2D(point2d);
		assertNotNull(point2d.getDim());
		System.out.println(point2d);
		
	}
//	@Test
//	public void test6() {
//		String[] args = new String[3];
//		BJTreeTester.main(args);
//	}
	
	@Test
	public void test7() {
		CommandHandler.summarizeFind(null, null, null);
		Airport reAirport  = new Airport("Asd");
		CommandHandler.summarizeFind(null, null, reAirport);
		CommandHandler.summarizeGet(null, null);
		CommandHandler.summarizeGet(null, reAirport);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("asda");
		CommandHandler.treeStructure(list1);
		list.add("[");
		list.add("asda");
		list.add("as2d");
		CommandHandler.treeStructure(list);
		Iterator<String> iter = list.iterator();
		CommandHandler.treeStructureHelper(iter, "asda");
	}
	@Test
	public void test8() {
		BJTree<String, String> bjTree = new BJTree<>();
		BJTree.ExternalNode node = bjTree.new ExternalNode("a", "b", 0);
		node.find("c");
		List<BJTree.Node> nodes = new ArrayList<>();
//		node.buildTree(nodes);
		nodes.add(bjTree.new ExternalNode("123", "as", 0));
		node.buildTree(nodes);
		
	}
	

}
