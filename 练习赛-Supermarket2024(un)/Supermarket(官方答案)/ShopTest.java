/***
 * 开发者测试Supermarket题目参考答案，开发者测试无固定答案，本答案仅供参考，并非最优答案。
 */


package net.mooctest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class ShopTest {

    private Shop shop;
    private Product product1;
    private Product product2;
    private Product productTest;
    
    private ShopKeeper shopKeeper;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    
    private Product p1;
    private Product p2;

    @Before
    public void setUp() {
        shop = new Shop();
        product1 = new Product("p1", 1.00, 1);
        product2 = new Product("p2", 1.00, 10);
        productTest = new Product("矿泉水", 1.00, 1);
        shopKeeper = new ShopKeeper();
        shopKeeper.setShop(shop);
        
        p1 = new Product(1, "num1", "p1", 1.00, 1, ProductEnum.BOOK, 0.5);
        p2 = new Product("p2", 2.00, 1);
        p2.setId(2);
        p2.setPid("num2");
    }


    

    @Test
    public void testSellProduct() {
        shop.addProduct(product2);
        assertEquals(19, shop.sellProduct("p2", 1));
        try {
            shop.sellProduct("p3", 1);
          
        } catch (Exception e) {
            // Expected exception
        	System.out.println("Selling a non-existing product should throw an exception.");
        }
        try {
            shop.sellProduct("p2", 11);
        } catch (Exception e) {
            // Expected exception
        	System.out.println("Selling more than the stock should throw an exception.");
        }
        try {
            shop.sellProduct("p2", -1);
     
        } catch (Exception e) {
            // Expected exception
        	System.out.println("Selling negative quantity should throw an exception.");
        }
    }

    @Test
    public void testUpdateProduct() {
        shop.addProduct(product2);
        shop.updateProduct("p2", 2.00, 1);
        try {
            shop.updateProduct("p3", 2.00, 1);
            fail("Updating a non-existing product should throw an exception.");
        } catch (Exception e) {
            // Expected exception
        }
        shop.updateProduct("p2", 4.00, 0.5, ProductEnum.BOOK);
        try {
            shop.updateProduct("p3", 4.00, 0.5, ProductEnum.BOOK);
            fail("Updating a non-existing product should throw an exception.");
        } catch (Exception e) {
            // Expected exception
        }
    }

    @Test
    public void testGetProductByName() {
        shop.addProduct(product2);
        assertNotNull(shop.getProductByName("p2"));
        assertNull(shop.getProductByName("p3"));
    }

    @Test
    public void testMainMethod() {
        try {
            Shop shopTest = new Shop();
            shopTest.main(null);
        } catch (Error e) {
            fail("Main method should not throw an error.");
        }
    }
    
    @Test
    public void testShowAllProducts() {
        shopKeeper.showAllProducts();
        // Verify the output, for example by checking if the output contains some expected string
        // assertTrue(outContent.toString().contains("Expected output"));
    }

    @Test
    public void testSellProducts() {
        Map<String, Integer> productsToSell = new HashMap<>();
        productsToSell.put("P1", 2);
        productsToSell.put("P2", 1);
        shopKeeper.sellProducts(productsToSell);
        // Add assertions to verify the products have been sold
        // For example, check the inventory or the output

        Map<String, Integer> moreProductsToSell = new HashMap<>();
        moreProductsToSell.put("矿泉水", 10);
        moreProductsToSell.put("冰红茶", 10);
        shopKeeper.sellProducts(moreProductsToSell);
        // Add assertions to verify these products have been sold as well
    }
    
    @Test
    public void testProductInitialization() {
        assertEquals(p1.getPaymentPrice(), 0.5, 0.0001);
        assertEquals(p1.getName(), "p1");
        assertEquals(p1.getPrice(), 1.00, 0.0001);
        assertEquals(p1.getCount(), 1);
    }

    @Test
    public void testProductSettersAndGetters() {
        assertEquals(p2.getId(), 2);
        assertEquals(p2.getPid(), "num2");
        assertEquals(p1.getProductEnum().toString(), "BOOK");
        p2.setDiscount(0.5);
        assertEquals(p2.getDiscount(), 0.5, 0.0001);
    }

    @Test(expected = Exception.class)
    public void testSetNameException() throws Exception {
        p2.setName("pppppppppppppppppppp2");
    }

    @Test(expected = Exception.class)
    public void testSetPriceException() throws Exception {
        p2.setPrice(0.0001);
    }

    @Test(expected = Exception.class)
    public void testSetNegativePriceException() throws Exception {
        p2.setPrice(-0.1);
    }

    @Test(expected = Exception.class)
    public void testSetZeroPriceException() throws Exception {
        p2.setPrice(0);
    }

    @Test(expected = Exception.class)
    public void testSetCountException() throws Exception {
        p2.setCount(0);
    }

    @Test(expected = Exception.class)
    public void testSetNegativeCountException() throws Exception {
        p2.setCount(-1);
    }

    @Test(expected = Exception.class)
    public void testSetInvalidDiscountException() throws Exception {
        p2.setDiscount(-1);
    }

    @Test(expected = Exception.class)
    public void testSetZeroDiscountException() throws Exception {
        p2.setDiscount(0);
    }

    @Test(expected = Exception.class)
    public void testSetDiscountTooSmallException() throws Exception {
        p2.setDiscount(0.001);
    }

    @Test(expected = Exception.class)
    public void testSetDiscountTooLargeException() throws Exception {
        p2.setDiscount(2);
    }
    
    @Test
    public void testBookProductEnumName() {
        assertEquals("书籍", ProductEnum.BOOK.getProductEnumName());
    }

    @Test
    public void testDrinkProductEnumName() {
        assertEquals("饮料", ProductEnum.DRINK.getProductEnumName());
    }

    @Test
    public void testElectronicsProductEnumName() {
        assertEquals("电子产品", ProductEnum.ELECTRONICS.getProductEnumName());
    }
}
