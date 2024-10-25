package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArgumentTest {

    @Test
    public void testCompareToEqual() {
        // 测试两个参数位置相等的情况
        Argument arg1 = new Argument(1);
        Argument arg2 = new Argument(1);
        assertEquals(0, arg1.compareTo(arg2));
    }

    @Test
    public void testCompareToLessThan() {
        // 测试第一个参数位置小于第二个参数位置的情况
        Argument arg1 = new Argument(2);
        Argument arg2 = new Argument(5);
        assertTrue(arg1.compareTo(arg2) < 0);
    }

    @Test
    public void testCompareToGreaterThan() {
        // 测试第一个参数位置大于第二个参数位置的情况
        Argument arg1 = new Argument(7);
        Argument arg2 = new Argument(4);
        assertTrue(arg1.compareTo(arg2) > 0);
    }

    @Test
    public void testCompareToSamePosition() {
        // 测试两个参数位置相等的情况
        Argument arg1 = new Argument(3);
        Argument arg2 = new Argument(3);
        assertEquals(0, arg1.compareTo(arg2));
    }
}
