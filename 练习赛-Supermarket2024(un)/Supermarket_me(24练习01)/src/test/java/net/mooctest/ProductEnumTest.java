package net.mooctest;

import java.util.*;
import java.math.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductEnumTest {

    private ProductEnum book;
    private ProductEnum drink;
    private ProductEnum electronics;

    @Before
    public void setUp() {
        book = ProductEnum.BOOK;
        drink = ProductEnum.DRINK;
        electronics = ProductEnum.ELECTRONICS;
    }

    @Test
    public void testProductEnum_Book_ShouldReturnCorrectName() {
        assertEquals("书籍", book.getProductEnumName());
    }

    @Test
    public void testProductEnum_Drink_ShouldReturnCorrectName() {
        assertEquals("饮料", drink.getProductEnumName());
    }

    @Test
    public void testProductEnum_Electronics_ShouldReturnCorrectName() {
        assertEquals("电子产品", electronics.getProductEnumName());
    }
}
