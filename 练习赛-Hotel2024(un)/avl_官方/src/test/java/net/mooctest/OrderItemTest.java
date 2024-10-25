package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderItemTest {

    @Test
    public void testPrintOrderItem() {
        final OrderItem orderItemUnderTest = new OrderItem("name", 0.0, 0);
        assertEquals(orderItemUnderTest.getProductName() + "\t"
                + orderItemUnderTest.formatDouble(orderItemUnderTest.getPaymentPrice()) + "\t"
                + orderItemUnderTest.getCount() + "\t"
                + orderItemUnderTest.formatDouble(orderItemUnderTest.getPaymentPrice() * orderItemUnderTest.getCount()), orderItemUnderTest.PrintOrderItem());

    }

//    @Test
//    public void sout(){
//        final OrderItem orderItemUnderTest = new OrderItem("name", 0.0, 0);
//        assertEquals(orderItemUnderTest.getProductName() + "\t"
//                + orderItemUnderTest.formatDouble(orderItemUnderTest.getPaymentPrice()) + "\t"
//                + orderItemUnderTest.getCount() + "\t"
//                + orderItemUnderTest.formatDouble(orderItemUnderTest.getPaymentPrice() * orderItemUnderTest.getCount()), orderItemUnderTest.PrintOrderItem());
//        System.out.println(orderItemUnderTest.PrintOrderItem());
//    }


    @Test
    public void testProductNameGetterAndSetter() {
        final OrderItem orderItemUnderTest = new OrderItem("name", 0.0, 0);
        final String productName = "name";
        orderItemUnderTest.setProductName(productName);
        assertEquals(productName, orderItemUnderTest.getProductName());
    }

    @Test
    public void testPaymentPriceGetterAndSetter() {
        final OrderItem orderItemUnderTest = new OrderItem("name", 0.0, 0);
        final double paymentPrice = 0.0;
        orderItemUnderTest.setPaymentPrice(paymentPrice);
        assertEquals(paymentPrice, orderItemUnderTest.getPaymentPrice(), 0.0001);
    }

    @Test
    public void testCountGetterAndSetter() {
        final OrderItem orderItemUnderTest = new OrderItem("name", 0.0, 0);
        final int count = 0;
        orderItemUnderTest.setCount(count);
        assertEquals(count, orderItemUnderTest.getCount());
    }

    @Test
    public void testGetAmount() {
        final OrderItem orderItemUnderTest = new OrderItem("name", 0.0, 0);
        assertEquals(0.0, orderItemUnderTest.getAmount(), 0.0001);
    }

    @Test
    public void testFormatDouble() {
        assertEquals(".00", OrderItem.formatDouble(0.0));
    }

}
