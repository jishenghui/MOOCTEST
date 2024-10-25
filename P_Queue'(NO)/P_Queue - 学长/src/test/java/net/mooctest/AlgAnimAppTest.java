package net.mooctest;

import static org.junit.Assert.*;

import java.awt.*;
import java.io.FileInputStream;
import java.net.URL;

import javax.swing.JFrame;

import org.junit.Test;

public class AlgAnimAppTest {

    @Test
    public void test(){
//		URL url = new URL("src/test/resources/test.txt");
//		AlgAnimApp algAnimApp = new AlgAnimApp();
//		AlgAnimFrame frame = new AlgAnimFrame(algAnimApp, url);
//		AlgThread algThread = new AlgThread(frame);
//		algAnimApp.start();

        TextFrame textFrame = new TextFrame("src/test/resources/test.txt");
        try {
            TextFrame textFrame1 = new TextFrame("src/test/resources/test.xxx");
        } catch (Exception e) {
            // TODO: handle exception
        }
        textFrame.Highlight(10);
        assertEquals(10, textFrame.highlight);

        assertEquals(14,(int) textFrame.getPreferredSize().getHeight());
        assertEquals(300,(int) textFrame.getPreferredSize().getWidth());
        System.out.println(textFrame.getMinimumSize());
        assertEquals(14,(int) textFrame.getMinimumSize().getHeight());
        assertEquals(300,(int) textFrame.getMinimumSize().getWidth());
        textFrame.setStart(1);
        assertEquals(1, textFrame.start);



    }
    @Test
    public void test1() throws Exception {

//
//		AlgAnimApp algAnimApp = new AlgAnimApp();
//		AlgAnimFrame frame = new AlgAnimFrame(algAnimApp, new URL("","111",""));
//		AlgThread algThread = new AlgThread(frame);
//		algAnimApp.start();
        ComPanel comPanel = new ComPanel("", 1);
        comPanel.setText(0, "1");
//		ControlPanel controlPanel = new ControlPanel(new AlgAnimFrame(new AlgAnimApp(), new URL("HTTP","8080","src/test/resources/test.txt")), "test.txt");
        AlgAnimApp algAnimApp = new AlgAnimApp();
        algAnimApp.fn_label = "src/test/resources/filename.txt";

        algAnimApp.homeURL = new URL("HTTP", "8080", "src/test/resources/filename1.txt");
        algAnimApp.sourceURL = new URL("HTTP", "8080", "src/test/resources/filename1.txt");
//		algAnimApp.init();


    }
    @Test
    public void test2() throws Exception {
        Node node = new Node();
        Node node1 = new Node("11",20);
        Node node2 = new Node(20);
        Node node3 = new Node("11");
        Node node4 = new Node(node1);
        Node node5 = new Node(node1,node1);
        node1.setWeight(10);
        assertEquals(10, (int)node1.getWeight());
        node1.setLabel("12");
        assertEquals("12", node1.getLabel());
        assertNull(node1.getLeftNode());
        node1.setLeftNode(node2);

        assertEquals(node2, node1.getLeftNode());
        assertNull(node1.getRightNode());
        node1.setRightNode(node2);
        assertEquals(node2, node1.getRightNode());
        assertTrue(node.isLeaf());
        node2.setLeftNode(node3);
        assertFalse(node2.isLeaf());
        node3.setRightNode(node4);
        assertFalse(node3.isLeaf());
    }
    @Test(timeout=2000)
    public void test3() throws Exception {

        Heap heap = new Heap(new DrawingPanel(),20);
        assertEquals(0, heap.heapSize());
        heap.redraw();
        heap.initHeap();
        int[] a = {1,2,3};
        heap.setInput(a);
        heap.addInput(12);
        heap.delFirstInput();
        heap.addInput(12);
//		heap.addOutput(0);
//		heap.heapArray.add(new Node());
//		heap.addOutput(1);
//		heap.heapArray.add(new Node("12",2));
//		heap.addOutput(0);
//		heap.nodeList.add(new Node("12",2));
//		heap.heapArray.add(new Node("12",2));
//		heap.moveLast2First();
//		heap.nodeList.add(new Node("122",2));
//		heap.nodeList.add(new Node("12",2));
//		heap.heapArray.add(new Node("12",2));
//		heap.moveLast2First();
//		heap.restore(1);
//		heap.restore(100);
        heap.highlight(1);
        heap.highlight(100);
        for (int i = 0; i < 10; i++) {
            heap.nodeList.add(new Node("12",i));
            heap.heapArray.add(new Node("12",i));
        }
//		heap.exchangeArrow(1, 3);
//		heap.exchangeArrow(3, 2);
//		heap.input2heap();

        heap.setHeap(new int[3]);
        heap.setHeap(new int[100]);
        assertEquals(100, heap.heapSize());
        heap.setNode(1, 2);
        ;
        assertEquals(20, heap.treeWidth(new Node("11",1)));
        Node node = new Node();
        Node node1 = new Node("11",20);
        Node node2 = new Node(20);
        node.leftNode = node1;
        heap.leftMostPosn(node);
    }
    @Test
    public void test4() throws Exception {
        URL url=new URL("http://127.0.0.1/index.html");
        AlgAnimApp algAnimApp = new AlgAnimApp();
//		AlgAnimFrame frame = new AlgAnimFrame(algAnimApp, url);
//		AlgThread algThread = new AlgThread(frame);
//		algAnimApp.start();
        ComBox comBox = new ComBox(3, 0, "", new Font("11", 1, 2));
        comBox.setText("aaa");
        comBox.setTopLeft(1, 1);
        comBox.setBackground(Color.black);
        comBox.setColor(Color.black);
//		ControlPanel controlPanel = new ControlPanel(frame, algname)
//		AlgThread algThread = new AlgThread(new AlgAnimFrame(null,null));
        TextFrame textFrame = new TextFrame("ll");
//		textFrame.update();
        LFrame lFrame = new LFrame(new Color[10], new String[10]);
        lFrame.getDropTarget();
        lFrame.getAccessibleContext();
        lFrame.getPreferredSize();
    }
}
