package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {

//    private Order orderUnderTest;

    /**
     * 输入输出捕获
     */
    static ByteArrayOutputStream byteout= new ByteArrayOutputStream(2048);
    static PrintStream printStream=new PrintStream(byteout);
    static PrintStream oldprint=System.out;
    static String ln;



    @Before
    public void setUp() {
//        System.setOut(printStream);
////        Order.printOrders();
//        System.out.println();
//        ln=byteout.toString();
//        System.setOut(oldprint);
//        Order orderUnderTest = new Order(new ArrayList<>());
        byteout= new ByteArrayOutputStream(2048);
        printStream=new PrintStream(byteout);
        oldprint=System.out;


    }

    @Test
    public void testItemsGetterAndSetter() {
        Order orderUnderTest = new Order(new ArrayList<>());
        List<OrderItem> items = new ArrayList<>();
        orderUnderTest.setItems(items);
        assertEquals(items, orderUnderTest.getItems());
    }

    @Test
    public void testTotalAmount() {
        Order orderUnderTest = new Order(new ArrayList<>());
        assertEquals(0.0, orderUnderTest.totalAmount(), 0.0001);
    }

    @Test
    public void testCreateOrder() {
        // Setup
        final List<OrderItem> orderItems = Arrays.asList(new OrderItem("name", 0.0, 0));

        // Run the test
        Order.createOrder(orderItems);


        // Verify the results
    }

    @Test
    public void testCreateOrder1() {
        // Setup
        final List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("电吹风", 501, 1));

//        orderItems.add()
        // Run the test
        Order.createOrder(orderItems);

        orderItems.add(new OrderItem("电吹风", 1000, 1));
        Order.createOrder(orderItems);

        // Verify the results
    }

    @Test
    public void testPrintOrders() {
        // Setup
        // Run the test
        System.setOut(printStream);
        Order.printOrders();
//        System.out.println();
        String outString=byteout.toString();
        System.setOut(oldprint);
//        assertTrue(outString.equals("AllAsmount: .00"));
//        assertEquals("AllAsmount: .00", outString);
//        assertEquals(outString,"AllAmount: .00");
        assertEquals(outString,"Order No.1\r\n" +
                "电吹风\t360.72\t1\t360.72\r\n" +
                "电吹风\t800.00\t1\t800.00\r\n" +
                "Order Total:1160.72\r\n" +
                "\r\n" +
                "Order No.2\r\n" +
                "电吹风\t360.72\t1\t360.72\r\n" +
                "电吹风\t800.00\t1\t800.00\r\n" +
                "Order Total:1160.72\r\n" +
                "\r\n" +
                "Order No.3\r\n" +
                "name\t.00\t0\t.00\r\n" +
                "Order Total:.00\r\n" +
                "\r\n" +
                "AllAmount: 2321.44\r\n");
//        System.out.println(outString.equals("AllAsmount: .00"));
//        System.out.println(outString);
//        assertEquals(ln,outString);
        // Verify the results
    }

    @Test
    public void testSearchMaxOrder() {
        Order order=new Order(new ArrayList<>());
        List<OrderItem> list=new ArrayList();
        list.add(new OrderItem("name", 0.0, 0));
        list.add(new OrderItem("name", 0.0, 0));
        list.add(new OrderItem("name", 0.0, 0));

        List<OrderItem> list1=new ArrayList();
        list1.add(new OrderItem("name", 3.0, 1));
        list1.add(new OrderItem("fename", 1009.0, 5));
        list1.add(new OrderItem("namdee", 1.1, 0));

        order.orders.add(new Order(list));
        order.orders.add(new Order(list1));
        order.orders.add(new Order(list));
        order.orders.add(new Order(list1));
        order.orders.add(new Order(list));
        order.orders.add(new Order(list1));
        // Run the test
        final Order result = order.searchMaxOrder();
        assertEquals(3.0*1+1009.0*5+1.1*0, result.totalAmount(), 0.01);
//        assertEquals(Arrays.asList(new OrderItem("name", 0.0, 0)), result.getItems());
    }

    @Test
    public void testPrintOrderDetails() {
        Order orderUnderTest = new Order(new ArrayList<>());
        // Setup
        // Run the test
        orderUnderTest.printOrderDetails();

        // Verify the resultsS
    }

    @Test
    public void testFormatDouble() {
        assertEquals("3.14", Order.formatDouble(3.14));
    }
}
