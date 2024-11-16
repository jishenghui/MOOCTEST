package net.mooctest;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.Arrays;


public class SplaySubTreeTest {
    SplaySubTree tree;
    int[]arr;

    @Before
    public void setUp() throws Exception {
        tree=new SplaySubTree<Integer>(null);
        arr=new int[]{9,9,7,18,3,5,10,-8,97,-11,-66,53,87,-71,-32,-15,15,91,-74,83,83,-65};
        for (int i = 0; i < arr.length; i++) {
            tree=tree.add(arr[i]);
        }
        tree.add(null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Test1(){
        assertEquals(" data=-65 left=-74 right=83 sz=22 cnt=1\n" +
                " data=-74 left= null right=-71 sz=3 cnt=1\n" +
                " data=-71 left= null right=-66 sz=2 cnt=1\n" +
                " data=-66 left= null right null sz=1 cnt=1\n" +
                " data=83 left=53 right=87 sz=18 cnt=2\n" +
                " data=53 left=-15 right null sz=13 cnt=1\n" +
                " data=-15 left=-32 right=15 sz=12 cnt=1\n" +
                " data=-32 left= null right null sz=1 cnt=1\n" +
                " data=15 left=-11 right=18 sz=10 cnt=1\n" +
                " data=-11 left= null right=-8 sz=8 cnt=1\n" +
                " data=-8 left= null right=10 sz=7 cnt=1\n" +
                " data=10 left=7 right null sz=6 cnt=1\n" +
                " data=7 left=3 right=9 sz=5 cnt=1\n" +
                " data=3 left= null right=5 sz=2 cnt=1\n" +
                " data=5 left= null right null sz=1 cnt=1\n" +
                " data=9 left= null right null sz=2 cnt=2\n" +
                " data=18 left= null right null sz=1 cnt=1\n" +
                " data=87 left= null right=91 sz=3 cnt=1\n" +
                " data=91 left= null right=97 sz=2 cnt=1\n" +
                " data=97 left= null right null sz=1 cnt=1\n",tree.toString());
    }
    @Test
    public void Test2(){
        assertEquals(-74,tree.get(1).getData());
        assertNull(tree.get(11111));
        assertNull(tree.get(-1));
        assertNull(tree.get(0));
        Arrays.sort(arr);
        for (int i = 1; i < 13; i++) {
            assertEquals(arr[i-1],tree.get(i).getData());
        }
        for (int i = 13; i < arr.length; i++) {
            tree.get(i);
        }
    }

    @Test
    public void Test4(){
        assertEquals(arr.length,tree.size());
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i==12?12:i==18?18:i>=19?i:i+1,tree.indexOf(arr[i]));
        }

        int[] out={-74,-71,-66,-65,-32,-15,-11,-8,3,5,7,9,9,10,15,18,53,83,83,87,91,97};
        for (int i = 0; i < out.length; i++) {
            tree=tree.remove(arr[i]);
            assertEquals(out[i],tree.getData());
        }
        assertSame(tree,tree.remove(null));

        tree=new SplaySubTree<>(1);
        tree=tree.add(-8);
        assertEquals(-1,tree.indexOf(null));
        assertEquals(1,tree.indexOf(-8));

        tree=new SplaySubTree<>(1);
        tree=tree.add(8);
        assertEquals(2,tree.indexOf(8));
        assertEquals(-1,tree.indexOf(7));
        tree=new SplaySubTree<>(1);
        tree=tree.remove(1);
        assertSame(tree.remove(1),tree);
    }


    @Test
    public void Test5(){
        int[]out={9,9,7,18,3,5,10,-8,97,-11,-66,53,87,-71,-32,-15,15,91,-74,83,83,-65};
        for (int i = 0; i < out.length; i++) {
            tree=tree.remove(arr[i]);
            assertEquals(out[i],tree.getData());
        }

    }
    @Test
    public void Test6(){

    }
    @Test
    public void Test7(){

    }
    @Test
    public void Test8(){

    }
    @Test
    public void Test9(){

    }
    @Test
    public void Test10(){

    }

}