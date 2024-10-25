package net.mooctest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SplayTreeTest {
    SplayTree tree;
    int[]arr;

    @Before
    public void setUp() throws Exception {
        tree=new SplayTree<Integer>();
        arr=new int[]{9,7,18,3,5,10,-8,97,-11,-66,53,87,-71,-32,-15,15,91,-74,83,-65};
        for (int i = 0; i < arr.length; i++) {
            tree.add(arr[i]);
        }
        tree.add(null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void get() {
        assertNull(tree.get(0));
        Arrays.sort(arr);
        for (int i = 0; i < 20; i++) {
            assertEquals(arr[i],tree.get(i+1));
        }
    }

    @Test
    public void size() {
        assertEquals(20,tree.size());
    }

    @Test
    public void indexOf() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i+1,tree.indexOf(arr[i]));
        }
    }

    @Test
    public void add() {
    }

    @Test
    public void remove() {
        int a= (int) tree.get(1);
        tree.remove(a);
        assertEquals(null,tree.get(20));
    }

    @Test
    public void contains() {
        assertTrue(tree.contains(-66));
        assertFalse(tree.contains(101));
    }

    @Test
    public void testToString() {
        assertEquals(" data=-65 left=-74 right=83 sz=20 cnt=1\n" +
                " data=-74 left= null right=-71 sz=3 cnt=1\n" +
                " data=-71 left= null right=-66 sz=2 cnt=1\n" +
                " data=-66 left= null right null sz=1 cnt=1\n" +
                " data=83 left=53 right=87 sz=16 cnt=1\n" +
                " data=53 left=-15 right null sz=12 cnt=1\n" +
                " data=-15 left=-32 right=15 sz=11 cnt=1\n" +
                " data=-32 left= null right null sz=1 cnt=1\n" +
                " data=15 left=-11 right=18 sz=9 cnt=1\n" +
                " data=-11 left= null right=-8 sz=7 cnt=1\n" +
                " data=-8 left= null right=10 sz=6 cnt=1\n" +
                " data=10 left=7 right null sz=5 cnt=1\n" +
                " data=7 left=3 right=9 sz=4 cnt=1\n" +
                " data=3 left= null right=5 sz=2 cnt=1\n" +
                " data=5 left= null right null sz=1 cnt=1\n" +
                " data=9 left= null right null sz=1 cnt=1\n" +
                " data=18 left= null right null sz=1 cnt=1\n" +
                " data=87 left= null right=91 sz=3 cnt=1\n" +
                " data=91 left= null right=97 sz=2 cnt=1\n" +
                " data=97 left= null right null sz=1 cnt=1\n",tree.toString());
    }

    @Test
    public void main() {
        SplayTree.main(new String[]{});
    }
}
