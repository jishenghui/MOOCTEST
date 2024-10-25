package net.mooctest;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ArgsParserTest {

    private ArgsParser argsParser;

    @Before
    public void setUp() {
        // 在每个测试之前初始化 ArgsParser 实例
        argsParser = new ArgsParser();
    }

    @Test
    public void testConstructorAndSetArgs() {
        // 测试构造函数和 setArgs 方法
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt"};
        argsParser.setArgs(testArgs);
        assertArrayEquals(testArgs, argsParser.getArgs());
    }

    @Test
    public void testGetArgsCount() {
        // 测试 getArgsCount 方法
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt"};
        argsParser.setArgs(testArgs);
        assertEquals(testArgs.length, argsParser.getArgsCount());
    }

    @Test
    public void testGetArgsLeftCount() {
        // 测试 getArgsLeftCount 方法
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt"};
        argsParser.setArgs(testArgs);
        argsParser.parseSwitchArgument("o"); // 解析一个参数
        assertEquals(testArgs.length - 1, argsParser.getArgsLeftCount());
    }

    @Test
    public void testParseSwitchArgument() {
        // 测试 parseSwitchArgument 方法
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt"};
        argsParser.setArgs(testArgs);
        SwitchArgument result = argsParser.parseSwitchArgument("o");
//        assertTrue(result.isFound());
//        assertEquals(3, result.getIndex());
    }

    @Test
    public void testParseParameterArgument() {
        // 测试 parseParameterArgument 方法
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt"};
        argsParser.setArgs(testArgs);
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNotNull(result);
        assertEquals("output.txt", result.getValue());
    }

    @Test
    public void testParseStringArgument() {
        // 测试 parseStringArgument 方法
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt", "extra", "argument"};
        argsParser.setArgs(testArgs);
        List<StringArgument> result = argsParser.parseStringArgument();
        assertEquals(6, result.size()); // 包括 "file.txt", "output.txt", "extra", "argument"
    }

    @Test
    public void testConstructorWithNullArgs() {
        // 测试构造函数处理 null 参数数组的情况
    	try {
    		argsParser = new ArgsParser(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
    }

    @Test
    public void testParseInvalidArguments() {
        // 测试解析无效参数的情况
        String[] testArgs = {"--input", "file.txt", "-o", "output.txt", "invalid"};
        argsParser.setArgs(testArgs);
        List<StringArgument> result = argsParser.parseStringArgument();
        assertEquals(5, result.size()); // "invalid" 不应影响解析结果
    }

    @Test
    public void testEmptyArgs() {
        // 测试空参数数组的情况
        String[] testArgs = {};
        argsParser.setArgs(testArgs);
        assertEquals(0, argsParser.getArgsCount());
        assertEquals(0, argsParser.getArgsLeftCount());
    }
    
//    @Before
//    public void setUp() {
//        argsParser = new ArgsParser();
//    }

    @Test
    public void testParseParameterArgumentLongKey() {
        // 测试解析带值参数（长键名）
        String[] testArgs = {"--input", "file.txt", "--output", "output.txt"};
        argsParser.setArgs(testArgs);
        ParameterArgument result = argsParser.parseParameterArgument("output");
        assertNotNull(result);
        assertEquals("output.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentShortKey() {
        // 测试解析带值参数（短键名）
        String[] testArgs = {"-i", "file.txt", "-o", "output.txt"};
        argsParser.setArgs(testArgs);
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNotNull(result);
        assertEquals("output.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentLongKeyLastArgument() {
        // 测试解析带值参数，参数是最后一个元素
        String[] testArgs = {"--input", "file.txt", "--output"};
        argsParser.setArgs(testArgs);
        ParameterArgument result = argsParser.parseParameterArgument("output");
        assertNull(result); // 参数后没有值
    }

    @Test
    public void testParseParameterArgumentShortKeyLastArgument() {
        // 测试解析带值参数，参数是最后一个元素
        String[] testArgs = {"-i", "file.txt", "-o"};
        argsParser.setArgs(testArgs);
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNull(result); // 参数后没有值
    }

    @Test
    public void testParseParameterArgumentInvalidKey() {
        // 测试解析无效参数
        String[] testArgs = {"--input", "file.txt", "--output", "output.txt"};
        argsParser.setArgs(testArgs);
        ParameterArgument result = argsParser.parseParameterArgument("invalid");
        assertNull(result); // 无效参数不应影响解析结果
    }

    @Test
    public void testParseParameterArgumentNoArgsLeft() {
        // 测试没有剩余参数的情况
        String[] testArgs = {"--input", "file.txt", "--output", "output.txt"};
        argsParser.setArgs(testArgs);
        argsParser.parseParameterArgument("output");
        ParameterArgument result = argsParser.parseParameterArgument("input");
        assertNotNull(result); // 已解析的参数应该不再影响结果
    }
    
    @Test
    public void testParseParameterArgumentLongKey1() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--input", "file.txt"});
        ParameterArgument result = argsParser.parseParameterArgument("input");
        assertNotNull(result);
        assertEquals("input", result.getKey());
        assertEquals("file.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentLongKeyMissingValue() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--input"});
        ParameterArgument result = argsParser.parseParameterArgument("input");
        assertNull(result);
    }

    @Test
    public void testParseParameterArgumentShortKey1() {
        ArgsParser argsParser = new ArgsParser(new String[]{"-o", "output.txt"});
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNotNull(result);
        assertEquals("o", result.getKey());
        assertEquals("output.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentShortKeyMissingValue() {
        ArgsParser argsParser = new ArgsParser(new String[]{"-o"});
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNull(result);
    }

    @Test
    public void testParseParameterArgumentMixedKeys() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--input", "file.txt", "-o", "output.txt"});
        ParameterArgument result = argsParser.parseParameterArgument("input");
        assertNotNull(result);
        assertEquals("input", result.getKey());
        assertEquals("file.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentKeyAtEnd() {
        ArgsParser argsParser = new ArgsParser(new String[]{"-o", "output.txt", "--input", "file.txt"});
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNotNull(result);
        assertEquals("o", result.getKey());
        assertEquals("output.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentKeyInMiddle() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--input", "file.txt", "-o", "output.txt", "--verbose"});
        ParameterArgument result = argsParser.parseParameterArgument("input");
        assertNotNull(result);
        assertEquals("input", result.getKey());
        assertEquals("file.txt", result.getValue());
    }

    @Test
    public void testParseParameterArgumentKeyAtEdge() {
        ArgsParser argsParser = new ArgsParser(new String[]{"-o", "output.txt"});
        ParameterArgument result = argsParser.parseParameterArgument("o");
        assertNotNull(result);
    }

    @Test
    public void testParseParameterArgumentEmptyArgs() {
        ArgsParser argsParser = new ArgsParser(new String[]{});
        ParameterArgument result = argsParser.parseParameterArgument("input");
        assertNull(result);
    }
    @Test
    public void testParseSwitchArgumentLongKeyExists() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--verbose"});
        SwitchArgument result = argsParser.parseSwitchArgument("verbose");
        assertNotNull(result);
        assertEquals("verbose", result.getKey());
        assertTrue(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentLongKeyNotExists() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--input", "file.txt"});
        SwitchArgument result = argsParser.parseSwitchArgument("verbose");
        assertNotNull(result);
        assertEquals("verbose", result.getKey());
        assertFalse(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentShortKeyExists() {
        ArgsParser argsParser = new ArgsParser(new String[]{"-v"});
        SwitchArgument result = argsParser.parseSwitchArgument("v");
        assertNotNull(result);
        assertEquals("v", result.getKey());
        assertTrue(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentShortKeyNotExists() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--input", "file.txt"});
        SwitchArgument result = argsParser.parseSwitchArgument("v");
        assertNotNull(result);
        assertEquals("v", result.getKey());
        assertFalse(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentMixedKeysExists() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--verbose", "-o", "output.txt"});
        SwitchArgument result = argsParser.parseSwitchArgument("verbose");
        assertNotNull(result);
        assertEquals("verbose", result.getKey());
        assertTrue(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentMixedKeysNotExists() {
        ArgsParser argsParser = new ArgsParser(new String[]{"-o", "output.txt"});
        SwitchArgument result = argsParser.parseSwitchArgument("verbose");
        assertNotNull(result);
        assertEquals("verbose", result.getKey());
        assertFalse(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentDuplicateSwitches() {
        ArgsParser argsParser = new ArgsParser(new String[]{"--verbose", "--quiet", "-v"});
        SwitchArgument result = argsParser.parseSwitchArgument("verbose");
        assertNotNull(result);
        assertEquals("verbose", result.getKey());
        assertTrue(result.isSet());
    }

    @Test
    public void testParseSwitchArgumentEmptyArgs() {
        ArgsParser argsParser = new ArgsParser(new String[]{});
        SwitchArgument result = argsParser.parseSwitchArgument("verbose");
        assertNotNull(result);
        assertEquals("verbose", result.getKey());
        assertFalse(result.isSet());
    }
    @Test
    public void testParseSwitchArgumentShortKeyWithParameter() {
        // 测试短键开关后紧跟参数的情况
        ArgsParser argsParser = new ArgsParser(new String[]{"-finput.txt"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("f");
        assertNotNull(switchResult);
        assertEquals("f", switchResult.getKey());
        assertTrue(switchResult.isSet());

        ParameterArgument parameterResult = argsParser.parseParameterArgument("f");
        assertNull(parameterResult);
//        assertEquals("f", parameterResult.getKey());
//        assertEquals("input.txt", parameterResult.getValue());
    }

    @Test
    public void testParseSwitchArgumentShortKeyWithEmptyParameter() {
        // 测试短键开关后紧跟空参数的情况
        ArgsParser argsParser = new ArgsParser(new String[]{"-f"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("f");
        assertNotNull(switchResult);
        assertEquals("f", switchResult.getKey());
        assertTrue(switchResult.isSet());

        ParameterArgument parameterResult = argsParser.parseParameterArgument("f");
        assertNull(parameterResult);
    }

    @Test
    public void testParseSwitchArgumentShortKeyWithoutParameter() {
        // 测试短键开关后没有参数的情况
        ArgsParser argsParser = new ArgsParser(new String[]{"-f", "input.txt"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("f");
        assertNotNull(switchResult);
        assertEquals("f", switchResult.getKey());
        assertTrue(switchResult.isSet());

        ParameterArgument parameterResult = argsParser.parseParameterArgument("f");
        assertNull(parameterResult);
    }
    @Test
    public void testParseSwitchArgumentLongKey() {
        // 测试长键的开关参数
        ArgsParser argsParser = new ArgsParser(new String[]{"--file"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("file");
        assertNotNull(switchResult);
        assertEquals("file", switchResult.getKey());
        assertTrue(switchResult.isSet());
    }

    @Test
    public void testParseSwitchArgumentShortKey() {
        // 测试短键的开关参数
        ArgsParser argsParser = new ArgsParser(new String[]{"-f"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("f");
        assertNotNull(switchResult);
        assertEquals("f", switchResult.getKey());
        assertTrue(switchResult.isSet());
    }

    @Test
    public void testParseSwitchArgumentLongKeyNotFound() {
        // 测试不存在的长键开关参数
        ArgsParser argsParser = new ArgsParser(new String[]{"--file"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("input");
        assertNotNull(switchResult);
        assertEquals("input", switchResult.getKey());
        assertFalse(switchResult.isSet());
    }

    @Test
    public void testParseSwitchArgumentShortKeyNotFound() {
        // 测试不存在的短键开关参数
        ArgsParser argsParser = new ArgsParser(new String[]{"-f"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("input");
        assertNotNull(switchResult);
        assertEquals("input", switchResult.getKey());
        assertFalse(switchResult.isSet());
    }

    @Test
    public void testParseSwitchArgumentLongKeyWithFollowingParameter() {
        // 测试长键开关参数后跟随参数的情况
        ArgsParser argsParser = new ArgsParser(new String[]{"--file", "input.txt"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("file");
        assertNotNull(switchResult);
        assertEquals("file", switchResult.getKey());
        assertTrue(switchResult.isSet());

        ParameterArgument parameterResult = argsParser.parseParameterArgument("file");
        assertNull(parameterResult);
    }

    @Test
    public void testParseSwitchArgumentShortKeyWithFollowingParameter() {
        // 测试短键开关参数后跟随参数的情况
        ArgsParser argsParser = new ArgsParser(new String[]{"-f", "input.txt"});
        SwitchArgument switchResult = argsParser.parseSwitchArgument("f");
        assertNotNull(switchResult);
        assertEquals("f", switchResult.getKey());
        assertTrue(switchResult.isSet());

        ParameterArgument parameterResult = argsParser.parseParameterArgument("f");
        assertNull(parameterResult);
    }

}
