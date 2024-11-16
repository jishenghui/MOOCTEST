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

    //对以上项目通过junit4框架进行单元测试，禁用mockito
    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    Random random = new Random();
    String lineSeparator = System.lineSeparator();//操作系统换行符
    PrintStream printStream;
    /**
     * Javadoc注释标签语法：
     * 标签	作用域	说明
     *
     * @param 方法 对方法中某参数的说明
     * @return 方法    对方法返回值的说明
     * @throws 方法 方法抛出的异常类型
     * @throws 方法 方法抛出的异常类型说明
     * @author 文件、类、属性、方法	标明开发该类模块的作者，多个作者使用多个@author标签标识，java doc中显示按输入时间顺序罗列。
     * @version 文件、类、方法	标识注释对象的版本号
     * @link 类、方法	链接到一个目标，用法类似@see，区别在于，@link标记能够嵌入到注释语句中，为注释语句中的特殊词汇生成连接。例如{@link …}
     * @see 类，属性，方法	参考转向（相关主题）
     * @since JDK版本    文件、类	用于标识编译该文件所需要的JDK环境。
     * @deprecated 文件、类、方法	说明对象过期，应该告诉用户这个API被哪个新方法替代了，随后用 @see 标记或 {@link} 标记指向新API
     */

    /**
     * 静态常量表
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

    // 获取随机字符串
    public static String usingMath(int length) {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // 创建所有字符串的超集
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
        // 保存字符串初始化结果
        StringBuffer randomString = new StringBuffer();
        // 循环获取需要长度
        for (int i = 0; i < length; i++) {
            // 获取一个在数字与大小写里的字符
            int randomIndex = (int) (Math.random() * allCharacters.length());
            //字符拼接
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }

    //捕获控制台输出，每个方法仅限使用一次(没有出缓,保守点)
    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        printStream = new PrintStream(outContent);
        System.setOut(printStream);
    }

    public String GetOutPutAfter() {
        return outContent.toString();//获取输出的内容
    }

    //关闭流
    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }

    //定义byte数组
    byte[] byteArray = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
    };

    public void file_build() throws IOException {
        // 字符流读写
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        String writer = "123456789";
        // 字节流读写
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] bytes = {1, 2, 3};
        try {
            fileWriter = new FileWriter("use.txt");
            fileReader = new FileReader("use.txt");
            fileInputStream = new FileInputStream("use.txt");
            fileOutputStream = new FileOutputStream("use.txt");
            fileWriter.write(writer);
            // 字节流要先准备文件
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


    //一个基础数据类
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
