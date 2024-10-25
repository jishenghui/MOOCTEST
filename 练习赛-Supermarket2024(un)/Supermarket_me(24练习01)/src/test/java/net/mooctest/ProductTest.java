package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Product productUnderTest;

    @Before
    public void setUp() {
        productUnderTest = new Product(10, "16848532", "name", 89.98, 100, ProductEnum.BOOK, 0.82);
    }

    @Test
    public void testGetPaymentPrice() {
        assertEquals(0.0, productUnderTest.getPaymentPrice(), 0.0001);
    }

    @Test
    public void testIdGetterAndSetter() {
        final int id = 0;
        productUnderTest.setId(id);
        assertEquals(id, productUnderTest.getId());
    }

    @Test
    public void testPidGetterAndSetter() {
        final String pid = "pid";
        productUnderTest.setPid(pid);
        assertEquals(pid, productUnderTest.getPid());
    }

    @Test
    public void testSetName() {
        // Setup
        // Run the test
        productUnderTest.setName("name");

        // Verify the results
    }

    @Test
    public void testSetPrice() {
        // Setup
        // Run the test
        productUnderTest.setPrice(1.0);

        // Verify the results
    }

    @Test
    public void testSetCount() {
        // Setup
        // Run the test
        productUnderTest.setCount(0);

        // Verify the results
    }

    @Test
    public void testProductEnumGetterAndSetter() {
        final ProductEnum productEnum = ProductEnum.BOOK;
        productUnderTest.setProductEnum(productEnum);
        assertEquals(productEnum, productUnderTest.getProductEnum());
    }

    @Test
    public void testSetDiscount() {
        // Setup
        // Run the test
        productUnderTest.setDiscount(0.855);

        // Verify the results
    }
    @Test
    public void testSetDiscount1() {
        // Setup
        // Run the test
        productUnderTest.setDiscount(1.855);

        // Verify the results
    }
    @Test
    public void testSetDiscount2() {
        // Setup
        // Run the test
        productUnderTest.setDiscount(-0.855);

        // Verify the results
    }



    @Test
    public void testGetInfo() {
        assertEquals("result", productUnderTest.getInfo());
    }

    @Test
    public void testGetName() {
        assertEquals("name", productUnderTest.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(0.0, productUnderTest.getPrice(), 0.0001);
    }

    @Test
    public void testGetCount() {
        assertEquals(0, productUnderTest.getCount());
    }

    @Test
    public void testGetDiscount() {
        assertEquals(0.0, productUnderTest.getDiscount(), 0.0001);
    }
}
