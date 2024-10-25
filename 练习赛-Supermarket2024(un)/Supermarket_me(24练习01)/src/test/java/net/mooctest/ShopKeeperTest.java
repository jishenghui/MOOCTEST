package net.mooctest;

import java.util.*;
import java.math.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ShopKeeperTest {

    @Mock
    private Shop mockShop;

    @InjectMocks
    private ShopKeeper shopKeeperUnderTest;

    @Before
    public void setUp() {
        shopKeeperUnderTest=new ShopKeeper();
        shopKeeperUnderTest.setShop(new Shop());

        // No need to set up the mockShop here since @InjectMocks will handle it
    }


    @Test
    public void showAllProducts() {
        shopKeeperUnderTest.showAllProducts();
    }

    @Test
    public void sellProducts() {
        Map<String,Integer>products=new HashMap<>();
        products.put("冰红茶",1);
        products.put("电吹风",1);
        shopKeeperUnderTest.sellProducts(products);
    }

    @Test
    public void sellProducts1() {
        Map<String,Integer>products=new HashMap<>();
        products.put("nafh",1);
        products.put("电吹风",1);
        shopKeeperUnderTest.sellProducts(products);
    }
}
