package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class BJTreeTest {

    @Test
    public void find() throws Exception {
        BJTree<Integer, Integer> tree = new BJTree<>();
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);

        assertEquals(1, (int)tree.find(1));
        assertEquals(2, (int)tree.find(2));
        assertEquals(3, (int)tree.find(3));

        tree.delete(1);
        assertNull(tree.find(1));

        tree.clear();
        assertNull(tree.find(2));

        // make tree imbalanced
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);
        tree.insert(4, 4, 4);
        tree.insert(5, 5, 5);
        tree.insert(6, 6, 6);
        tree.insert(7, 7, 7);
        tree.insert(8, 8, 8);
        tree.insert(9, 9, 9);
    }

    @Test
    public void getPreorderList() throws Exception {
        BJTree<Integer, Integer> tree = new BJTree<>();
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);

        assertEquals("[(2) wt: 6.0, [1 1] wt: 1.0, (3) wt: 5.0, [2 2] wt: 2.0, [3 3] wt: 3.0]", tree.getPreorderList().toString());

        tree.clear();
        assertEquals("[]", tree.getPreorderList().toString());
    }

    @Test
    public void getMin() throws Exception {
        BJTree<Integer, Integer> tree = new BJTree<>();
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);

        assertEquals(1, (int)tree.getMin());

        tree.clear();
        assertNull(tree.getMin());
    }

    @Test
    public void getMax() throws Exception {
        BJTree<Integer, Integer> tree = new BJTree<>();
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);

        assertEquals(3, (int)tree.getMax());

        tree.clear();
        assertNull(tree.getMax());
    }

    @Test
    public void findDown() throws Exception {
        BJTree<Integer, Integer> tree = new BJTree<>();
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);
        tree.insert(4, 4, 4);
        tree.insert(5, 5, 5);
        tree.insert(6, 6, 6);
        tree.insert(7, 7, 7);
        tree.insert(8, 8, 8);
        tree.insert(9, 9, 9);

        assertEquals(5, (int)tree.findDown(5));

        tree.clear();
        assertNull(tree.findDown(1));
    }

    @Test
    public void findUp() throws Exception {
        BJTree<Integer, Integer> tree = new BJTree<>();
        tree.insert(1, 1, 1);
        tree.insert(2, 2, 2);
        tree.insert(3, 3, 3);
        tree.insert(4, 4, 4);
        tree.insert(5, 5, 5);
        tree.insert(6, 6, 6);
        tree.insert(7, 7, 7);
        tree.insert(8, 8, 8);
        tree.insert(9, 9, 9);

        assertEquals(5, (int)tree.findUp(5));

        tree.clear();
        assertNull(tree.findUp(1));
    }
}