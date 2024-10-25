package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TreeTest {

	private final String testFilePath = "src/test/java/net/mooctest/test.txt";

    @Test
    public void testInsertWord() {
        Tree tree = new Tree();
        assertTrue(tree.insertWord("apple"));
        assertTrue(tree.insertWord("banana"));
        assertFalse(tree.insertWord("apple")); // 重复插入相同单词
    }

    @Test
    public void testInsertWordsFromFile() {
        File file = new File(testFilePath);
        Tree tree = new Tree();
        boolean[] inserted = tree.insertWords(file);

        assertNotNull(inserted);
        assertEquals(3, inserted.length);
        assertTrue(inserted[0]);
        assertTrue(inserted[1]);
        assertFalse(inserted[2]); // 文件中包含一个重复的单词
    }

    @Test
    public void testDeleteWord() throws Exception {
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");

        assertTrue(tree.deleteWord("apple"));
        assertFalse(tree.deleteWord("orange")); // 不存在的单词
    }

    @Test
    public void testDeleteWordsFromFile() throws Exception {
        File file = new File(testFilePath);
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");
        boolean[] deleted = tree.deleteWords(file);

        assertNotNull(deleted);
        assertEquals(3, deleted.length);
        assertTrue(deleted[0]);
        assertTrue(deleted[1]);
        assertFalse(deleted[2]); // 文件中包含一个不存在的单�?
    }

    @Test
    public void testSearchWord() throws Exception {
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");

        assertTrue(tree.searchWord("apple"));
        assertFalse(tree.searchWord("orange")); // 不存在的单词
    }

    @Test
    public void testSearchWordsFromFile() throws Exception {
        File file = new File(testFilePath);
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");
        boolean[] found = tree.searchWords(file);

        assertNotNull(found);
        assertEquals(3, found.length);
        assertTrue(found[0]);
        assertTrue(found[1]);
        assertFalse(found[2]); // 文件中包含一个不存在的单�?
    }

    @Test
    public void testGetSize()  throws Exception{
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");
        tree.insertWord("orange");
        tree.deleteWord("banana");

        assertEquals(2, tree.getSize());
    }

    @Test
    public void testGetHeight() {
        Tree tree = new Tree();
        tree.insertWord("apple");
        tree.insertWord("banana");
        tree.insertWord("orange");

        assertEquals(2, tree.getHeight());
    }

}
