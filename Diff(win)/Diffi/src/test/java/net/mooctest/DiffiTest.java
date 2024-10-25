package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;

import static org.junit.Assert.*;

public class DiffiTest {

    private Option option;
    private Diffi diffi;
    private ExtBoolArray array;
    private StringLink link;
    private StringLink stringLink;
    private int posOrig;
    private int posNew;
    private int len;
    private FileDiffPatch fileDiffPatch;
    private StringIncrementor incrementor;


    @Before
    public void setUp() throws Exception {
        option = new Option("test", "use", false, ",", "jsh");
        array = new ExtBoolArray(16);
        posOrig = 1;
        posNew = 2;
        len = 3;
        stringLink = new StringLink(posOrig, posNew, len);
        incrementor=new StringIncrementor();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBuild() {
        option = new Option("test");
        option = new Option("test", "use");
        option = new Option("test", false, "usr", "jsh");
        option = new Option("test", "use", false, "usr", "jsh");
    }

    @Test
    public void testGetBeschriebung() {
        assertEquals("use", option.getBeschriebung());
    }

    @Test
    public void testGetDelim() {
        assertEquals(",", option.getDelim());
    }

    @Test
    public void testIsHasArg() {
        assertEquals(false, option.isHasArg());
    }

    @Test
    public void testGetName() {
        assertEquals("test", option.getName());
    }

    @Test
    public void testGetDefaultv() {
        assertEquals("jsh", option.getDefaultv());
    }

    @Test
    public void testIsIsSet() {
        assertEquals(false, option.isIsSet());
    }

    @Test
    public void testGetValue() {
        try {
            option.getValue();
        } catch (RuntimeException e) {
            System.out.println("Option has no argument.");
        }
        option = new Option("test", "use", true, ",", "jsh");
        try {
            option.getValue();
        } catch (RuntimeException e) {
            System.out.println("Option is not set.");
        }
        option.parse("jsh10110");
        assertEquals("10", option.getValue());

    }

    @Test
    public void testIs() {
        assertTrue(option.is("-test_abs"));
        assertFalse(option.is("-tes_abs"));
        assertFalse(option.is(""));
        option.parse("jsh10110");
        assertFalse(option.is("-test_abs"));
        option = new Option("test", "use", true, ",", "jsh");
        assertTrue(option.is("-test,abs"));
        option.parse("jsh10110");
        assertFalse(option.is("-test,abs"));
        option = new Option("");
        assertTrue(option.is(""));
    }


    @Test
    public void testAddOption() {
        Option option1 = new Option("jsh", "use", true, ",", "un");
        Option option2 = new Option("xxs", "temp", false, ".", "cn");
        Option option3 = new Option("ssm", "no", true, "!", "sn");
        Option option4 = new Option("vue", "us", false, "@", "vn");
        Option option5 = new Option("java", "ue", true, "~", "jp");
        Option option6 = new Option("cup", "ce", false, "?", "td");

        diffi = new Diffi(option, option1, option2, option3);
        assertEquals(4, diffi.options.size());
        diffi.addOption(option4);
        diffi.addOption(option5);
        diffi.addOption(option6);
        assertEquals(7, diffi.options.size());
        String[] args = {"-java~hhh", "-java_uuu", "-xxs_nb", "jjjuub", "sxdjlkw"};
        diffi.parse(args);
        System.out.println();
        assertArrayEquals("hhh".toCharArray(), diffi.options.get(5).getValue().toCharArray());
        assertTrue(diffi.options.get(5).isIsSet());

    }

    @Test
    public void testSetTrue() {
        array.setTrue(2, 8);
        assertEquals(16 - (8 - 2) - 1, array.left());
        assertTrue(array.isFalse(0, 1));
        assertTrue(array.isFalse(9, 15));
        assertFalse(array.isFalse(1, 2));
        assertFalse(array.isFalse(2, 8));
        assertFalse(array.isFalse(8, 9));
        array.setTrue(0, 15);
        assertEquals(0, array.left());

    }


//AI编写,50变异69覆盖,做得很好,理解消化

    @Test
    public void testStringLink_Constructor_ShouldSetPropertiesCorrectly() {
        assertEquals(posOrig, stringLink.getPosOrig());
        assertEquals(posNew, stringLink.getPosNew());
        assertEquals(len, stringLink.getLen());
    }

    @Test
    public void testStringLink_ToBytes_ShouldSerializeCorrectly() {
        byte[] bytes = stringLink.toBytes();
        assertNotNull(bytes);
        assertEquals(12, bytes.length);
    }

    @Test
    public void testStringLink_FromBytes_ShouldDeserializeCorrectly() {
        byte[] bytes = stringLink.toBytes();
        StringLink deserializedLink = new StringLink(bytes);
        assertEquals(stringLink.getPosOrig(), deserializedLink.getPosOrig());
        assertEquals(stringLink.getPosNew(), deserializedLink.getPosNew());
        assertEquals(stringLink.getLen(), deserializedLink.getLen());
    }

    @Test
    public void testStringLink_ToString_ShouldFormatCorrectly() {
        String expected = "{" + len + ": " + posOrig + "-->" + posNew + "}";
        assertEquals(expected, stringLink.toString());
    }

    @Test
    public void testCreatePatch1() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        FileDiffPatch.createPatch("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt", "C", true);
        assertTrue(out.toString().startsWith("Reading file A...\r\n" +
                "Reading file B...\r\n" +
                "Looking for links...\r\n" +
                "Creating index...\r\n" +
                "Searching links..."));
        System.setOut(System.out);
    }

