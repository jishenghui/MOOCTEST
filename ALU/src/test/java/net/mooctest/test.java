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

    ALU alu;

    @Before
    public void setUp() throws Exception {
        alu=new ALU();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIntegerRepresentation(){
        int num[]=new int[]{-45775,2774,-34522,14560,1,-1};
        int length[]=new int[]{8,2,0,6,9,7};
        String[]out=new String[]{"0100110100110001","101011010110","0111100100100110","11100011100000","000000001","1111111"};
        for (int i = 0; i < 6; i++) {
            assertEquals(out[i],alu.integerRepresentation(num[i] + "", length[i]));
        }
    }

    @Test
    public void testFloatRepresentation(){
        float[]floats=new float[6];
        int[]e=new int[6];
        int[]s=new int[6];
        String[]out=new String[6];
        for (int i = 0; i < 6; i++) {
            floats=(float)(Math.random()*100000-50000);
            alu.floatRepresentation()
        }
    }
}