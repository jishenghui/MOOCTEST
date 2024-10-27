package net.mooctest;

import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RedBlackTreeTest {
    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    String lineSeparator = System.lineSeparator();//操作系统换行符
    PrintStream printStream;


    //捕获控制台输出，每个方法仅限使用一次(没有出缓)
    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        printStream = new PrintStream(outContent);
        System.setOut(printStream);
    }

    public String GetOutPutAfter() {
        return outContent.toString();//获取输出的内容
    }

    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }


    RedBlackTree redBlackTree;

    @Before
    public void setUp() {
        redBlackTree = new RedBlackTree();
    }

    @Test
    public void testRedBlackTree() {
        int[] nums = {1840062394, 2089894277, 1337723342, 1250663169, 1536921605, -168791925, 1799033711, 574395547, -1097010084, -800510282, -964146757, -1312527342, -801980735, -771484861, 1469120123, -1351283318, -471678647, 635686798, 812037701, 1146246263, 1415557923};
        Node[] nodes = new Node[20];
        for (int i = 0; i < 20; i++) {
            nodes[i] = redBlackTree.insert(nums[i]);
        }
        RedBlackTree.RedBlackNode node = (RedBlackTree.RedBlackNode) redBlackTree.insert(nums[20]);
        assertEquals(1415557923, (int) node.value);
        assertEquals(1250663169, (int) redBlackTree.root.value);
        assertEquals(RedBlackTree.ColorEnum.RED, node.color);
        assertEquals(21, redBlackTree.size);

        Node max = redBlackTree.getMaximum(redBlackTree.root);
        Node min = redBlackTree.getMinimum(redBlackTree.root);
        System.out.println();
        assertEquals(2089894277, (int) max.value);
        assertEquals(-1351283318, (int) min.value);

        Node onode1 = redBlackTree.delete(nums[20]);
        Node onode2 = redBlackTree.delete(node);
        assertSame(onode2, onode1);
        assertNull(onode1.value);
        assertEquals(19, redBlackTree.size);

        Arrays.sort(nums);
        assertEquals(nums[0], (int) min.value);
        assertEquals(nums[20], (int) max.value);

        GetOutPutBefore();
        redBlackTree.printTree();
        String out = GetOutPutAfter();
        assertEquals(
                "                 /----- <null>" + lineSeparator +
                        "         /----- 2089894277" + lineSeparator +
                        "         |       \\----- <null>" + lineSeparator +
                        " /----- 1840062394" + lineSeparator +
                        " |       |                       /----- <null>" + lineSeparator +
                        " |       |               /----- 1799033711" + lineSeparator +
                        " |       |               |       \\----- <null>" + lineSeparator +
                        " |       |       /----- 1536921605" + lineSeparator +
                        " |       |       |       |       /----- <null>" + lineSeparator +
                        " |       |       |       \\----- 1469120123" + lineSeparator +
                        " |       |       |               \\----- <null>" + lineSeparator +
                        " |       \\----- 1337723342" + lineSeparator +
                        " |               \\----- <null>" + lineSeparator +
                        "1250663169" + lineSeparator +
                        " |                       /----- <null>" + lineSeparator +
                        " |               /----- 1146246263" + lineSeparator +
                        " |               |       \\----- <null>" + lineSeparator +
                        " |       /----- 812037701" + lineSeparator +
                        " |       |       |       /----- <null>" + lineSeparator +
                        " |       |       \\----- 635686798" + lineSeparator +
                        " |       |               \\----- <null>" + lineSeparator +
                        " \\----- 574395547" + lineSeparator +
                        "         |                       /----- <null>" + lineSeparator +
                        "         |               /----- -168791925" + lineSeparator +
                        "         |               |       \\----- <null>" + lineSeparator +
                        "         |       /----- -471678647" + lineSeparator +
                        "         |       |       \\----- <null>" + lineSeparator +
                        "         \\----- -771484861" + lineSeparator +
                        "                 |       /----- <null>" + lineSeparator +
                        "                 \\----- -800510282" + lineSeparator +
                        "                         |                       /----- <null>" + lineSeparator +
                        "                         |               /----- -801980735" + lineSeparator +
                        "                         |               |       \\----- <null>" + lineSeparator +
                        "                         |       /----- -964146757" + lineSeparator +
                        "                         |       |       \\----- <null>" + lineSeparator +
                        "                         \\----- -1097010084" + lineSeparator +
                        "                                 |       /----- <null>" + lineSeparator +
                        "                                 \\----- -1312527342" + lineSeparator +
                        "                                         |       /----- <null>" + lineSeparator +
                        "                                         \\----- -1351283318" + lineSeparator +
                        "                                                 \\----- <null>" + lineSeparator, out);


        for (int i = 0; i < 20; i += 4) {
            Node deleteNode1 = redBlackTree.delete(nums[i]);
            assertEquals(null, deleteNode1.value);
        }


    }

    @Test
    public void testDelete() {
        RedBlackTree testBigNumTree = new RedBlackTree();
        int[] testadd = new int[]{-1762917428, -1255653333, 1572481334, 78492126, 890775658, -1490453333, 1679942607, 1607864274, -879552693, -671040278, -609204570, 1716035676, 712785665, 732733821, -2072713325, 1532401491, -196600312, -766952868, -98962123, 1861597377, -979144442, -32779816, 425777357, -478929161, -1184595628, -1220807988, -861105559, -1671836186, -1838917699, -1778770414, -1953287356, -1350588495, -227420284, -239606983, 1428298348, 1640535677, -1205008981, -2075373452, 1226233765, 1650655115, 1975058546, 2110451156, -334964595, 390452105, 1142385437, -168642631, -1549908992, -184692700, 1525174778, -1687303034, -995579971, -1877686559, 1718995618, 2138161555, 1001151561, -794428115, -1230842754, 551277415, 589284115, 1045428658, -188138099, 333669670, -1612856616, 484791019, -49639581, 909149000, -568777144, 1044599546, -313243532, -1580507765, -1378565910, 1288602809, 697820562, 255126570, -809599428, -2122154482, 1841004468, 256390223, -1333149923, 1770224514, -2100297224, 730259397, -339236497, -1762287340, -1973011478, 912989169, 771902968, -255396789, 1353470982, -1065094142, -892745592, 978740106, -1198432645, 297835111, -726614431, 1605594791, 616897585, 866276737, -1658331438, -354990915, 890775658, 890775658, 890775658, -879552693, 1716035676, 1532401491, -196600312, -766952868, -32779816, -32779816, -478929161, -1220807988, -1838917699, -1838917699, -1778770414, -1350588495, 1428298348, 1226233765, 2110451156, 390452105, 390452105, -184692700, -995579971, 1001151561, -794428115, 1045428658, -1612856616, -1612856616, -568777144, -1378565910, 697820562, 255126570, -2122154482, 256390223, 1770224514, 1770224514, -339236497, -1973011478, 771902968, -255396789, 1353470982, 978740106, 978740106, 297835111, -726614431, 616897585, -1658331438};
        for (int i = 0; i < testadd.length; i++) {
            testBigNumTree.insert(testadd[i]);
        }
        int[] outnum = new int[]{34, 24, 5, 73, 55, 97, 48, 23, 56, 67, 98, 74, 53, 57, 9, 51, 50, 27, 22, 68, 29, 4, 39, 60, 66, 83, 37, 35, 81, 58, 45, 70, 87, 94, 49, 47, 72, 6, 65, 41, 0, 8, 7, 54, 10, 46, 40, 78, 84, 71, 93, 33, 99, 59, 42, 44, 76, 79, 95, 13, 1, 85, 82, 96, 64, 38, 30, 11, 62, 12, 25, 90, 31, 80, 36, 43, 20, 77, 26, 63, 19, 2, 21, 16, 75, 14, 61, 88, 52, 86, 32, 69, 15, 89, 3, 92, 18, 91, 28, 17};
        Node[] deiltout = new Node[100];
        for (int i = 0; i < 100; i++) {
            deiltout[i] = testBigNumTree.delete(testadd[outnum[i]]);
        }
        Integer[] outPutNodeValue = new Integer[]{null, null, -1378565910, 255126570, -726614431, null, null, null, null, 1045428658, null, null, 2110451156, null, -726614431, null, -995579971, -1687303034, 390452105, null, null, null, null, -184692700, -568777144, null, null, null, null, null, 890775658, null, -255396789, null, null, null, null, 1716035676, 978740106, null, null, null, 1605594791, null, null, null, null, -1350588495, null, 1353470982, null, null, null, 1045428658, null, 1226233765, 2110451156, 1770224514, null, null, -1350588495, 978740106, -339236497, 616897585, null, null, -1973011478, null, null, null, null, null, null, -2122154482, -1198432645, null, -794428115, null, null, 697820562, null, 1532401491, null, null, -2122154482, null, null, 1353470982, null, null, null, null, 1532401491, null, null, null, null, null, null, null};

        for (int i = 0; i < 100; i++) {
            assertEquals(outPutNodeValue[i], deiltout[i].value);
        }
        GetOutPutBefore();
        testBigNumTree.printTree();
        String prinftString = GetOutPutAfter();
        assertEquals("                                                         /----- <null>" + lineSeparator +
                "                                                 /----- 2110451156" + lineSeparator +
                "                                                 |       |       /----- <null>" + lineSeparator +
                "                                                 |       \\----- 1770224514" + lineSeparator +
                "                                                 |               \\----- <null>" + lineSeparator +
                "                                         /----- 1770224514" + lineSeparator +
                "                                         |       |       /----- <null>" + lineSeparator +
                "                                         |       \\----- 1716035676" + lineSeparator +
                "                                         |               |       /----- <null>" + lineSeparator +
                "                                         |               \\----- 1532401491" + lineSeparator +
                "                                         |                       \\----- <null>" + lineSeparator +
                "                                 /----- 1428298348" + lineSeparator +
                "                                 |       |               /----- <null>" + lineSeparator +
                "                                 |       |       /----- 1353470982" + lineSeparator +
                "                                 |       |       |       \\----- <null>" + lineSeparator +
                "                                 |       \\----- 1226233765" + lineSeparator +
                "                                 |               |       /----- <null>" + lineSeparator +
                "                                 |               \\----- 1045428658" + lineSeparator +
                "                                 |                       |       /----- <null>" + lineSeparator +
                "                                 |                       \\----- 1001151561" + lineSeparator +
                "                                 |                               |               /----- <null>" + lineSeparator +
                "                                 |                               |       /----- 978740106" + lineSeparator +
                "                                 |                               |       |       |       /----- <null>" + lineSeparator +
                "                                 |                               |       |       \\----- 978740106" + lineSeparator +
                "                                 |                               |       |               \\----- <null>" + lineSeparator +
                "                                 |                               \\----- 890775658" + lineSeparator +
                "                                 |                                       |       /----- <null>" + lineSeparator +
                "                                 |                                       \\----- 890775658" + lineSeparator +
                "                                 |                                               \\----- <null>" + lineSeparator +
                "                         /----- 890775658" + lineSeparator +
                "                         |       |               /----- <null>" + lineSeparator +
                "                         |       |       /----- 771902968" + lineSeparator +
                "                         |       |       |       |               /----- <null>" + lineSeparator +
                "                         |       |       |       |       /----- 697820562" + lineSeparator +
                "                         |       |       |       |       |       \\----- <null>" + lineSeparator +
                "                         |       |       |       \\----- 616897585" + lineSeparator +
                "                         |       |       |               |               /----- <null>" + lineSeparator +
                "                         |       |       |               |       /----- 390452105" + lineSeparator +
                "                         |       |       |               |       |       \\----- <null>" + lineSeparator +
                "                         |       |       |               \\----- 390452105" + lineSeparator +
                "                         |       |       |                       |               /----- <null>" + lineSeparator +
                "                         |       |       |                       |       /----- 297835111" + lineSeparator +
                "                         |       |       |                       |       |       \\----- <null>" + lineSeparator +
                "                         |       |       |                       \\----- 256390223" + lineSeparator +
                "                         |       |       |                               \\----- <null>" + lineSeparator +
                "                         |       \\----- 255126570" + lineSeparator +
                "                         |               |       /----- <null>" + lineSeparator +
                "                         |               \\----- -32779816" + lineSeparator +
                "                         |                       \\----- <null>" + lineSeparator +
                "                 /----- -32779816" + lineSeparator +
                "                 |       |               /----- <null>" + lineSeparator +
                "                 |       |       /----- -184692700" + lineSeparator +
                "                 |       |       |       \\----- <null>" + lineSeparator +
                "                 |       \\----- -196600312" + lineSeparator +
                "                 |               \\----- <null>" + lineSeparator +
                "         /----- -255396789" + lineSeparator +
                "         |       |               /----- <null>" + lineSeparator +
                "         |       |       /----- -339236497" + lineSeparator +
                "         |       |       |       \\----- <null>" + lineSeparator +
                "         |       \\----- -478929161" + lineSeparator +
                "         |               \\----- <null>" + lineSeparator +
                " /----- -568777144" + lineSeparator +
                " |       |                       /----- <null>" + lineSeparator +
                " |       |               /----- -726614431" + lineSeparator +
                " |       |               |       \\----- <null>" + lineSeparator +
                " |       |       /----- -766952868" + lineSeparator +
                " |       |       |       \\----- <null>" + lineSeparator +
                " |       \\----- -794428115" + lineSeparator +
                " |               \\----- <null>" + lineSeparator +
                "-879552693" + lineSeparator +
                " |       /----- <null>" + lineSeparator +
                " \\----- -995579971" + lineSeparator +
                "         |       /----- <null>" + lineSeparator +
                "         \\----- -1220807988" + lineSeparator +
                "                 |               /----- <null>" + lineSeparator +
                "                 |       /----- -1350588495" + lineSeparator +
                "                 |       |       |       /----- <null>" + lineSeparator +
                "                 |       |       \\----- -1378565910" + lineSeparator +
                "                 |       |               |       /----- <null>" + lineSeparator +
                "                 |       |               \\----- -1612856616" + lineSeparator +
                "                 |       |                       |       /----- <null>" + lineSeparator +
                "                 |       |                       \\----- -1612856616" + lineSeparator +
                "                 |       |                               \\----- <null>" + lineSeparator +
                "                 \\----- -1658331438" + lineSeparator +
                "                         |               /----- <null>" + lineSeparator +
                "                         |       /----- -1778770414" + lineSeparator +
                "                         |       |       \\----- <null>" + lineSeparator +
                "                         \\----- -1838917699" + lineSeparator +
                "                                 |       /----- <null>" + lineSeparator +
                "                                 \\----- -1838917699" + lineSeparator +
                "                                         |       /----- <null>" + lineSeparator +
                "                                         \\----- -1973011478" + lineSeparator +
                "                                                 |       /----- <null>" + lineSeparator +
                "                                                 \\----- -2122154482" + lineSeparator +
                "                                                         \\----- <null>" + lineSeparator, prinftString);


    }


    @Test
    public void testAbstractBinaryTree() {
        AbstractBinaryTree abstractBinaryTree = new AbstractBinaryTree() {
            @Override
            protected Node createNode(int value, Node parent, Node left, Node right) {
                return new Node(value, parent, right, left);
            }
        };
        Node[] nodes = new Node[21];
        int[] nums = {1840062394, 2089894277, 1337723342, 1250663169, 1536921605, -168791925, 1799033711, 574395547, -1097010084, -800510282, -964146757, -1312527342, -801980735, -771484861, 1469120123, -1351283318, -471678647, 635686798, 812037701, 1146246263, 1415557923};
        abstractBinaryTree.root = abstractBinaryTree.insert(100);
        nodes[0] = abstractBinaryTree.root;
        for (int i = 0; i < 20; i++) {
            nodes[i + 1] = abstractBinaryTree.insert(nums[i]);
        }
        Node rotateLeftNode1 = abstractBinaryTree.rotateLeft(nodes[8]);
        Node rotateLeftNode2 = abstractBinaryTree.rotateLeft(nodes[1]);
        Node rotateLeftNode3 = abstractBinaryTree.rotateLeft(nodes[0]);

        Node rotateRightNode1 = abstractBinaryTree.rotateRight(nodes[5]);
        Node rotateRightNode2 = abstractBinaryTree.rotateRight(nodes[1]);
        Node rotateRightNode3 = abstractBinaryTree.rotateRight(nodes[2]);

        assertEquals(635686798, (int) rotateLeftNode1.value);
        assertEquals(2089894277, (int) rotateLeftNode2.value);
        assertEquals(2089894277, (int) rotateLeftNode3.value);
        assertEquals(1469120123, (int) rotateRightNode1.value);
        assertEquals(1337723342, (int) rotateRightNode2.value);
        assertEquals(100, (int) rotateRightNode3.value);


        GetOutPutBefore();
        abstractBinaryTree.printTree();
        String s = GetOutPutAfter();
        try {
            GetOutPutEnd();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(" /----- 2089894277" + lineSeparator +
                " |       |       /----- 1840062394" + lineSeparator +
                " |       |       |       |               /----- 1799033711" + lineSeparator +
                " |       |       |       |       /----- 1536921605" + lineSeparator +
                " |       |       |       \\----- 1469120123" + lineSeparator +
                " |       \\----- 1337723342" + lineSeparator +
                " |               \\----- 1250663169" + lineSeparator +
                " |                       |               /----- 1146246263" + lineSeparator +
                " |                       |       /----- 812037701" + lineSeparator +
                " |                       \\----- 635686798" + lineSeparator +
                " |                               \\----- 574395547" + lineSeparator +
                "100" + lineSeparator +
                " \\----- -168791925" + lineSeparator +
                "         |                       /----- -471678647" + lineSeparator +
                "         |               /----- -771484861" + lineSeparator +
                "         |       /----- -800510282" + lineSeparator +
                "         |       |       |       /----- -801980735" + lineSeparator +
                "         |       |       \\----- -964146757" + lineSeparator +
                "         \\----- -1097010084" + lineSeparator +
                "                 \\----- -1312527342" + lineSeparator +
                "                         \\----- -1351283318" + lineSeparator, s);


        Node outNode1 = abstractBinaryTree.delete(2089894277);
        Node outNode2 = abstractBinaryTree.delete(-1312527342);
        Node outNode3 = abstractBinaryTree.delete(-771484861);
        Node outNode4 = abstractBinaryTree.delete(1337723342);
        Node outNode5 = abstractBinaryTree.delete(-800510282);
        Node outNode6 = abstractBinaryTree.delete(100);
        assertNull(abstractBinaryTree.delete(0));
        assertNull(abstractBinaryTree.delete(new Node(0, null, null, null)));
        assertNull(abstractBinaryTree.delete(new Node(null, null, null, null)));
        System.out.println();
        assertEquals(1337723342, (int) outNode1.value);
        assertEquals(-1351283318, (int) outNode2.value);
        assertEquals(-471678647, (int) outNode3.value);
        assertEquals(1469120123, (int) outNode4.value);
        assertEquals(-471678647, (int) outNode5.value);
        assertEquals(574395547, (int) outNode6.value);
        abstractBinaryTree.root = outNode6;
        assertFalse(abstractBinaryTree.contains(0));
        assertTrue(abstractBinaryTree.contains(1840062394));
        assertTrue(abstractBinaryTree.contains(1146246263));
        assertEquals(-1351283318, abstractBinaryTree.getMinimum());
        assertEquals(1840062394, abstractBinaryTree.getMaximum());
        assertEquals(13, abstractBinaryTree.getSize());
        assertEquals(1250663169, abstractBinaryTree.getSuccessor(1146246263));
    }

    @Test
    public void testAbstractBinaryTreePrint1() {
        AbstractBinaryTree abstractBinaryTree = new AbstractBinaryTree() {
            @Override
            protected Node createNode(int value, Node parent, Node left, Node right) {
                return new Node(value, parent, right, left);
            }
        };
        int[] nums = {1840062394, 2089894277, 1337723342, 1250663169, 1536921605, -168791925, 1799033711, 574395547, -1097010084, -800510282, -964146757, -1312527342, -801980735, -771484861, 1469120123, -1351283318, -471678647, 635686798, 812037701, 1146246263, 1415557923};
        abstractBinaryTree.root = abstractBinaryTree.insert(100);
        for (int i = 0; i < 20; i++) {
            abstractBinaryTree.insert(nums[i]);
        }

        GetOutPutBefore();
        abstractBinaryTree.printTreeInOrder();
        String s = GetOutPutAfter();
        try {
            GetOutPutEnd();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("-1351283318" + lineSeparator +
                "-1312527342" + lineSeparator +
                "-1097010084" + lineSeparator +
                "-964146757" + lineSeparator +
                "-801980735" + lineSeparator +
                "-800510282" + lineSeparator +
                "-771484861" + lineSeparator +
                "-471678647" + lineSeparator +
                "-168791925" + lineSeparator +
                "100" + lineSeparator +
                "574395547" + lineSeparator +
                "635686798" + lineSeparator +
                "812037701" + lineSeparator +
                "1146246263" + lineSeparator +
                "1250663169" + lineSeparator +
                "1337723342" + lineSeparator +
                "1469120123" + lineSeparator +
                "1536921605" + lineSeparator +
                "1799033711" + lineSeparator +
                "1840062394" + lineSeparator +
                "2089894277" + lineSeparator, s);
    }

    @Test
    public void testAbstractBinaryTreePrintTreePreOrder() {
        AbstractBinaryTree abstractBinaryTree = new AbstractBinaryTree() {
            @Override
            protected Node createNode(int value, Node parent, Node left, Node right) {
                return new Node(value, parent, right, left);
            }
        };
        int[] nums = {1840062394, 2089894277, 1337723342, 1250663169, 1536921605, -168791925, 1799033711, 574395547, -1097010084, -800510282, -964146757, -1312527342, -801980735, -771484861, 1469120123, -1351283318, -471678647, 635686798, 812037701, 1146246263, 1415557923};
        abstractBinaryTree.root = abstractBinaryTree.insert(100);
        for (int i = 0; i < 20; i++) {
            abstractBinaryTree.insert(nums[i]);
        }
        GetOutPutBefore();
        abstractBinaryTree.printTreePreOrder();
        String s = GetOutPutAfter();
        try {
            GetOutPutEnd();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("100" + lineSeparator +
                "-1351283318" + lineSeparator +
                "-1312527342" + lineSeparator +
                "-1097010084" + lineSeparator +
                "-964146757" + lineSeparator +
                "-801980735" + lineSeparator +
                "-800510282" + lineSeparator +
                "-771484861" + lineSeparator +
                "-471678647" + lineSeparator +
                "-168791925" + lineSeparator +
                "574395547" + lineSeparator +
                "635686798" + lineSeparator +
                "812037701" + lineSeparator +
                "1146246263" + lineSeparator +
                "1250663169" + lineSeparator +
                "1337723342" + lineSeparator +
                "1469120123" + lineSeparator +
                "1536921605" + lineSeparator +
                "1799033711" + lineSeparator +
                "1840062394" + lineSeparator +
                "2089894277" + lineSeparator, s);
    }

    @Test
    public void testAbstractBinaryTreePrintTreePostOrder() {
        AbstractBinaryTree abstractBinaryTree = new AbstractBinaryTree() {
            @Override
            protected Node createNode(int value, Node parent, Node left, Node right) {
                return new Node(value, parent, right, left);
            }
        };
        int[] nums = {1840062394, 2089894277, 1337723342, 1250663169, 1536921605, -168791925, 1799033711, 574395547, -1097010084, -800510282, -964146757, -1312527342, -801980735, -771484861, 1469120123, -1351283318, -471678647, 635686798, 812037701, 1146246263, 1415557923};
        abstractBinaryTree.root = abstractBinaryTree.insert(100);
        for (int i = 0; i < 20; i++) {
            abstractBinaryTree.insert(nums[i]);
        }
        GetOutPutBefore();
        abstractBinaryTree.printTreePostOrder();
        String s = GetOutPutAfter();
        try {
            GetOutPutEnd();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("-1351283318" + lineSeparator +
                "-1312527342" + lineSeparator +
                "-1097010084" + lineSeparator +
                "-964146757" + lineSeparator +
                "-801980735" + lineSeparator +
                "-800510282" + lineSeparator +
                "-771484861" + lineSeparator +
                "-471678647" + lineSeparator +
                "-168791925" + lineSeparator +
                "574395547" + lineSeparator +
                "635686798" + lineSeparator +
                "812037701" + lineSeparator +
                "1146246263" + lineSeparator +
                "1250663169" + lineSeparator +
                "1337723342" + lineSeparator +
                "1469120123" + lineSeparator +
                "1536921605" + lineSeparator +
                "1799033711" + lineSeparator +
                "1840062394" + lineSeparator +
                "2089894277" + lineSeparator +
                "100" + lineSeparator, s);
    }

    @Test
    public void testNode() {
        Node node1 = new Node(1, null, null, null);
        assertTrue(node1.isLeaf());
        assertEquals(32, node1.hashCode());
        Node node2 = new Node(2, node1, null, null);
        node1.right = node2;
        assertTrue(node2.isLeaf());
        assertFalse(node1.isLeaf());
        assertEquals(33, node2.hashCode());
        assertEquals(32, node1.hashCode());
        Node node3 = new Node(3, node2, null, null);
        node2.left = node3;
        assertFalse(node2.isLeaf());
        assertEquals(34, node3.hashCode());
        node1.left = new Node(4, node1, null, null);
        assertFalse(node1.isLeaf());
        Node node6 = new Node(null, null, null, null);
        assertEquals(31, node6.hashCode());

        assertTrue(node1.equals(node1));
        assertFalse(node1.equals(null));
        assertFalse(node1.equals(1));
        assertFalse(node1.equals(node6));
        assertTrue(node6.equals(new Node(null, null, null, null)));
        assertFalse(node6.equals(node1));
        assertTrue(node1.equals(new Node(1, null, null, null)));

    }

}
