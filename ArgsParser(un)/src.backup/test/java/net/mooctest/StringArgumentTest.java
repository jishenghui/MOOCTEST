package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringArgumentTest {

    @Test
    public void testConstructor() {
        // 测试构�?�函�?
        StringArgument stringArgument = new StringArgument(1, "file.txt");
        assertEquals(1, stringArgument.getPosition());
        assertEquals("file.txt", stringArgument.getValue());
    }

    @Test
    public void testConstructorNullValue() {
    	try {
    		new StringArgument(1, null);
		} catch (Exception e) {
			// TODO: handle exception
		}
        // 测试构�?�函数处�? null 值的情况
        
    }

    @Test
    public void testGetValue() {
        // 测试 getValue 方法
        StringArgument stringArgument = new StringArgument(1, "result.txt");
        assertEquals("result.txt", stringArgument.getValue());
    }

    @Test
    public void testInheritedMethod() {
        // 测试继承自父类的方法
        StringArgument stringArgument = new StringArgument(1, "output.txt");
        assertEquals(1, stringArgument.getPosition());
    }
}
