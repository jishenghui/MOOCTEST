package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AVLNodeTest {
    private final String testFilePath = "src/test/java/net/mooctest/test.txt";
    private final String testFilePath1 = "src/test/java/net/mooctest/test1.txt";
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test()
    public void testInster() throws Exception{
        AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
        AVLNode<Integer> avlNode1 = new AVLNode<Integer>(2);
        assertFalse(avlNode.search(0));

        avlNode.insert(10);
        avlNode.insert(6);
        avlNode.insert(-1);
        avlNode.insert(-10);

        avlNode1.insert(3);
        avlNode1.insert(1);
        avlNode1.insert(0);
        avlNode1.insert(-1);

        assertTrue(avlNode1.search(2));
        assertTrue(avlNode1.search(3));

        assertTrue(avlNode1.search(1));
        assertTrue(avlNode1.search(0));
        assertTrue(avlNode1.search(-1));

        assertTrue(avlNode.search(2));
        assertTrue(avlNode.search(-1));
        assertTrue(avlNode.search(10));
        assertTrue(avlNode.search(-10));
        assertTrue(avlNode.search(6));
        assertFalse(avlNode.search(100));

    }

    @Test
    public void testBalancce() throws Exception{
        AVLNode<Integer> avlNode = new AVLNode<Integer>(6);
        avlNode.insert(3);
        avlNode.insert(7);
        avlNode.insert(4);
        avlNode.insert(5);

        AVLNode<Integer> avlNode1 = new AVLNode<Integer>(6);
        avlNode1.insert(3);
        avlNode1.insert(7);
        avlNode.insert(2);
        avlNode1.insert(4);
        avlNode1.insert(1);

    }
    @Test()
    public void testDelete() throws Exception{
        AVLNode<Integer> avlNode = new AVLNode<Integer>(2);


        avlNode.insert(5);
        avlNode.insert(4);
        avlNode.insert(3);
        avlNode.insert(-10);


        avlNode.delete(-10);
        assertTrue(avlNode.search(2));

        assertFalse(avlNode.search(-10));

        assertFalse(avlNode.search(5));
        assertFalse(avlNode.search(4));
        assertTrue(avlNode.search(3));

        AVLNode<Integer> avlNode1 = new AVLNode<Integer>(2);
        avlNode.insert(5);
        System.out.println(avlNode1.search(Integer.valueOf(2)));
        assertNull(avlNode1.delete(Integer.valueOf(2)));
        System.out.println(avlNode1.delete(Integer.valueOf(2)));
        System.out.println(avlNode1.search(Integer.valueOf(2)));


        AVLNode<Integer> avlNode2 = new AVLNode<Integer>(1);
        avlNode2.insert(50);
        assertNotNull(avlNode2.delete(50));
        System.out.println(TreePrinter.printNode(avlNode2));

        AVLNode<Integer> avlNode3 = new AVLNode<Integer>(1);
        avlNode2.insert(-9);
        assertNotNull(avlNode2.delete(-9));
        System.out.println(TreePrinter.printNode(avlNode2));

    }
    @Test()
    public void testFindMin() throws Exception {
        AVLNode<Integer> avlNode = new AVLNode<Integer>(5);

        avlNode.insert(4);
        avlNode.insert(6);
        avlNode.insert(3);
        avlNode.insert(7);
        avlNode.insert(1);
        avlNode.insert(8);
        avlNode.insert(0);



        assertEquals(Integer.valueOf(0), avlNode.findMin(avlNode).getElement());

    }

    @Test()
    public void testInsertWord() {
        Tree tree = new Tree();
        assertTrue(tree.insertWord("apple"));
        assertTrue(tree.insertWord("banana"));
        assertFalse(tree.insertWord("apple")); // 重复插入相同单词
    }


    @Test()
    public void testInsertWordsFromFile() {
        File file = new File(testFilePath);
        Tree tree = new Tree();
        boolean[] inserted = tree.insertWords(file);

        assertNotNull(inserted);
        assertEquals(2, inserted.length);
        assertTrue(inserted[0]);
        assertTrue(inserted[1]);
    }

    @Test()
    public void testDeleteWord() throws Exception {
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");

        assertTrue(tree.deleteWord("apple"));
        assertFalse(tree.deleteWord("orange")); // 不存在的单词
        assertTrue(tree.deleteWord("banana"));
    }

    @Test()
    public void testDeleteWordsFromFile() throws Exception {
        File file = new File(testFilePath1);
        Tree tree = new Tree();

        System.out.println(tree.insertWord("apple"));
        tree.insertWord("banana");
        boolean[] deleted = tree.deleteWords(file);

        assertNotNull(deleted);
        assertEquals(2, deleted.length);
        assertTrue(deleted[0]);
        assertTrue(deleted[1]);
    }

    @Test()
    public void testSearchWord() throws Exception {
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");

        assertTrue(tree.searchWord("apple"));
        assertFalse(tree.searchWord("orange")); // 不存在的单词
    }

    @Test()
    public void testSearchWordsFromFile() throws Exception {
        File file = new File(testFilePath);
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");
        boolean[] found = tree.searchWords(file);

        assertNotNull(found);
        assertEquals(2, found.length);
        assertTrue(found[0]);
        assertTrue(found[1]);
    }
    @Test()
    public void testException() {
        Tree tree = new Tree();
        try {
            tree.searchWord("apple");
            tree.deleteWord("apple");

        } catch (Exception e) {
            e.printStackTrace();
//				thrown.expect(Exception.class);
//				thrown.expectMessage("Tree is empty");
        }
        Tree tree2 = new Tree();
        tree2.insertWords(new File("test11.txt"));
//	    	assertNull(tree2.deleteWords(new File("test11.txt")));

    }

    @Test()
    public void testGetSize()  throws Exception{
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");
        tree.insertWord("orange");
        tree.deleteWord("banana");

        assertEquals(2, tree.getSize());
    }

    @Test()
    public void testGetHeightAndToString() {
        Tree tree = new Tree();

        assertEquals(0, tree.getHeight());
        tree.insertWord("apple");
        tree.insertWord("banana");
        tree.insertWord("orange");

        System.out.println(tree.toString());
        String expectedOutput =
                "   bannana   \n" +
                        "  / \\  \n" +
                        " apple orange \n"+
                        "        \r\n"
                ;
        assertEquals(2, tree.getHeight());
        assertNotEquals(expectedOutput, tree);
    }

    @Test()
    public void testPrintNode() throws Exception{
        AVLNode<Integer> root = new AVLNode<>(4);
        root.insert(2);
        String s1 =
                " 4   \r\n" +
                        "/   \r\n" +
                        "2   \n";
        assertNotEquals(s1,TreePrinter.printNode(root));
        root.insert(6);
        root.insert(1);
        root.insert(3);
        root.insert(5);
        root.insert(7);

        String expectedOutput =
                "   4   \n" +
                        "  / \\  \n" +
                        " 2   6 \n" +
                        "/ \\ / \\ \n" +
                        "1 3 5 7 \n";

        String output = TreePrinter.printNode(root);
        assertNotEquals(expectedOutput, output);
    }



}
