package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class KeyArgumentTest {

    @Test
    public void testConstructor() {
        // 测试构�?�函�?
        KeyArgument keyArgument = new ConcreteKeyArgument(1, "input");
        assertEquals(1, keyArgument.getPosition());
        assertEquals("input", keyArgument.getKey());
    }

    @Test
    public void testConstructorNullKey() {
        // 测试构�?�函数处�? null 键的情况
    	try {
    		new ConcreteKeyArgument(1, null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
        
    }

    @Test
    public void testConstructorEmptyKey() {
        // 测试构�?�函数处理空字符串键的情�?
        
        try {
        	new ConcreteKeyArgument(1, "");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
    }

    @Test
    public void testIsLongKey() {
        // 测试 isLongKey 方法
        KeyArgument shortKeyArgument = new ConcreteKeyArgument(1, "i");
        KeyArgument longKeyArgument = new ConcreteKeyArgument(2, "input");
        assertFalse(shortKeyArgument.isLongKey());
        assertTrue(longKeyArgument.isLongKey());
    }

    @Test
    public void testGetKey() {
        // 测试 getKey 方法
        KeyArgument keyArgument = new ConcreteKeyArgument(1, "output");
        assertEquals("output", keyArgument.getKey());
    }

    // 具体�? KeyArgument 子类，用于测�?
    private static class ConcreteKeyArgument extends KeyArgument {
        public ConcreteKeyArgument(int position, String key) {
            super(position, key);
        }
    }
}