    @Test
    public void testCreatePatch2(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        FileDiffPatch.createPatch("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt", "C");
        assertEquals("Creating index...\r\n" +
                "Searching links...\r\n",out.toString());
        System.setOut(System.out);
    }

    @Test
    public void testDoPatch1() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        FileDiffPatch.doPatch("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt", "C", true);
        assertTrue(out.toString().startsWith("Reading file A...\r\n" +
                "Reading Patch...\r\n" +
                "0 links, 0 absolute chars (8 Bytes ^= --8Bytes)\r\n"));

        System.setOut(System.out);
    }

    @Test
    public void testDoPatch2(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        FileDiffPatch.doPatch("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt", "C");
        assertEquals("0 links, 0 absolute chars (8 Bytes ^= --8Bytes)\r\n",out.toString());
        System.setOut(System.out);
    }

    @Test
    public void testDiff1(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        RelativeString in=StringIncrementor.diff("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt");
        assertEquals("Creating index...\r\n" +
                "Searching links...\r\n",out.toString());
        assertEquals("2.txt",in.getAbsolute());
        assertEquals(1,in.linksCount());
        assertEquals(33,in.getLink(0).getLen());
        System.setOut(System.out);

    }

    @Test
    public void testDiff2(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        RelativeString in=StringIncrementor.diff("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt",true);
        assertEquals("1 links, 5 absolute chars (25 Bytes ^= -13Bytes)",in.toString());
        assertEquals("Creating index...\r\n" +
                "Searching links...\r\n" +
                "{33: 0-->0} @ 0.0%\r\n",out.toString());
        assertEquals("2.txt",in.getAbsolute());
        assertEquals(1,in.linksCount());
        assertEquals(33,in.getLink(0).getLen());
        System.setOut(System.out);
    }
    String sss;
    public void buildBigString(){
        sss=usingUUID();
        sss=sss+sss+sss+sss;
        sss=sss+sss;
        sss=sss+sss;
        sss=sss+sss;
    }
    @Test
    public void testDiff3(){
        if(sss==null){
            buildBigString();
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        RelativeString in=StringIncrementor.diff(sss.substring(0,13)+"a!!|&&!~@~$$~%~^_^^^<--+==>", sss,true);
        assertTrue(out.toString().startsWith("Creating index...\r\n" +
                "Searching links..."));
        assertEquals(32,in.linksCount());
        assertEquals(608,in.getAbsolute().length());
        System.setOut(System.out);
    }
    static String usingUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("-", "");
    }

    @Test
    public void testPatch1(){

        RelativeString in=StringIncrementor.diff("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt");
        String find=StringIncrementor.patch("src\\main\\java\\net\\mooctest\\output.txt",in);
        assertEquals("src\\main\\java\\net\\mooctest\\output2.txt",find);


    }

    @Test
    public void testPatch2(){
        RelativeString in=StringIncrementor.diff("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\mooctest\\output2.txt",true);
        assertEquals("1 links, 5 absolute chars (25 Bytes ^= -13Bytes)",in.toString());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String find=StringIncrementor.patch("src\\main\\java\\net\\mooctest\\output1.txt",in,true);
        assertEquals("src\\main\\java\\net\\mooctest\\output2.txt",find);
        assertEquals("Adding Link: {33: 0-->0}\r\n",out.toString());
        System.setOut(System.out);
    }

    @Test
    public void testPatch3(){
        if(sss==null){
            buildBigString();
        }
        RelativeString in=StringIncrementor.diff(sss.substring(0,13)+"a!!|&&!~@~$$~%~^_^^^<--+==>", sss,true);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String find=StringIncrementor.patch("src\\main\\java\\net\\mooctest\\output1.txt",in,true);
        assertEquals(1024,find.length());
        assertTrue(find.startsWith("src\\main\\java"));
        System.setOut(System.out);
    }

    @Test
    public void testPatch4(){
        RelativeString in=StringIncrementor.diff("src\\main\\java\\net\\mooctest\\output.txt", "src\\main\\java\\net\\jishenghuitianxiadiyi,hello,world");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        in.debugPrint();
        assertEquals("Debugprint: 1 links, 33 absolute chars (53 Bytes ^= --2Bytes)\r\n" +
                "(0) {18: 0-->0}\r\n" +
                "[jishenghuitianxiadiyi,hello,world]\r\n",out.toString());
        System.setOut(System.out);
    }

}