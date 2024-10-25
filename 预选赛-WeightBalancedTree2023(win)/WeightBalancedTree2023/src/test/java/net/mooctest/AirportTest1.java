package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.NetworkChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class AirportTest1 {

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
			// TODO 自动生成的 catch 块
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
		assertNotNull(Point2D.getDim());
		System.out.println(point2d);
		
	}

	
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
	
	

	
	
	@Test
	public void test10() {
		BJTree<String, Airport> tree = new BJTree<>();
		BJTree<String, Airport> tree1 = new BJTree<>();
		
		
		
		try {
			tree1.insert("code", new Airport("code","name","city","cou",0.2f,0.32f),3.0f);
//			tree1.insert("aa", new Airport("aa",), w);
			CommandHandler commandHandler = new CommandHandler(tree);
			CommandHandler commandHandler1 = new CommandHandler(tree1);
			commandHandler.processCommand("123");
			commandHandler.processCommand(":");
			commandHandler.processCommand("1:insert:code:name:city:cou:0.2:0.32:1");
			commandHandler1.processCommand("1:insert:code:name:city:cou:0.2:0.32:0");
			commandHandler1.processCommand("1:insert:code:name:city:cou:0.2:0.32:0");
			commandHandler.processCommand("1:delete:code:name:city:cou:0.2:0.32:-1.1");
			commandHandler.processCommand("1:clear:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:find:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:find-down:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:find-up:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:get-min:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:get-max:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:preorder:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:insert:code:name:city:cou:0.2:0.32:1");
			commandHandler.processCommand("1:2");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	@Test
	public void test11() {
		BJTree<String, String> bjTree ;
		try {
			bjTree = new BJTree<>();
			bjTree.delete("aa");
			BJTree.ExternalNode node1 = bjTree.new ExternalNode("b", "c", 1f);
//			BJTree.InternalNode node = bjTree.new InternalNode("a", node1, node1);
			node1.insert("c", "a", 3.0f);
			node1.insert("b", "a", 3.0f);
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println("asdasdasdadads");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test12(){
		BJTree<Integer, String> bjTree = new BJTree<>();
		BJTree.ExternalNode node1 = bjTree.new ExternalNode(3, "c", 1f);
		
		try {
			node1.insert(2, "a", 3.0f);
			
			
			assertNull(node1.findDown(1));
			
			assertNull(node1.findUp(12));
			node1.delete(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	@Test
	public void test13() throws Exception {
		BJTree<Integer, Integer> bjTree = new BJTree<>();
		BJTree.ExternalNode node1 = bjTree.new ExternalNode(10, 10, 1f);
		BJTree.InternalNode node2 = bjTree.new InternalNode(2, node1, node1);
		node2.insert(-1, -1, 0.3f);
		node2.delete(10);
		BJTree.InternalNode node3 = bjTree.new InternalNode(1, node2, node2);
		node3.delete(10);
	}
	@Test
	public void test14() {
		BJTree<Integer, Integer> bjTree = new BJTree<>();
//		BJTree<Integer, Integer>.ExternalNode node4 = new BJTree<Integer, Integer>.ExternalNode(10,10, 1f);
		BJTree.ExternalNode node = bjTree.new ExternalNode(10, 10, 1f);
		BJTree.ExternalNode node1 = bjTree.new ExternalNode(10, 10, 4f);
		BJTree.InternalNode node2 = bjTree.new InternalNode(2, node1, node);
		BJTree.InternalNode node3 = bjTree.new InternalNode(12, node1, node);
//		System.out.println("maxWeight"+node2.left.weight);
		node2.rebuild(2);
		node2.findDown(6);
		node3.findUp(11);
		
	}
	@Test
	public void test15() {
		float[] fs = new float[3];
		try {
			Point2D point2d = new Point2D(fs);
		} catch (Error e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	public void test16() {
		BJTree<String, Airport> tree = new BJTree<>();
		try {
			tree.insert("ai", new Airport("as"), 0.3f);
			CommandHandler commandHandler = new CommandHandler(tree);
			commandHandler.processCommand("1:insert:ai:name:city:cou:0.2:0.32:1f");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
//	
//	@Test(timeout=2000)
//	public void test6()  {
//		Class<BJTreeTester> myClass = BJTreeTester.class;
//		try {
//			Field field = myClass.getDeclaredField("USE_STD_IO");
//			field.setAccessible(true);
//			field.set(null, false);
//			String[] args = new String[2];
////			System.out.println("USE_STD_IO="+field);
//			Method method = myClass.getDeclaredMethod("main", String[].class);
//			method.setAccessible(true);
//			method.invoke(null, (Object)args);
//			String[] args = new String[3];
//			BJTreeTester.main(args);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//
//		
//	}
	
	@Test
	public void test17() {
		Airport airport = new Airport("default");
		
	
		assertNotNull(airport.getString("default"));
		assertNotNull(airport.getString(""));

	}
	
	@Test
	public void test18() throws Exception {
		BJTree<String, Airport> bjTree= new BJTree<String, Airport>();
		bjTree.insert("aa", null, 0.3f);
		
	}

}
