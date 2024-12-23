package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class test {


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
        String alphabetsInUpperCase = "-qwertyuiopasdfghjklzxcvbnm";
        String alphabetsInLowerCase = ".QWERTYUIOPASDFGHJKLZXCVBNM";
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


    private CMD cmd;

    @Before
    public void setUp() throws Exception {
        cmd = new CMD();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void test1() throws CMD.OptionException {
        CMD.Option optionString = new CMD.Option.StringOption("-abc");
        CMD.Option optionInt = new CMD.Option.IntegerOption("10000");
        CMD.Option optionLong = new CMD.Option.LongOption("99999999999999999");
        CMD.Option optionBool = new CMD.Option.BooleanOption("true");
        CMD.Option optionDouble = new CMD.Option.DoubleOption("1234.5678");
        cmd.addOption(optionInt);

        CMD.Option<Integer> integerOption1 = cmd.addIntegerOption('+', "10002");
        CMD.Option<Integer> integerOption2 = cmd.addIntegerOption('-', "10002");
        CMD.Option<Integer> integerOption3 = cmd.addIntegerOption("10002");
        assertEquals(integerOption3.wantsValue(), true);
        assertEquals((int) integerOption1.getValue("10001", new Locale("9999")), 10001);
        assertEquals((int) integerOption1.parseValue("10001", new Locale("9999")), 10001);
        assertEquals(true, optionBool.parseValue("19023", new Locale("-")));
        assertEquals(true, optionBool.getValue("19023", new Locale("-")));

        CMD.Option<Boolean> aTrue = cmd.addBooleanOption("false");
        CMD.Option<Long> longOption = cmd.addLongOption("999999999999999");
        CMD.Option<String> jsiohuohui = cmd.addStringOption("jsiohuohui");
        CMD.Option optionDouble1 = cmd.addOption(optionDouble);
        CMD.Option<Boolean> aFalse = cmd.addBooleanOption('!', "false");
        assertEquals(optionDouble, optionDouble1);
        assertEquals(aTrue.getValue("true", new Locale("false")), aFalse.getValue("true", new Locale("false")));
        assertEquals(aTrue.getDefaultValue(), aFalse.getDefaultValue());
        assertNotEquals(aFalse, aTrue);
        assertEquals(cmd.addOption(optionString), optionString);
        assertEquals(cmd.getOptionValue(optionString), null);
        cmd.parse(new String[]{"-!", "10000", "99999999999999999", "true", "--", "---", "-!aaa", "-", "-1234.5678", "--1234.5678", "--10000", "-+", "--abc", "abc", "+", "1234.5678"});
        cmd.parse(new String[]{"-!", "10000", "99999999999999999", "true", "--", "---", "-!aaa", "-", "-1234.5678", "--1234.5678", "--10000", "-+", "--abc", "abc", "+", "1234.5678"});

        assertEquals(cmd.getOptionValue(aTrue), true);
        assertEquals(cmd.getOptionValue(longOption), null);
        assertEquals(cmd.getOptionValues(optionString), new ArrayList<>());
        assertEquals(cmd.getOptionValues(optionInt), new ArrayList<>());

        System.out.println();
    }

    @Test
    public void test2() throws CMD.OptionException, IOException {
        String[] user = new String[]{"933456.45.", "4458324388", "6865802690", "4584893792", "9879.6..4.", "08.542239-", "1-1-5-72.7", "43118542.2", "8259444621", "..01-31813", "82.847334.", "..74688874", "1.17928.19", "291609324.", "6-26-.2240", "6.25280.08", "67225.1866", "840944.457", "593198.012", "01.4.3-232", "3.-137-764", "-715-25685", "3295988-7.", "98.9049-5.", ".481895798", "37290600..", "-83.-81068", "0-28510501", "857198582-", "17.89.2862", "22591.4.95", "6109865107", "98.3-8647-", "239288910.", "3-062284-0", "8.62-92389", "8119982.59", "10841524-9", "7095--2293", "9359064-.3", "-02191--35", "1638084946", "5-34888678", "220--8.665", ".96347.680", "432906---7", "144.0.8054", "7588372284", "29..399-10", "4-251-.636", "1.06941155", "-3690-9480", "8104183064", "-975-89423", "-066102199", "-566721--8", "--61-13330", "50.838.056", "3413607.40", "--57494110", "97.1197270", "06727395.6", "0125.97.-7", "3979124196", ".1.6--8881", "4300837.42", "582437757-", "1.429052.4", "0-4--2524-", "6-17179545", "6.224363.8", "14187-4496", "67191825-5", "045425.965", "813121.7-0", "3.59179476", "7.9-1-7-49", "310.-51195", "68084.1091", "0671884.49", "5760943.02", "8398042980", "6.23090-59", "8824669457", "..3753567-", "4-037.-936", ".4-9083438", "3262-3.744", "005080-850", "-.58.6.082", "1.59735756", "4486.6-045", "147590056.", "0419272405", "99581-3.58", ".306004781", "2567-6-729", "-9-8.80932", "769-5244-4", "2.39924853", "69925840.4", "4429129116", "4001563816", "--.--062-2", "7326179085", ".9604423.-", "99618-6663", "05874.-352", "1-71666119", "2547432395", "64.-0137.7", "0035.60.46", "-005760783", "115-0797-4", "5047929273", "9980428475", "6966-635--", "8713-77963", "92-08.978-", "2484150.49", "1874403682", "0494465253", "42721405.3", ".50-44.12-", "218-374-66", "85.3971103", "5630.-4105", "3986-74780", "4097.745.1", "56-1119.19", "6206154510", "64.-8901-5", "5618.5994-", "95-79.-021", "8-89867047", "-2-7793911", "321702462-", "898023743-", "659.909126", ".51.400-30", "39-78079..", "6375-8669.", "0347.009-7", "1550621443", "39896-4.70", "..-59117.2", ".046.1-317", ".7155.9381", "99778.610-", "5.-5970782", "-270896.25", "6407.21656", "0960081059", "3994567732", "20627.---8", "2-36193919", ".8-40711.-", ".50522.121", "9-74983453", "47-..19-66", ".409302735", "1-88887--5", "7005.987-8", "3-822410.2", "009699-136", "11401968.-", "-12286.9-3", "07577978-.", "72..8.67.-", ".226706855", "2896079508", "905258-954", "03549820-7", "98821670-.", ".112217-36", "136487-669", "4-5-782-93", "3684-59229", "6819--.458", "-0427.5--2", "371.173613", "1393-79049", "6-2.5..179", "6.30892334", "243982-816", ".0-2.42468", "-3383.-823", "8-03-13023", "219-55.9.7", "1176137669", "2.008-7094", "789397849.", "360819770.", "1498-72554", "004116.907", "426.8881..", "881607.555", "8.05669229", "7.11566714", "6.12.54943", "42085271.9", "3658301979", "54.1927089", "09429.9569", "-77-321969", "42-2--.098", "1117295785", "--49471612", "495090.184", "6389319514", "2786584385", "1620365819", "5365177.47", "268-35-224", "-.90510095", "-92-.56059", "4710.03812", "3.9.175787", "884072829-", ".45-95993.", "0473759.12", "162078-541", ".0200-0480", "1535.3718.", ".5.2410520", "6052723387", "501.33-996", "3514216936", "43.705.67-", "738-.39753", "9155.-2975", "1-2795.394", "2-19010.97", "9575..5357", "-927226-9.", "4.32299449", "5541532293", "7726-75555", "465.39--05", "555.907452", "65384-3451", "4143.-051-", "59..368514", "69918.8805", "4067416894", "10185-3376", "5664996301", "7934.7-94.", "-484.42-75", "14077-2.26", "8620.5.15.", "9759-.48.2", "6.3.9-9242", "54-1714421", "89-212280-", "3372326906", "97-75489.8", ".6840.5144", "18772745-9", "-511536965", "3498580451", "-.32317022", "416-147.8-", "8858340--4", "0.26602203", "8.827.2913", "7161838.36", "7649048697", "9.59-58477", "8325373206", "5952786534", "69260015-.", "-2611-.063", "2686719049", "7248676151", "0549660913", "8-081-0917", ".499892090", "48358276.4", "6961--113-", "6-94245461", "08324-7236", "966316.423", "152-474995", "3306474066", "2-56164901", "940171963-", "16-2-06303", "9-81.98.57", "67560.963.", "8185800397", "88.988..70", "-263474575", "34.--31.0-", "9809214594", "05--54047-", "944901.919", "3-678174-9", "3--9648608", "6-74336267", "6.-28585.7", "3639520307", "4748217736", "-8841086-5", "78.3-51953", "21-.36-704", "6769048044", "77330924.4", "14670.9748", "2677-.856-", "68798362.5", "9180444-.1", "-420013.43", "-7601-22-6", "91.122921.", "4348436154", "1196987714", "34.3-42.8.", "-35.-73876", ".54-.85747", "3167-.9.-.", "26736.427.", "3505.280.4", "1687779600", "-4.2094.76", "-.3.3-.901", "-495008994", "4807006-09", "5958.46122", ".45.56637-", "9324202410", "264021.413", ".433143681", ".5624180.0", "3-1.7826.7", "0785812-78", "421219.629", "9392644865", "72558737.5", "997490-877", "3999140459", "690380-913", ".59710355-", "6609.7409-", "1869.93938", "54-6-56305", ".3705.68.6", "02857-1355", "21798.-1.7", "181-65-329", "-17479.588", "998.5964-8", "03-.145-97", "110.-45.75", ".4927-6132", ".5411486-0", ".22-795955", ".-3-671190", "296-308191", "494877330-", "5-6-587569", "466.141..9", "992375151-", "4.61440615", "3335876916", "4101.6-2-9", "4792551.77", "-9491-580.", "9598.7-097", "807562.767", "8091712-68", "816-668702", "54-494.146", "711-997543", "6468675814", "85961-4-82", "1.661057.5", "1---597.54", "-2-4824582", "5258338673", "77.02.0.-7", "63.923474.", "0-24.66908", "58.70965-3", "4012558670", "8172891966", "-193.76890", "-11056.61-", "46695.4.-0", "2076-4472-", "34323901-0", "-34610497.", "695.-25154", "-703.79935", "8.0698167.", "8169808544", "8890-10537", "-0.0198187", "69.137.-.3", "3444526773", "803098283-", "3244316041", "0-69.-7.24", "1567505654", "69-3587960", "822-5-7565", "60070849-7", "0-09180504", "92717806.8", "3459700425", "2-81690113", "-4783827.1", "63187-.76-", "9650738103", "55--.35602", "49.33-0672", "8829.--435", "919-486578", "...61-9099", "2496-.6149", "9790975429", "624459937-", ".088.30635", "5494346788", "506942.455", "1.-8725965", "4-01-918.3", "61.9-02761", "13.55-2710", "39.9353016", "8.82622-44", "2.9304.978", "-699944945", "785-0-4980", "-203844424", "392867981-", "0657-.197-", "28412397.1", "...90177-1", "-27662.235", "1392183564", ".5..728507", "3136497463", "1143-9753.", "96868967.9", "2759-97561", "79..-98397", "068037523-", "-376.718-6", "09884955-7", "-58-89-413", "39520860.6", "36104824-1", "9761838962", "19436839-2", "1601.80483", "09-.663.11", "2601-39829", "645.3.3981", ".723330-94", "7.50860440", "19634-..-3", "50-58-5283", "1-99949075", "47.12518.6", "2785826565", "1.01051799", "8-4408-9-5", "-047986847", "93766003--", "4890194-7-", "55851.0627", "5279227026", "4615770481", "04863750-7", "61815.0797", "692300061.", "6-150252-8", "6471725-52", "626166.-15", "99.-501457", "611413395-", "309.45721-", "97440-7903", "9735148918", "-630019174", "-668--9.85", "4-505631.7", "2556-89966", "9376188951", "1.70151224", "4-8-50476.", "54690.--32", "6..2412984", "0--292416.", "9-90805.67", "32..9.9224", "4218460--.", "0.399.3055", "2148-9324-", "6-0.602756", "3.443-426-", "76808.011-", "0332274.77", "1-57583035", "817316584-", "622-152624", "-6679945--", "130450516.", "608764480.", "5113272740", "0303.81509", "11532.5-.5", ".43-80196.", "-..388-624", "183313.936", "5934028891", "-5672..542", "450132.633", "78-2390.-5", "7-164999-9", "20-692-20-", "6563262731", ".003170465", "73.949.10.", "40589-5214", "1306689500", "2632222291", "2948-.2263", "45-.477350", "447-429778", "8.041-7.66", "4.2474638-", "5802-45915", "807470158-", "8654...84.", "90940766--", "33943.8-.2", "9953313596", "9446.9.152", "97155489.5", "90-87625.-", "09.6-.8985", "-3140859.6", "7.578024..", "-781-57539", "478.3-7.29", "00543607-2", "554327654.", ".6225-8765", "0-1498.871", "0-26384912", "9940409304", ".74408435.", "3926771699", "970.-13784", "-3905990.1", "7.4..3288.", "-703318665", "35688.9680", "904486.425", "2.63167301", "64-9-01-91", "444-16.7.3", "337-060458", "-72916.238", "656628532.", "79-.-82039", ".24--83891", "897-32439-", "-125574540", "6447270747", "16307734.4", "-5635650..", "99-39888.-", "72.0---30-", "07442-9215", "05491.683.", ".41238.5.3", "098824093.", "99087-1725", "646-27-.42", "818996328.", "7.4.-80..1", "97.965.920", "539-400654", "41-6613--.", "73419-3810", "1-40271871", "05.76347.-", "-8.299047-", "131760.2.6", "70-8868-68", "780.283.42", ".816220501", "2559191416", ".832611417", "321-077948", "0-26-8728-", "22675.10-3", "-33-7-0361", "9271083284", "9244.99863", "1315-74444", "45.50-7768", "582120-797", "663445-098", "562876524-", "786-956760", "2420194459", "-44-.32417", "03240.444.", "0.7.156557", "74-.455529", "35.57-626.", "0--3093619", "467608-723", ".532364846", "79-.12100.", "2.4.6729.6", "4626504850", "0053021.67", "075002.876", "6792286692", "508-54-070", "138.02-42.", "1464198625", "1.77.63-30", "2.1654-065", "891-7-6532", "0636.34-59", "2-06058961", "-581.11819", "420505-191", "14.4-0988-", "31-882-089", "-282795070", "4-78-5376-", "-.14-31851", "6467998435", "4184.53109", "2.57273105", "90-.723999", "15355767-7", "-960173-44", "4..0873384", "97.6.20485", "63.292989.", "9358-5164-", "05508-7367", "9.91838.47", "30-21584--", "6530-4.-85", "-392.17473", "008079143-", "367.8.7.-0", "6999391.43", "5077--9670", "-3510668.1", "94-66-4.70", ".107406334", "27-3517185", "1604731058", "1348639.17", ".1-.0502.0", "4437777-44", "21863.4--2", "20027.3896", "88.6750415", "463-75.410", "7639038427", "0870--2756", "9.5062.871", "0936051446", "6482952240", "-88-862.37", "4-2.-32.94", "9451269734", "2.32448-.9", ".624933.02", "8740613521", "8078271177", "9.2.3-8.10", "85912.522.", "9.06-20182", "3773060.14", "0047.72170", ".277099.79", "227646.94.", "0540.9-596", "2-87770819", "9-8.601935", "4.75566617", "-544735589", "4435420605", "6674098013", "1901959-7.", "5-15371-..", "285676.0--", "593301305-", "35-60-256-", "8.469.9.63", "918.--9215", "38375998-4", "99421464.3", "2298283612", ".316.29228", ".205051934", ".-6048.030", "260.823..7", "2-60185.1-", "10156902-5", "-924-94168", "7039692454", "1462.2596-", "1969487603", "980380070-", "42507.7417", "090.8.42-9", "2897928880", "25430-.465", "4834760317", "4387527838", "-888961150", "-7449-0.53", "0-3-5..29-", "826296-301", ".435783-56", "92.971.36-", "4487023496", "686-5-5501", "09497.4997", "8575.58743", "-.928--365", "648497358-", "8302-701-8", "818.391972", "678.955.7.", "2013-9202-", "91180-.512", "52314-15-4", "444.-00.65", "7520767-25", "7226.1--4.", "8851539929", "32.4467765", "0.16.76-36", "-..9810080", "2.-28990--", "80.7854126", ".1-86.73-8", ".733.58-93", "021277.973", "6538536-8.", "--1364.732", "-781--3227", "4823158-97", "56528695.4", "356-.84255", "3102753742", "243762784.", "480728..59", "0.037150-2", "123206.382", ".781808745", "18971558-2", "449-276096", ".004.29287", "3363.7-998", "-4..66.155", "4516183803", "28536-9848", "6581988667", "57224.5-.-", "6.68071240", "144-326136", "2040979618", "8784-13077", "4-496524.0", "39-41985.8", "327.1.-675", "13.34.-003", "12.70016..", "0593-450-3", "4-43414.54", "505.164599", "111153-.11", "8-87224120", "038-8456.4", ".27.5435-3", "-832-60379", "69.-111545", "04683383-7", "3-51305518", "-864277575", "--89046452", "67-5-36127", "47693.3819", "5820952654", ".980-34232", "-387937547", "66473-92.7", "8.569.7965", "8376122.94", "468-391-90", "85522.435-", "0063731912", "450-6.6507", "83097-1716", "8565102.0.", "75--598-27", "05.1832382", "-2.8536308", "847289738.", "3216666-7-", "999..064--", "8.4217.158", "186194.-22", "84-195--11", "6-65544007", "88-0238447", "86047-5548", "40292-1.83", "0-7809.411", "25716.9612", "7.-9007..2", "8-2459.45.", "036251-893", "1600604394", "02-19632-5", "12564.4406", "-015150-01", ".82603.160", "4016978999", "9614218118", "6867409636", "8036-.6213", "718-2.6803", "361066413.", "-4.3901782", "418-0602-9", "4924634-96", "6.079-77-5", "322.3-1280", "4132491383", "6039656405", "00420-.434", ".45-946159", "42.7.52191", "8.34979062", "9011997436", "..564.8890", "5.12-29451", "94-14.1949", "00712917-3", "764.082-58", "929-.839-4", "4569.64641", "9559-.35-4", "781999-973", "-167.04948", "67953.0--8", "3-81204005", ".275765273", "82914698-6", "51254.2097", "58.8-74420", "8429.20086", "211994-7.3", "6--046355-", "3.6182540-", "7.792791-0", "342.951--.", "4-80118787", "11-8906493", "9391726078", "463-93778-", "89.047.332", "2960163930", "-443-39087", "33.0891620", "007299299.", "4.08790928", "40968.0998", "79-3192-55", "859580320-", ".110408172", "5387611.07", "-0.1699344", "7..8657-86", "-9.0-.1862", "--75538356", "9094844.57", "3556.39121", "86-4.79.8.", "04.3.60997", "1-53544-71", "624.269118", "6576192971", "8388.27400", "5991-7749-", ".24-555533", ".971636143", ".33130-..1", "257502202-", "468830.--7", "01713.08.1", "6-29281157", ".---952673", "47704.6307", "29-7291454", ".477.65.-5", "--9877820.", ".175560195", "2127790471", ".037723-16", "6528556.11", "19.060226-", "55-4-05379", "14514-.644", "8792381422", "963.306776", "5-51032598", "05.7308-3.", "-178260897", "32..784298", "98.-43--4.", "3.332.5786", "8955996397", "021289914-", "35-5900-25", "85-103.5..", ".8135.5927", "9734352600", "6-69365060", "-.752-1.90", "6.57123246", "77106-5110", "6464968547", "85-9050315", "1519363943", "2621083-20", "78.58-5847", "47878-2269", "4136996599", "4540788658", ".6961-7686", "...80723-9", "-562761.68", "2.79401581", "865.-73374", "4686-51906", "909976240.", "897320.511", ".801287819", "5403-9739-", "04577874-6", "747-460443", "358-635415", "-3-608.-19", "7423251166", "3699-.544-", "56797-2.81", "08.8981196", "92-8007599", "4540-62697", "79.5551856", "90616-9134", "2501977-64", "2925903424", "39952072.4", "671-719170", "4886492820", ".620866190", "67797879-3", "-219.250.6", "27.8946384", "615195381.", "77-8452991", "-1353-8096", "24-3442270", "2892736-05", "97623462.8", "9-61.767-2", "1-051123-3", "94502.6582", "287363-17-", "58816919-1", "102-3701.2", "-765075651", "5206528282", "8724496910", "7105418136", "9520685559", "-489.6089.", "62.6-.-991", ".3-60.757.", "0790712251", "79131.3.18", "8163104825"};
        int[] numout = {21, 26, 40, 51, 53, 54, 55, 56, 59, 89, 97, 103, 112, 135, 150, 166, 179, 186, 204, 207, 214, 215, 234, 248, 259, 261, 272, 292, 303, 312, 313, 318, 324, 325, 326, 350, 367, 378, 386, 387, 391, 393, 397, 411, 432, 434, 439, 448, 450, 468, 485, 486, 507, 514, 517, 543, 545, 556, 558, 565, 570, 573, 590, 600, 610, 632, 636, 638, 644, 653, 658, 675, 693, 712, 723, 724, 733, 747, 754, 755, 769, 790, 794, 795, 800, 812, 831, 839, 860, 879, 888, 890, 891, 912, 924, 935, 948, 959, 975, 979, 989, 994};

        for (int i = 0; i < 1000; i++) {
            cmd.addOption(new CMD.Option.StringOption(user[i]));
        }

        int temp = 0;
        int[] r = {478, 478, 62, 62, 40, 40, 938, 938, 668, 668, 23, 23, 811, 811, 80, 80, 803, 803, 79, 79, 781, 781, 939, 939, 144, 144, 622, 622, 491, 491, 911, 911, 804, 804, 33, 33, 224, 224, 652, 652, 978, 978, 547, 547, 663, 663, 50, 50, 751, 751, 124, 124, 8, 8, 635, 635, 851, 851, 233, 233, 895, 895, 593, 593, 269, 269, 847, 847, 305, 305, 820, 820, 962, 962, 373, 373, 660, 660, 258, 258, 958, 958, 666, 666, 744, 744, 110, 110, 67, 67, 768, 768, 645, 645, 357, 357, 32, 32, 519, 519, 921, 921, 460, 460, 433, 433, 724, 724, 315, 315, 995, 995, 829, 829, 135, 135, 903, 903, 493, 493, 674, 674, 109, 109, 270, 270, 695, 695, 280, 280, 427, 427, 388, 388, 997, 997, 699, 699, 454, 454, 186, 186, 895, 895, 705, 705, 463, 463, 425, 425, 837, 837, 239, 239, 737, 737, 359, 359, 993, 993, 505, 505, 768, 768, 865, 865, 123, 123, 681, 681, 701, 701, 157, 157, 893, 893, 619, 619, 961, 961, 942, 942, 689, 689, 173, 173, 875, 875, 900, 900, 250, 250, 846, 846, 983, 983, 650, 650, 196, 196};

        GetOutPutBefore();
        for (int i = 0; i < 100; i++) {

            try {
                cmd.parse(new String[]{"--" + user[r[i]]});
            } catch (CMD.OptionException e) {
                System.out.print(r[i] + ",");
            }
            try {
                cmd.parse(new String[]{"-" + user[r[i]]});
            } catch (CMD.OptionException e) {
                System.out.print(r[i] + ",");
            }
        }
        String s = GetOutPutAfter();
        assertEquals(s, "478,478,478,478,62,62,62,62,40,40,40,40,938,938,938,938,668,668,668,668,23,23,23,23,811,811,811,811,80,80,80,80,803,803,803,803,79,79,79,79,781,781,781,781,939,939,939,939,144,144,144,144,622,622,622,622,491,491,491,491,911,911,911,911,804,804,804,804,33,33,33,33,224,224,224,224,652,652,652,652,978,978,978,978,547,547,547,547,663,663,663,663,50,50,50,50,751,751,751,751,124,124,124,124,8,8,8,8,635,635,635,635,851,851,851,851,233,233,233,233,895,895,895,895,593,593,593,593,269,269,269,269,847,847,847,847,305,305,305,305,820,820,820,820,962,962,962,962,373,373,373,373,660,660,660,660,258,258,258,258,958,958,958,958,666,666,666,666,744,744,744,744,110,110,110,110,67,67,67,67,768,768,768,768,645,645,645,645,357,357,357,357,32,32,32,32,519,519,519,519,");
        GetOutPutEnd();
        System.out.println();
    }

    @Test
    public void test3() throws CMD.OptionException, IOException {
        String[] user = new String[]{"false","true","-1234","1234-","-v","-","6","4","3","9","1","9","1","5","0","3","6","3","6",".","9","8","7","0","-","8","4","1",".","8","7","0","1","2","8","4",".","4","1","7","1","5","5","8","1","7",".",".","2","8","1","8","7","9","4","7","9",".","9","0","0","8","6","5","9","1","8","7","1","9","9","0","4","2","-",".","4",".","2","8","8","3","9",".","2","0","9","4","2","1","7","8","3","5","8","9","6","1","2","8","9","8","5","5","5","5","1","1","3","0","3","3","1","8","2","7","1","2","0","-",".","0","7","5","8","2","7","8","5","7","5","1","7","-","0","5","6","1","0","9","9","2",".","9","9","8","0","1","9","5","5",".","-","8",".","4",".","-","2","7","2","8","6","9","2","0","0","3","6","0","4","0","0","6","5",".","9","9","2","6","6","2","2","7","2","5","5","9",".","2","2","3","9","6","6","4","4","9","7","0","8","-",".","4","4","8","6","2","4","5","7","6","5","9","6","8","5","1",".","9","1","9","1","8","8","2","3","9","-","0","0","5","6","2","-","8","2","1","8","2","5","6","7",".","5","8","8","2","5","5","5","9","7","7","5","8",".","7","-","0",".","2","4","4","5","4","-","-","6","8","4","3","6","2","2","5","6","3","1","5","5",".","3","7","3","6","5","9","5","2","7","4","0","3","-","7",".","6",".","6","5","0","-","2","9","1","3","3","0","1","5","-","8","6","9","7","-","6","0","3","4","9","6","1","9","7","7",".","5","1","2","-",".","5","7","9","4","5","2","2","7","-","0","7","7","5","5","5","-","8","7","2","5","0","4",".","2",".","5","6","-","7","5","6",".","1","7","7","3","8","3","3","3","4","2","2","-","0","0","7","7","1","9","1","6","-","8","-","1","3","9","3","6","8","1","0","9","5","8","7",".","7","0","9","-","6","7","1",".","8","2","2","7",".","5",".","0","5","7","4","8","6","-","4","3","6",".","0","-","7","0","-","4",".","5","6","1","4","3","1","2",".",".","7","9","5","5","5","7","-","6","3","7","0","5","0","2","4","-","0","5","9","8","9","7","8","5","0","7","3","6","8","8","3","1","9",".","9",".","3","5","-","6","7","3","8","9","6","0","8","1","2","3","8","7","4","8","8","5","7","9","5",".","9","-","4","9",".","0","8","8","1","0","0","2","6","-","5",".","0","7","6","2","3","6","4","4","2","8","-","7","8","0","3","5",".","2","1","5","4",".","2","7","-","0","6","2","-","8","6","2","0","8","9","7","5","3","8","5","0","8","6","2","7","2","-","-","5","4","8","9","1",".","4","7","0","9","5","0","4","5","9","0","0","4","1","9","1",".","5","8","-","4","2","9","5",".","4","1","-","8","3","5","3","3","1","1","6","7",".","3",".","9","1","2","0","3","2","5","0",".","0","1",".","5","2","0","3","0","8","9","3","5","8","5","5","7","9","5","1","7","7","-","3","6","2","0","2","-","4","2","6","5","2",".","2","9","5","-","7",".","1",".","8","9","0","5","0","-","6","4","-","7","6","-","2","-","0","5","4","6","5","3","6","8","5","5","7","2","-","1","0","2","5","4","6","6",".","2","6","5","9","-","4","5","2","6","1","9","8","4","6","1","1","1","9","-","3","0","2","1","6","-","-","6","1","3","4","7","-",".","7","8","9","5","6","6","7","7","0","0","0","5","-","3",".","1","7","4","8","4","-",".","6","6","1","-","0","3","7","6","5",".","5","8","3","2","7","5","1",".","5","8",".","0","9","0","7","5","7","9","2","-","5",".","4",".","9","-","6","7","3","3","8","2","1","4","4","7","8","-","0","8","0","5","6","3","8","9","-","4","1","7","0","7","6","6","3",".","4","5","8","6",".",".","4","6","2","0","3","6","-","5","8","0","4","4","6","3","5","7","9","6","0","6","1","9","7","-",".","1","7","5","6","9","5","3","5",".","0","0","2","8","5","2","6","3","-","3",".","4","7","8","0","-","-",".","6","7","0",".","0","1","6","6","-","3","2","5","8","3",".","0","4","1","3","2","3","-","8","5","1","4","8","9",".","8","9","3","2","2","7","4","0","1","-","8","3","6","1","1","6","0","2","5","2","5",".","2","9","2","3","8","3","1","7","0",".","0","8","1","1","-",".","4","2","5","0","7","0","5","1","2",".","-","7","0","3",".","1",".","9","6","-","8","2","-","9","7","0","2",".","8","1","9","7","2","-",".","5","1",".","3","-","7","7","0",".","2","-","6","8","2","0","5","8","4","0","1","9"};

        int[] numout = {21, 26, 40, 51, 53, 54, 55, 56, 59, 89, 97, 103, 112, 135, 150, 166, 179, 186, 204, 207, 214, 215, 234, 248, 259, 261, 272, 292, 303, 312, 313, 318, 324, 325, 326, 350, 367, 378, 386, 387, 391, 393, 397, 411, 432, 434, 439, 448, 450, 468, 485, 486, 507, 514, 517, 543, 545, 556, 558, 565, 570, 573, 590, 600, 610, 632, 636, 638, 644, 653, 658, 675, 693, 712, 723, 724, 733, 747, 754, 755, 769, 790, 794, 795, 800, 812, 831, 839, 860, 879, 888, 890, 891, 912, 924, 935, 948, 959, 975, 979, 989, 994};

        for (int i = 0; i < 1000; i++) {
            cmd.addOption(new CMD.Option.StringOption(user[i]));
        }

        int temp = 0;
        int[] r = new int[]{58, 554, 280, 504, 500, 400, 462, 326, 812, 960, 353, 143, 971, 974, 21, 982, 970, 308, 239, 84, 46, 232, 463, 611, 275, 765, 700, 829, 715, 510, 126, 222, 486, 682, 285, 754, 119, 364, 936, 640, 280, 375, 109, 778, 492, 514, 767, 246, 809, 367, 509, 70, 459, 296, 148, 826, 393, 730, 605, 488, 291, 360, 504, 335, 50, 397, 61, 684, 968, 628, 319, 639, 864, 580, 577, 73, 144, 770, 898, 570, 386, 668, 893, 106, 363, 682, 627, 845, 560, 239, 342, 537, 122, 746, 896, 660, 893, 59, 251, 623};

        GetOutPutBefore();
        for (int i = 0; i < 100; i++) {
            try {
                cmd.parse(new String[]{"--" + user[r[i]]});
            } catch (CMD.OptionException e) {
                System.out.print(r[i] + ",");
            }
            try {
                cmd.parse(new String[]{"-" + user[r[i]]});
            } catch (CMD.OptionException e) {
                System.out.print(r[i] + ",");
            }
        }
        String s = GetOutPutAfter();
        assertEquals("58,58,554,554,280,280,504,500,500,400,400,462,462,326,326,812,812,960,960,353,353,143,143,971,971,974,974,21,21,982,982,970,970,308,308,239,239,84,84,46,46,232,232,463,463,611,611,275,275,765,765,700,700,829,829,715,715,510,510,126,126,222,222,486,486,682,682,285,285,754,754,119,364,364,936,936,640,640,280,280,375,375,109,109,778,778,492,492,514,514,767,767,246,246,809,367,367,509,509,70,70,459,459,296,296,148,148,826,826,393,393,730,730,605,605,488,488,291,291,360,504,335,335,50,50,397,397,61,61,684,684,968,968,628,628,319,319,639,639,864,864,580,580,577,577,73,73,144,144,770,770,898,570,570,386,386,668,893,893,106,106,363,363,682,682,627,627,845,845,560,560,239,239,342,342,537,537,122,122,746,746,896,896,660,660,893,893,59,59,251,251,623,623,",s);
        GetOutPutEnd();
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