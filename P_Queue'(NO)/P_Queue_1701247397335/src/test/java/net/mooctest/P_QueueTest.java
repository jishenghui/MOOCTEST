package net.mooctest;

import org.junit.*;

import java.io.*;
import java.util.*;

public class P_QueueTest {
    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    Random random;
    String lineSeparator = System.lineSeparator();//����ϵͳ���з�

    // ��ȡ����ַ���
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

    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    public String GetOutPutAfter() {
        return outContent.toString();//��ȡ���������
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    /**
     * ����AlgAnimApp���в���
     */
    @Test
    public void testAlgAnimApp(){
        AlgAnimApp algAnimApp=new AlgAnimApp();

    }
}