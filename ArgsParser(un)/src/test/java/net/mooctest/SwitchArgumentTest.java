package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class SwitchArgumentTest {

    @Test
    public void testConstructor() {
        // 测试构造函数
        SwitchArgument switchArgument = new SwitchArgument(1, "verbose", true);
        assertEquals(1, switchArgument.getPosition());
        assertEquals("verbose", switchArgument.getKey());
        assertTrue(switchArgument.isSet());
    }

    @Test
    public void testIsSetTrue() {
        // 测试 isSet 方法（设置为 true）
        SwitchArgument switchArgument = new SwitchArgument(1, "debug", true);
        assertTrue(switchArgument.isSet());
    }

    @Test
    public void testIsSetFalse() {
        // 测试 isSet 方法（设置为 false）
        SwitchArgument switchArgument = new SwitchArgument(1, "quiet", false);
        assertFalse(switchArgument.isSet());
    }

    @Test
    public void testInheritedMethod() {
        // 测试继承自父类的方法
        SwitchArgument switchArgument = new SwitchArgument(1, "verbose", true);
        assertEquals(1, switchArgument.getPosition());
    }
}

