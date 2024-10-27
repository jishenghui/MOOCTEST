package net.mooctest;

import org.junit.*;
import org.junit.Test;
import java.io.*;
import java.util.*;
import static org.junit.Assert.*;

public class BrainfuckTest {
    /*
    import org.junit.*;
    import org.junit.Test;
    import java.io.*;
    import java.util.*;
    import static org.junit.Assert.*;
    */
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

    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }


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




    OokEngine ookEngine;

    @Before
    public void setUp() throws Exception {
        ookEngine=new OokEngine(10);
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test(timeout = 1000)
    public void test1() throws Exception {
        File file=new File("use1.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write("jishenghui".getBytes());

        ookEngine.interpret("s");
        ookEngine.interpret(file);

        fileOutputStream.write("Ook. Ook?".getBytes());
        ookEngine.interpret(file);
        fileOutputStream.write("Ook? Ook.".getBytes());
        ookEngine.interpret(file);
        fileOutputStream.write("Ook. Ook.".getBytes());
        ookEngine.interpret(file);
        fileOutputStream.write("Ook! Ook!".getBytes());
        ookEngine.interpret(file);
        fileOutputStream.write("Ook! Ook.".getBytes());
        ookEngine.interpret(file);
//        fileOutputStream.write("Ook. Ook.Ook! Ook!Ook! Ook.Ook. Ook!".getBytes());
//        ookEngine.interpret(file);
        fileOutputStream.write("Ook. Ook.Ook! Ook!Ook! Ook.Ook! Ook?".getBytes());
        ookEngine.interpret(file);
        fileOutputStream.write("Ook? Ook!".getBytes());
        ookEngine.interpret(file);

        fileOutputStream.close();
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]",Arrays.toString(ookEngine.data));
        assertEquals(0,ookEngine.charPointer);
        assertEquals(0,ookEngine.dataPointer);
        assertEquals(0,ookEngine.columnCount);
        assertEquals("class java.io.InputStreamReader",ookEngine.consoleReader.getClass().toString());
        assertEquals(9,ookEngine.defaultTokenLength);
        assertEquals(7,ookEngine.lineCount);
        assertEquals("class java.io.PrintStream",ookEngine.outWriter.getClass().toString());
        assertEquals("class java.io.BufferedReader",ookEngine.fileReader.getClass().toString());
//        ookEngine.consoleReader.close();
//        ookEngine.fileReader.close();
//        ookEngine.outWriter.close();

        System.out.println(file.delete());
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