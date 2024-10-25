package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shopUnderTest;

    @Before
    public void setUp() {
        shopUnderTest = new Shop();
    }

    @Test
    public void testMain() {
        // Setup
        // Run the test
        Shop.main(new String[]{"args"});

        // Verify the results
    }

    @Test
    public void testGetAllProductsInfo() {
        assertEquals("", shopUnderTest.getAllProductsInfo());
    }

    @Test
    public void testAddProduct() {
        // Setup
        final Product product = new Product(0, "pid", "name", 5.0, 100, ProductEnum.BOOK, 1.0);

        // Run the test
        final int result = shopUnderTest.addProduct(product);

        // Verify the results
        assertEquals(5, result);
    }

    @Test
    public void testAddProduct1(){
        final int result = shopUnderTest.addProduct(new Product(1, "123456789", "电吹风", 188, 3, ProductEnum.ELECTRONICS, 1));
    }

    @Test
    public void testDeletProduct() {
        assertEquals(1, shopUnderTest.deletProduct("冰红茶"));
    }

    @Test
    public void testDeletProduct1() {
        assertEquals(1, shopUnderTest.deletProduct("no"));
    }

    @Test
    public void testSellProduct() {
        assertEquals(100-1, shopUnderTest.sellProduct("健力宝", 1));
    }
    @Test
    public void testSellProduct1() {
        assertEquals(100-1, shopUnderTest.sellProduct("no", 1));
    }
    @Test
    public void testSellProduct2() {
        assertEquals(100-1, shopUnderTest.sellProduct("健力宝", -1));
    }
    @Test
    public void testSellProduct3() {
        assertEquals(100-1, shopUnderTest.sellProduct("健力宝", 1000));
    }



    @Test
    public void testUpdateProduct1() {
        // Setup
        // Run the test
        final Product result = shopUnderTest.updateProduct("《计算机网络》", 188, 1);
        System.out.println(shopUnderTest.getAllProductsInfo());
        // Verify the results
    }



    @Test
    public void testUpdateProduct2() {
        // Setup
        // Run the test
        final Product result = shopUnderTest.updateProduct("《计算机网络》", 38.5, 0.6, ProductEnum.BOOK);

        // Verify the results
    }
    @Test
    public void testUpdateProduct3() {
        // Setup
        // Run the test
        final Product result = shopUnderTest.updateProduct("ntxo", 38.5, 0.6, ProductEnum.BOOK);

        // Verify the results
    }

    @Test
    public void testUpdateProduct4() {
        // Setup
        // Run the test
        final Product result = shopUnderTest.updateProduct("《no", 188, 1);
        System.out.println(shopUnderTest.getAllProductsInfo());
        // Verify the results
    }


    @Test
    public void testSearchProduct() {
        assertEquals(1, shopUnderTest.searchProduct("《计算机网络》"));
    }

    @Test
    public void testGetProductByName() {
        // Setup
        // Run the test
        final Product result = shopUnderTest.getProductByName("productName");

        // Verify the results
    }
    @Test
    public void testGetProductByName1() {
        // Setup
        // Run the test
        final Product result = shopUnderTest.getProductByName("健力宝");

        // Verify the results
    }
}
