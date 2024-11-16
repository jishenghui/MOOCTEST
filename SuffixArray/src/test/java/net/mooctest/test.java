package net.mooctest;

import org.junit.*;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

public class test {
/*
import org.junit.*;
import org.junit.Test;
import java.io.*;
import java.util.*;
import static org.junit.Assert.*;
*/

    //��������Ŀͨ��junit4��ܽ��е�Ԫ���ԣ�����mockito
    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    Random random = new Random();
    String lineSeparator = System.lineSeparator();//����ϵͳ���з�
    PrintStream printStream;
    /**
     * Javadocע�ͱ�ǩ�﷨��
     * ��ǩ	������	˵��
     *
     * @param ���� �Է�����ĳ������˵��
     * @return ����    �Է�������ֵ��˵��
     * @throws ���� �����׳����쳣����
     * @throws ���� �����׳����쳣����˵��
     * @author �ļ����ࡢ���ԡ�����	������������ģ������ߣ��������ʹ�ö��@author��ǩ��ʶ��java doc����ʾ������ʱ��˳�����С�
     * @version �ļ����ࡢ����	��ʶע�Ͷ���İ汾��
     * @link �ࡢ����	���ӵ�һ��Ŀ�꣬�÷�����@see���������ڣ�@link����ܹ�Ƕ�뵽ע������У�Ϊע������е�����ʻ��������ӡ�����{@link ��}
     * @see �࣬���ԣ�����	�ο�ת��������⣩
     * @since JDK�汾    �ļ�����	���ڱ�ʶ������ļ�����Ҫ��JDK������
     * @deprecated �ļ����ࡢ����	˵��������ڣ�Ӧ�ø����û����API���ĸ��·�������ˣ������ @see ��ǻ� {@link} ���ָ����API
     */

    /**
     * ��̬������
     */
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int ELEVEN = 11;
    public static final int TWELVE = 12;
    public static final int THIRTEEN = 13;
    public static final int FOURTEEN = 14;
    public static final int FIFTEEN = 15;
    public static final int SIXTEEN = 16;
    public static final int SEVENTEEN = 17;
    public static final int EIGHTEEN = 18;
    public static final int NINETEEN = 19;
    public static final int TWENTY = 20;

    // ��ȡ����ַ���
    public static String usingMath(int length) {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // ���������ַ����ĳ���
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
        // �����ַ�����ʼ�����
        StringBuffer randomString = new StringBuffer();
        // ѭ����ȡ��Ҫ����
        for (int i = 0; i < length; i++) {
            // ��ȡһ�����������Сд����ַ�
            int randomIndex = (int) (Math.random() * allCharacters.length());
            //�ַ�ƴ��
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }

    //�������̨�����ÿ����������ʹ��һ��(û�г���,���ص�)
    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        printStream = new PrintStream(outContent);
        System.setOut(printStream);
    }

    public String GetOutPutAfter() {
        return outContent.toString();//��ȡ���������
    }

    //�ر���
    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }

    //����byte����
    byte[] byteArray = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
    };

    public void file_build() throws IOException {
        // �ַ�����д
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        String writer = "123456789";
        // �ֽ�����д
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] bytes = {1, 2, 3};
        try {
            fileWriter = new FileWriter("use.txt");
            fileReader = new FileReader("use.txt");
            fileInputStream = new FileInputStream("use.txt");
            fileOutputStream = new FileOutputStream("use.txt");
            fileWriter.write(writer);
            // �ֽ���Ҫ��׼���ļ�
            File file = new File("use.txt");
            file.createNewFile();
            fileOutputStream.write(bytes);
            fileWriter.close();
            fileReader.close();
            fileInputStream.close();
            fileOutputStream.close();
            file.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    //һ������������
    class getObj {
        byte a;
        byte b;
        boolean ist;
        boolean isf;
        int num;
        int[] nums;
        String s;
        String[] strings;
        short min;
        long max;
        float f;
        double d;
        testEnum anEnum;
    }

    enum testEnum {A, B, C, D}
}
