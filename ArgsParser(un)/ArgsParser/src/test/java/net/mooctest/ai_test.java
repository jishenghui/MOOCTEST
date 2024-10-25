package net.mooctest;

import java.util.*;
import java.math.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ai_test {


    ArgsParser parser;
    String[] args;



    @Test
    public void parseParameterArgument_EmptyKey_ReturnsNull() {
        parser.setArgs(args);
        assertNull(parser.parseParameterArgument(""));
    }

    @Test
    public void parseParameterArgument_ValidLongKey_ReturnsParameterArgument() {
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("d1ca123f22f44b2a832f0fc9d19a0c");
        assertEquals(args[8], out.getValue());
        assertEquals("d1ca123f22f44b2a832f0fc9d19a0c", out.getKey());
        assertEquals(7, out.getPosition());
    }

    @Test
    public void parseParameterArgument_ValidShortKey_ReturnsParameterArgument() {
        args[3] = null;
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("1");
        assertArrayEquals(args[8].substring(29, 32).toCharArray(), out.getValue().toCharArray());
        assertEquals("1", out.getKey());
        assertEquals(8, out.getPosition());
    }

    @Test
    public void parseParameterArgument_NotFound_ReturnsNull() {
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("nonexistent");
        assertNull(out);
    }

    @Test
    public void parseParameterArgument_EmptyValue_ReturnsNull() {
        args[4] = "--txt";
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("--txt");
        assertNull(out);
    }

    @Test
    public void parseParameterArgument_ShortKeyWithMultipleParameters_ReturnsCorrectValue() {
        args[3] = null;
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("d1ca123f22f44b2a832f0fc9d19a0c");
        assertArrayEquals(args[8].toCharArray(), out.getValue().toCharArray());
        assertEquals("d1ca123f22f44b2a832f0fc9d19a0c", out.getKey());
        assertEquals(7, out.getPosition());
    }

//    @Test
//    public void parseParameterArgument_NullArguments_ReturnsNull() {
//        parser.setArgs(null);
//        ParameterArgument out = parser.parseParameterArgument("d1ca123f22f44b2a832f0fc9d19a0c");
//        assertNull(out);
//    }

    @Test
    public void parseParameterArgument_EmptyArguments_ReturnsNull() {
        parser.setArgs(new String[]{});
        ParameterArgument out = parser.parseParameterArgument("d1ca123f22f44b2a832f0fc9d19a0c");
        assertNull(out);
    }

    @Test
    public void parseParameterArgument_DashArgument_ReturnsNull() {
        args[1] = "1";
        args[2] = "-";
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("-");
        assertNull(out);
    }

    @Test
    public void parseParameterArgument_DashDashArgument_ReturnsNull() {
        args[4] = "--txt";
        parser.setArgs(args);
        ParameterArgument out = parser.parseParameterArgument("--");
        assertNull(out);
    }




    @Before
    public void setUp() {
        parser = new ArgsParser();

        args = new String[]{
                "a3a74d02b14f4a57ba12db404632358e",
                "bbaacd25290a46598be6541a8822ab08",
                "b50992d469094343ade92b6170bc0059",
                "1d9b12ab66944bb6a16c60131c880edb",
                "7b9a8efbe51e4e859a1557bee1d5ffed",
                "---------------------------------",
                "",
                "--d1ca123f22f44b2a832f0fc9d19a0c",
                "-ad8430f8f2e4cd7b64c6add2fbe10fc",
                "--d75dc7abf944ebab5e18dec88a5ae0",
                "5ac59a6726d445e4baff02517166dbb1",
                "ab9f4c5c277a4a2f9df571095b948f7e",
                "3c2e5c53ee7e4e0a9f1405171ebfffac",
                "927ec0d5794a4b83aade3be286d04645",
                "-9b4dba0e2f54e178e158bc2eaa40390",
                "--d2c26fc4ab4d4c92774712bd6d6601"
        };
    }

    @Test
    public void parseSwitchArgument_LongKey_FoundAndMarked() {
        String[] args = { "--test" };
        parser.setArgs(args);
        SwitchArgument result = parser.parseSwitchArgument("test");
        assertTrue(result.isSet());
        assertEquals(0, result.position);
        assertEquals("test", result.getKey());
        assertEquals(0, parser.getArgsLeftCount());
    }

    @Test
    public void parseSwitchArgument_ShortKey_FoundAndMarked() {
        String[] args = { "-test" };
        parser.setArgs(args);
        SwitchArgument result = parser.parseSwitchArgument("t");
        assertTrue(result.isSet());
        assertEquals(0, result.position);
        assertEquals("t", result.getKey());
        assertEquals(1, parser.getArgsLeftCount());
    }

    @Test
    public void parseSwitchArgument_NotFound() {
        String[] args = { "--other" };
        parser.setArgs(args);
        SwitchArgument result = parser.parseSwitchArgument("test");
        assertFalse(result.isSet());
        assertEquals(-1, result.position);
        assertEquals("test", result.getKey());
        assertEquals(1, parser.getArgsLeftCount());
    }

    @Test
    public void parseParameterArgument_LongKey_FoundWithParameter() {
        String[] args = { "--test", "value" };
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("test");
        assertNotNull(result);
        assertEquals(0, result.position);
        assertEquals("test", result.getKey());
        assertEquals("value", result.getValue());
        assertEquals(0, parser.getArgsLeftCount());
    }

    @Test
    public void parseParameterArgument_ShortKey_FoundWithParameter() {
        String[] args = { "-test", "value" };
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("t");
        assertNotNull(result);
        assertEquals(0, result.position);
        assertEquals("t", result.getKey());
        assertEquals("est", result.getValue());
        assertEquals(1, parser.getArgsLeftCount());
    }

    @Test
    public void parseParameterArgument_NotFound() {
        String[] args = { "--other", "value" };
        parser.setArgs(args);
        ParameterArgument result = parser.parseParameterArgument("test");
        assertNull(result);
        assertEquals(2, parser.getArgsLeftCount());
    }

    @Test
    public void parseStringArgument_NoArgumentsLeft() {
        String[] args = { "value" };
        parser.setArgs(args);
        List<StringArgument> result = parser.parseStringArgument();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(0, result.get(0).position);
        assertEquals("value", result.get(0).getValue());
        assertEquals(0, parser.getArgsLeftCount());
    }

    @Test
    public void parseStringArgument_MultipleArgumentsLeft() {
        String[] args = { "value1", "value2" };
        parser.setArgs(args);
        List<StringArgument> result = parser.parseStringArgument();
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("value1", result.get(0).getValue());
        assertEquals("value2", result.get(1).getValue());
        assertEquals(0, parser.getArgsLeftCount());
    }
}
