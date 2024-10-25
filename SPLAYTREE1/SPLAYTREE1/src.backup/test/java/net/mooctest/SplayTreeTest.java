package net.mooctest;

import static org.junit.Assert.*;

import javax.enterprise.inject.New;

import org.junit.Test;

public class SplayTreeTest {

    @Test
    public void testAddAndSize() {
        SplaySubTree<Integer> tree = new SplaySubTree<>(5);
        assertEquals(1, tree.size());

        tree = tree.add(Integer.valueOf(3));
        tree = tree.add(Integer.valueOf(8));
        tree = tree.add(Integer.valueOf(2));
        tree = tree.add(Integer.valueOf(4));

        assertEquals(5, tree.size());
        System.out.println(tree.toString());
    }

    @Test
    public void testIndexOf() {
        SplaySubTree<Integer> tree = new SplaySubTree<>(5);
        tree = tree.add(3);
        tree = tree.add(8);
        tree = tree.add(2);
        tree = tree.add(4);

        assertEquals(4, tree.indexOf(5));
        assertEquals(2, tree.indexOf(3));
        assertEquals(5, tree.indexOf(8));
        assertEquals(1, tree.indexOf(2));
        assertEquals(3, tree.indexOf(4));
        assertEquals(-1, tree.indexOf(7)); 
    }

    @Test
    public void testRemove() {
    	SplaySubTree<Integer> tree = new SplaySubTree<>(null);

        tree = tree.remove(5);

        assertNull(tree.getData());
        
        SplaySubTree<Integer> tree1 = new SplaySubTree<>(5);

        tree1 = tree1.remove(10);

        assertEquals(1, tree1.size());
        
        SplaySubTree<Integer> tree2 = new SplaySubTree<>(5);
        tree2 = tree2.add(3);
        tree2 = tree2.add(8);

        tree2 = tree2.remove(5);

        assertEquals(2, tree2.size());
        
        assertEquals(Integer.valueOf(5), tree2.getData());

        SplaySubTree<Integer> tree3 = new SplaySubTree<>(5);
        tree3 = tree3.remove(5);
        assertEquals(0, tree3.size());
        SplaySubTree<Integer> tree4 = new SplaySubTree<>(5);
        tree4 = tree4.add(6);
        tree4 = tree4.add(7);
        tree4 = tree4.add(8);
        tree4 = tree4.add(9);
        tree4 = tree4.add(10);
        tree4 = tree4.add(11);
        tree4 = tree4.remove(5);
        tree4 = tree4.remove(9);
        assertEquals(5 , tree4.size());
        
        
        
      
        
        
         
    }
    

    @Test
    public void testJoinAndSplit() {
    	SplaySubTree<Integer> tree = new SplaySubTree<>(5);
        tree = tree.add(3);
        tree = tree.add(8);
        tree = tree.add(2);
        tree = tree.add(4);
        
        SplaySubTree<Integer> tree1 = new SplaySubTree<Integer>(0);
        
        assertNull(tree1.join(tree));
        assertNull(tree1.split(2));
    }
    @Test
    public void testFind() {
    	SplaySubTree<Integer> tree = new SplaySubTree<>(null);
        assertNull(tree.find(1));
    }
    @Test
    public void testGet() {
    	SplaySubTree<Integer> tree = new SplaySubTree<>(null);
    	assertNull(tree.get(-1));
    	assertNull(tree.get(1));
    	SplaySubTree<Integer> tree1 = new SplaySubTree<>(5);
        tree1 = tree1.add(3);
        tree1 = tree1.add(8);
        tree1 = tree1.add(2);
        assertEquals(Integer.valueOf(2), tree1.get(1).getData());
        tree1 = tree1.add(4);
        System.out.println(tree1.toString());
        assertEquals(Integer.valueOf(2), tree1.get(1).getData());
        assertEquals(Integer.valueOf(5), tree1.get(4).getData());
        
    }
    
    @Test
    public void testSplayTreeAddAndSize() {
    	SplayTree<String> splayTree = new SplayTree<String>();
    	
    	splayTree.add("apple");
    	splayTree.add("apple1");
    	splayTree.add("apple2");
    	splayTree.add("apple3");
    	splayTree.add("apple4");
    	
    	assertEquals(5, splayTree.size());
    	System.out.println(splayTree.toString());    	
    }
    
    @Test
    public void testSplayTreeIndexOF() {
    	SplayTree<Integer> splayTree = new SplayTree<>();
    	splayTree.add(5);
    	splayTree.add(3);
    	splayTree.add(8);
    	splayTree.add(2);
    	splayTree.add(4);
    	System.out.println(splayTree.toString());
    	assertEquals(-1, splayTree.indexOf(-1));
//    	assertEquals(3, splayTree.indexOf(1));
//
//    	assertEquals(4, splayTree.indexOf(2));
//
//    	assertEquals(5, splayTree.indexOf(3));
//
//    	assertEquals(8, splayTree.indexOf(4));

    }
    
    @Test
    public void testSplayTreeContains() {
    	SplayTree<Integer> tree = new SplayTree<>();
    	
    	tree.add(5);;
        tree.add(3);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        
        assertNotNull(tree.contains(5));
        assertNotNull(tree.contains(0));
    }
    
    @Test
    public void testSplayTreeRemove() {
    	SplayTree<Integer> tree = new SplayTree<>();
    	
    	tree.add(5);;
        tree.add(3);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        tree.add(10);
        
        System.out.println(tree.toString());
        
        tree.remove(5);
        tree.remove(1);
        
        System.out.println(tree);
//        assertEquals(5, tree.get(index));
    }
    
    @Test
    public void testSplayTreeGet() {
    	SplayTree<String> tree = new SplayTree<>();
    	tree.add("a");
    	tree.add("b");
    	tree.add("c");
    	tree.add("b");
    	tree.add("e");
    	
    	SplayTree<String> tree1 = new SplayTree<>();
    	assertNotNull(tree.get(3));
    	
    	tree1.add(null);
    	assertNull(tree1.get(1));
    }
    

}
