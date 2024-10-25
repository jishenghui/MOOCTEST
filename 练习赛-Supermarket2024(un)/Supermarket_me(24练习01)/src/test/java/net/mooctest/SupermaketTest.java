package net.mooctest;

import org.junit.Test;

import org.junit.Before;

import java.util.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//@RunWith(MockitoJUnitRunner.class)

public class SupermaketTest {

    Shop shop;
    @Before
    public void setUp() throws Exception {
        shop=new Shop();
    }


    @Test
    public void test1(){
        Shop.main(new String[]{"args"});
    }

    @Test
    public void test2(){
        shop.deletProduct("矿泉水");
        shop.deletProduct("冰红茶");
        shop.deletProduct("健力宝");
        shop.deletProduct("《计算机网络》");
        shop.deletProduct("电吹风");
        assertEquals("",shop.getAllProductsInfo());
        shop.addProduct(new Product("aaa",12.5,3));
        shop.addProduct(new Product("bbb",12.5,3));
        shop.getAllProductsInfo();
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "123456789", "电吹风", 188, 3, ProductEnum.ELECTRONICS, 1);
        Product product2 = new Product(2, "23456789", "《计算机网络》", 18, 10, ProductEnum.BOOK, 0.8);
        Product product3 = new Product(3, "3456789", "矿泉水", 2, 100, ProductEnum.DRINK, 1);
        Product product4 = new Product(4, "456789", "冰红茶", 3, 100, ProductEnum.DRINK, 1);
        Product product5 = new Product(5, "56789", "健力宝", 4, 100, ProductEnum.DRINK, 1);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        for(Product product:products){
            shop.addProduct(product);
        }
        shop.addProduct(new Product("bbb",22.5,3));
        assertEquals(22.5,shop.getProductByName("bbb").price,0.01);
    }
    @Test(expected = NullPointerException.class)
    public void test3(){
        shop.deletProduct("");
    }
    @Test
    public void test4(){
        ArrayList list= (ArrayList) Shop.getProducts();
        assertEquals(3,shop.getProductByName("矿泉水").id);
        assertEquals(null,shop.getProductByName("xx"));

    }
    @Test(expected = NullPointerException.class)
    public void test5(){
        shop.sellProduct("xx",1);

    }
    @Test(expected = IllegalArgumentException.class)
    public void test6(){
        shop.sellProduct("冰红茶",-1);
        shop.sellProduct("冰红茶",-1);
    }
    @Test
    public void test7(){

    }
    @Test
    public void test8(){

    }
    @Test
    public void test9(){

    }
    @Test
    public void test10(){

    }
    @Test
    public void test11(){

    }
    @Test
    public void test12(){

    }

}
