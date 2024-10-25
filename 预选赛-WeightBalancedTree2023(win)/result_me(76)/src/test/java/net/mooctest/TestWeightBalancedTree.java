package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestWeightBalancedTree {
//mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    Random random;

    // 获取随机字符串
    public static String usingMath(int length) {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // create a super set of all characters
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
        // initialize a string to hold result
        StringBuffer randomString = new StringBuffer();
        // loop for 10 times
        for (int i = 0; i < length; i++) {
            // generate a random number between 0 and length of all characters
            int randomIndex = (int) (Math.random() * allCharacters.length());
            // retrieve character at index and add it to result
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }

    public void GetOutPut() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.out.print("...");//收集打印
        String out = outContent.toString();//获取输出的内容
    }


    BJTree bjTree;
    CommandHandler commandHandler;

    @Before
    public void setUp() throws Exception {
        random=new Random();
        bjTree = new BJTree<String, Integer>();
        commandHandler=new CommandHandler(bjTree);
    }

    @After
    public void tearDown() throws Exception {

    }
    String lineSeparator = System.lineSeparator();

    @Test
    public void testBJTreeNull(){
        assertEquals(null,bjTree.find(1));
        assertEquals(0,bjTree.getPreorderList().size());
        assertEquals(null,bjTree.getMax());
        assertEquals(null,bjTree.getMin());
        try {
            bjTree.delete(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(null,bjTree.findDown(1));
        assertEquals(null,bjTree.findUp(1));
    }
    @Test
    public void testBJTree() {
        String lineSeparator = System.lineSeparator();
        String[] s = new String[]{"FvSjxV","9XOkCI","KVnFsM","prbBpd","tfls9z","xntaFg","54F30G","sbO0yw","PjlXS9","rlHZmg","TpOUsb","zDVCFA","XydE7M","7zPD9C","77Ay5B","27deMG","bGxUZ0","7GWasg","3uw8A1","BG3yp5",};
        Integer[] num = new Integer[]{-1583065282,-1968727437,405414709,-183921307,-1823115101,2049220831,367152768,73138360,-920482050,-911597960,-656234329,-1673773683,976244890,1720028458,-1674419715,1188041935,-242596055,-1529408570,1558147863,-1818289888,};
        try {
            for (int i = 0; i < 20; i++) {
                bjTree.insert(s[i], num[i], 0.5f);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        ArrayList<String> list=bjTree.getPreorderList();
        assertEquals("[(PjlXS9) wt: 10.0, (7GWasg) wt: 5.0, (54F30G) wt: 2.0, (3uw8A1) wt: 1.0, [27deMG 1188041935] wt: 0.5, [3uw8A1 1558147863] wt: 0.5, (77Ay5B) wt: 1.0, [54F30G 367152768] wt: 0.5, [77Ay5B -1674419715] wt: 0.5, (9XOkCI) wt: 3.0, (7zPD9C) wt: 1.0, [7GWasg -1529408570] wt: 0.5, [7zPD9C 1720028458] wt: 0.5, (FvSjxV) wt: 2.0, (BG3yp5) wt: 1.0, [9XOkCI -1968727437] wt: 0.5, [BG3yp5 -1818289888] wt: 0.5, (KVnFsM) wt: 1.0, [FvSjxV -1583065282] wt: 0.5, [KVnFsM 405414709] wt: 0.5, (rlHZmg) wt: 5.0, (XydE7M) wt: 2.5, (TpOUsb) wt: 1.0, [PjlXS9 -920482050] wt: 0.5, [TpOUsb -656234329] wt: 0.5, (bGxUZ0) wt: 1.5, [XydE7M 976244890] wt: 0.5, (prbBpd) wt: 1.0, [bGxUZ0 -242596055] wt: 0.5, [prbBpd -183921307] wt: 0.5, (tfls9z) wt: 2.5, (sbO0yw) wt: 1.0, [rlHZmg -911597960] wt: 0.5, [sbO0yw 73138360] wt: 0.5, (xntaFg) wt: 1.5, [tfls9z -1823115101] wt: 0.5, (zDVCFA) wt: 1.0, [xntaFg 2049220831] wt: 0.5, [zDVCFA -1673773683] wt: 0.5]",bjTree.getPreorderList().toString());
        System.out.println();
        assertEquals(39,list.size());
        for (int i = 0; i < 20; i++) {
            assertEquals(num[i],bjTree.find(s[i]));
            assertEquals(num[i],bjTree.findUp(s[i]));
            assertEquals(num[i],bjTree.findDown(s[i]));
        }
        assertEquals(1188041935,bjTree.getMin());
        assertEquals(-1673773683,bjTree.getMax());



        try {
            for (int i = 0; i < 20; i+=2) {
                bjTree.delete(s[i]);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        for (int i = 1; i < 20; i+=2) {
            assertEquals(num[i],bjTree.find(s[i]));
        }
        for (int i = 0; i < 20; i+=2) {
            assertEquals(null,bjTree.find(s[i]));
        }
        int[]upnum=new int[]{-183921307,-183921307,2049220831,-1529408570,-183921307,-183921307,-183921307,-1529408570,-183921307,-1529408570,};
        int[]downnum=new int[]{-1818289888,-1818289888,73138360,1188041935,-1818289888,-1818289888,-1818289888,1188041935,-1818289888,1188041935,};
        for (int i = 0; i < 10; i++) {
            assertEquals(upnum[i],(bjTree.findUp(s[i*2])));
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            assertEquals(downnum[i],(bjTree.findDown(s[i*2])));
        }
        System.out.println();
        try {
            bjTree.delete("PjlXS9");
        } catch (Exception e) {

        }
        assertEquals(null,bjTree.find("PjlXS9"));

        assertEquals("Tree structure:\r\n" +
                "  | | | [27deMG 1188041935] wt: 0.5\r\n" +
                "  | | (7GWasg) wt: 1.0\r\n" +
                "  | | | [7GWasg -1529408570] wt: 0.5\r\n" +
                "  | (7zPD9C) wt: 2.5\r\n" +
                "  | | | [7zPD9C 1720028458] wt: 0.5\r\n" +
                "  | | (9XOkCI) wt: 1.5\r\n" +
                "  | | | | [9XOkCI -1968727437] wt: 0.5\r\n" +
                "  | | | (BG3yp5) wt: 1.0\r\n" +
                "  | | | | [BG3yp5 -1818289888] wt: 0.5\r\n" +
                "  (PjlXS9) wt: 5.0\r\n" +
                "  | | | [prbBpd -183921307] wt: 0.5\r\n" +
                "  | | (rlHZmg) wt: 1.0\r\n" +
                "  | | | [rlHZmg -911597960] wt: 0.5\r\n" +
                "  | (sbO0yw) wt: 2.5\r\n" +
                "  | | | [sbO0yw 73138360] wt: 0.5\r\n" +
                "  | | (xntaFg) wt: 1.5\r\n" +
                "  | | | | [xntaFg 2049220831] wt: 0.5\r\n" +
                "  | | | (zDVCFA) wt: 1.0\r\n" +
                "  | | | | [zDVCFA -1673773683] wt: 0.5\r\n",CommandHandler.treeStructure(bjTree.getPreorderList()));
    }


    @Test
    public void test1() throws Exception {
//        InputStream is = System.in;
//        InputStream iis = new InputStream() {
//            private byte[] bits = "2024.01.01 20:23\n delete:LAX".getBytes();
//            private int index = 0;
//            @Override
//            public int read() throws IOException {
//                int clone = index++;
//                if (index > bits.length) {
//                    index = 0;
//                    return '\n';
//                }else {
//                    return bits[clone];
//                }
//            }
//        };
//        System.setIn(iis);

        assertEquals("Unexpected error encountered: null\r\n",commandHandler.processCommand("2024.01.01 20:23 delete:LAX"));
        assertEquals("ss(ccc): found []\r\n",CommandHandler.summarizeFind("ss","ccc",new Airport("ss")));
        assertEquals("ss(ccc): not found\r\n",CommandHandler.summarizeFind("ss","ccc",null));
        assertEquals("s: not found\r\n",CommandHandler.summarizeGet("s",null));
        assertEquals("s: found []\r\n",CommandHandler.summarizeGet("s",new Airport("s")));

    }

    @Test
    public void test2(){
        Point2D point2D1=new Point2D(1.5f,2.5f);
        Point2D point2D2=new Point2D(new float[]{1.5f,2.5f});
        Point2D point2D3=new Point2D(point2D1);
        assertEquals(2,Point2D.getDim());
        assertEquals(1.5f,point2D1.get(0),0.01);
        assertEquals(point2D3.get(0),point2D2.get(0),0.01);
        assertEquals(1.5f,point2D1.getX(),0.01);
        assertEquals(2.5f,point2D1.getY(),0.01);
        assertEquals(point2D2.getY(),point2D1.getY(),0.01);
        assertEquals(point2D3.getY(),point2D1.getY(),0.01);
        assertEquals("(1.5,2.5)",point2D1.toString());
    }

    @Test
    public void test3(){
        Airport airport=new Airport("tt","ss","aa","cc",1.5f,2.5f);
        assertEquals("ss",airport.getName());
        assertEquals("tt",airport.getCode());
        assertEquals("aa",airport.getCity());
        assertEquals("cc",airport.getCountry());
        assertEquals(1.5f,airport.getX(),0.01);
        assertEquals(2.5f,airport.getY(),0.01);
        assertEquals(2.5f,airport.getCoord(1),0.01);
        assertEquals(1.5f,airport.getPoint2D().getX(),0.01);
        assertEquals(2.5f,airport.getPoint2D().getY(),0.01);
        assertEquals("aa",airport.toString());
        assertEquals("aa",airport.getString(""));
        assertEquals("aa",airport.getString("default"));
        assertEquals("tt",airport.getString("code-only"));
        assertEquals("tt, ss, aa, cc, (1.5,2.5)",airport.getString("full"));
        assertEquals("ss, aa, cc, (1.5,2.5)",airport.getString("attributes"));

        assertEquals("Invalid format!",airport.getString("zz"));

    }



}