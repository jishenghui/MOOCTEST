package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShopTest {

    private Shop shop;
    private ShopKeeper keeper;
    Map<String, Integer> products;
    @Before
    public void setUp() {
        shop = new Shop();
        Product product1 = new Product("icedTea", 3.5, 18);//*2=36
        Product product2 = new Product("sugarGourd", 2.5, 5);
        Product product3 = new Product("blackTea", 1.5, 200);
        Product product4 = new Product("iceCream", 4.5, 12);
        Product product5 = new Product("happyWater", 4.5, 10);//*2=20
        Product product6 = new Product("powerBank", 108, 3);//*2=6
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
        shop.addProduct(product6);
        shop.addProduct(product1);
        shop.addProduct(product5);
        shop.addProduct(product6);
        keeper=new ShopKeeper();
        keeper.setShop(shop);
        products=new TreeMap<>();
        products.put("icedTea",6);




    }


    @After
    public void tearDown() {
        shop = null;
    }

    @Test
    public void testK(){
        keeper.showAllProducts();
        keeper.sellProducts(products);
        products.put("icedTea",72);
        products.put("icedTea",-1);
        products.put("xxx",-1);
        keeper.sellProducts(products);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testP_e(){
        Product product=new Product("???",15,3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testP_e1(){
        Product product=new Product("jjjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",15,3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testP_e2(){
        Product product=new Product("jjjJ",15,-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testP_e3(){
        Product product=new Product("jjjJ",15,3);
        product.setDiscount(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testP_e4(){
        Product product=new Product("jjjJ",15,3);
        product.setDiscount(2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testP_e5(){
        Product product=new Product("jjjJ",15,3);
        product.setDiscount(0.22558);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testP_e6(){
        Product product=new Product("jjjJ",15,3);
        product.setPrice(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testP_e7(){
        Product product=new Product("jjjJ",15,3);
        product.setPrice(0.22558);
    }


    @Test(timeout = 1000)
    public void testPrint() {
        assertEquals("No.1\r\n" +
                "Name：blackTea\r\n" +
                "Price：1.50Yuan\r\n" +
                "Discount: No discount\r\n" +
                "Quantity：200\r\n" +
                "No.2\r\n" +
                "Name：sugarGourd\r\n" +
                "Price：2.50Yuan\r\n" +
                "Discount: No discount\r\n" +
                "Quantity：5\r\n" +
                "No.3\r\n" +
                "Name：icedTea\r\n" +
                "Price：3.50Yuan\r\n" +
                "Discount: No discount\r\n" +
                "Quantity：36\r\n" +
                "No.4\r\n" +
                "Name：happyWater\r\n" +
                "Price：4.50Yuan\r\n" +
                "Discount: No discount\r\n" +
                "Quantity：20\r\n" +
                "No.5\r\n" +
                "Name：iceCream\r\n" +
                "Price：4.50Yuan\r\n" +
                "Discount: No discount\r\n" +
                "Quantity：12\r\n" +
                "No.6\r\n" +
                "Name：powerBank\r\n" +
                "Price：108.00Yuan\r\n" +
                "Discount: No discount\r\n" +
                "Quantity：6\r\n", shop.getAllProductsInfo());
    }


    @Test(expected = NullPointerException.class)
    public void testDeletProduct() {
        shop.deletProduct("xxxxxxx");
    }

    @Test
    public void testDeletProduct1() {
        assertEquals("blackTea",shop.getProductByName("blackTea").name);
        assertEquals(2, shop.deletProduct("blackTea"));
    }

    @Test
    public void testSellProduct() {
        assertEquals(32, shop.sellProduct("icedTea", 4));
        try {
            shop.sellProduct("blackTea", -1);
            shop.sellProduct("blackTea", 10000);
            shop.sellProduct("xxx", 5);
        } catch (Exception e) {

        }


    }

    @Test(expected = NullPointerException.class)
    public void testSellProductNotUse1() {
        shop.sellProduct("xxx", -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSellProductNotUse2() {
        shop.sellProduct("blackTea", 10000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSellProductNotUse3() {
        shop.sellProduct("blackTea", -1);
    }

    @Test
    public void testGetAllProductsInfo() {
        shop = new Shop();
        assertEquals("", shop.getAllProductsInfo());
    }

    @Test
    public void testUpdateProduct() {
        assertEquals("blackTea",shop.updateProduct("blackTea",3.15,0.8).name);
        shop.getAllProductsInfo();
    }
    @Test(expected = NullPointerException.class)
    public void testUpdateProductNouUse() {
        shop.updateProduct("xxx",3.15,0.8);
    }

    @Test
    public void testGetProductByName() {
        assertNull(shop.getProductByName("productName"));

    }

}
