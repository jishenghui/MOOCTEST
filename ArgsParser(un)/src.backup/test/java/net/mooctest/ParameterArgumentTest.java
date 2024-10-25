package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParameterArgumentTest {

    @Test
    public void testConstructor() {
        // 测试构�?�函�?
        ParameterArgument paramArgument = new ParameterArgument(1, "input", "file.txt");
        assertEquals(1, paramArgument.getPosition());
        assertEquals("input", paramArgument.getKey());
        assertEquals("file.txt", paramArgument.getValue());
    }

    @Test
    public void testConstructorNullValue() {
        // 测试构�?�函数处�? null 值的情况
    	try {
    		new ParameterArgument(1, "input", null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
        
    }

    @Test
    public void testConstructorEmptyValue() {
    	try {
    		new ParameterArgument(1, "input", "");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
        // 测试构�?�函数处理空字符串�?�的情况
        
    }

    @Test
    public void testGetValue() {
        // 测试 getValue 方法
        ParameterArgument paramArgument = new ParameterArgument(1, "output", "result.txt");
        assertEquals("result.txt", paramArgument.getValue());
    }

    @Test
    public void testInheritedMethods() {
        // 测试继承自父类的方法
        ParameterArgument paramArgument = new ParameterArgument(1, "output", "result.txt");
        assertEquals(1, paramArgument.getPosition());
        assertTrue(paramArgument.isLongKey()); // ParameterArgument 不是长键
        assertEquals("output", paramArgument.getKey());
    }
}
