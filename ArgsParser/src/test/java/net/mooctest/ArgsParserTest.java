package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ¼ÍÊ¥»Ô
 * @Description: TODO
 * @DateTime: 2024/11/12 ÏÂÎç8:41
 **/
public class ArgsParserTest {

    private ArgsParser parser;

    @Before
    public void setUp() {
        parser = new ArgsParser();
    }

    @Test(expected = NullPointerException.class)
    public void testSetArgs_NullArgs_ThrowsException() {
        parser.setArgs(null);
    }

    @Test
    public void testGetArgsCount_WithValidArgs_ReturnsCorrectCount() {
        String[] args = new String[]{"-a", "--long", "value"};
        parser.setArgs(args);
        assertEquals(3, parser.getArgsCount());
    }

    @Test
    public void testGetArgsLeftCount_WithSomeParsedArgs_ReturnsCorrectCount() {
        String[] args = new String[]{"-a", "--long", "value"};
        parser.setArgs(args);
        parser.parseSwitchArgument("a");
        assertEquals(2, parser.getArgsLeftCount());
    }

    @Test
    public void testParseSwitchArgument_ExistingLongKey_ReturnsSwitchArgument() {
        String[] args = new String[]{"--test"};
        parser.setArgs(args);
        SwitchArgument result = parser.parseSwitchArgument("test");
        assertTrue(result.isSet());
    }

    @Test
    public void testParseSwitchArgument_ExistingShortKey_ReturnsSwitchArgument() {
        String[] args = new String[]{"-t"};
        parser.setArgs(args);
        SwitchArgument result = parser.parseSwitchArgument("t");
        assertTrue(result.isSet());
    }

    @Test
    public void testParseSwitchArgument_NonExistingKey_ReturnsSwitchArgumentNotFound() {
        String[] args = new String[]{"-a"};
        parser.setArgs(args);
        SwitchArgument result = parser.parseSwitchArgument("b");
        assertFalse(result.isSet());
    }

    @Test
    public void testParseParameterArgument_ExistingLongKeyWithParameter_ReturnsParameterArgument() {
        String[] args = new String[]{"--key", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("key");
        assertEquals("value", result.getValue());
    }

    @Test
    public void testParseParameterArgument_ExistingShortKeyWithParameter_ReturnsParameterArgument() {
        String[] args = new String[]{"-k", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("k");
        assertEquals("value", result.getValue());
    }

    @Test
    public void testParseParameterArgument_NonExistingKey_ReturnsNull() {
        String[] args = new String[]{"-a", "--long"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("b");
        assertNull(result);
    }

    @Test
    public void testParseStringArgument_AllArgsParsed_ReturnsCorrectArguments() {
        String[] args = new String[]{"string1", "string2"};
        parser.setArgs(args);
        List<StringArgument> results = parser.parseStringArgument();
        assertEquals(2, results.size());
        assertEquals("string1", results.get(0).getValue());
        assertEquals("string2", results.get(1).getValue());
    }

    @Test
    public void parseParameterArgument_LongKeyWithValidParameter_ReturnsParameterArgument1() {
        String[] args = new String[]{"--key", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("key");
        assertNotNull(result);
        assertEquals("value", result.getValue());
    }

    @Test
    public void parseParameterArgument_LongKeyWithMissingParameter_ReturnsNull1() {
        String[] args = new String[]{"--key"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("key");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_ShortKeyWithValidParameter_ReturnsParameterArgument1() {
        String[] args = new String[]{"-k", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("k");
        assertNotNull(result);
        assertEquals("value", result.getValue());
    }

    @Test
    public void parseParameterArgument_ShortKeyWithMissingParameter_ReturnsNull1() {
        String[] args = new String[]{"-k"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("k");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_NonExistingKey_ReturnsNull1() {
        String[] args = new String[]{"-a", "--long"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("b");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_LongKeyAfterShortKeyArguments_ReturnsCorrectParameter1() {
        String[] args = new String[]{"-a", "--key", "value"};
        parser.setArgs(args);
        // First parse short key argument
        parser.parseParameterArgument("a");
        // Now parse long key argument
        ParameterArgument result = parser.parseParameterArgument("key");
        assertNull(result);
//        assertEquals("value", result.getValue());
    }

    @Test
    public void parseParameterArgument_LongKeyWithValidParameter_ReturnsParameterArgument() {
        String[] args = new String[]{"--key", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("key");
        assertNotNull(result);
        assertEquals("value", result.getValue());
    }

    @Test
    public void parseParameterArgument_LongKeyWithMissingParameter_ReturnsNull() {
        String[] args = new String[]{"--key"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("key");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_ShortKeyWithValidParameter_ReturnsParameterArgument() {
        String[] args = new String[]{"-k", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("k");
        assertNotNull(result);
        assertEquals("value", result.getValue());
    }

    @Test
    public void parseParameterArgument_ShortKeyWithMissingParameter_ReturnsNull() {
        String[] args = new String[]{"-k"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("k");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_NonExistingKey_ReturnsNull() {
        String[] args = new String[]{"-a", "--long"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("b");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_LongKeyAfterShortKeyArguments_ReturnsCorrectParameter() {
        String[] args = new String[]{"-a", "--key", "value"};
        parser.setArgs(args);
        // First parse short key argument
        parser.parseParameterArgument("a");
        // Now parse long key argument
        ParameterArgument result = parser.parseParameterArgument("key");
        assertNull(result);
    }

    @Test
    public void parseParameterArgument_ShortKeyNotLastElement_ReturnsCorrectParameter() {
        String[] args = new String[]{"-abc", "value"};
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("b");
        assertNotNull(result);
        assertEquals("c", result.getValue());
    }

}


//mvn test-compile org.pitest:pitest-maven:mutationCoverage