/***
 * 开发者测试Supermarket题目参考答案，开发者测试无固定答案，本答案仅供参考，并非最优答案。
 * 同时本参考答案中也包含部分不太规范的写法，比如断言函数中使用较长的字符串。
 */

package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelTest {

	@Test(timeout = 4000)
	public void testaddRoom() {
		Hotel hotel = new Hotel();
		hotel.addRoom(RoomType.ADVANCED, 122, 7);
		assertEquals(1, hotel.rooms.size());
	}

	@Test
	public void testRoom1() {
		{
			Room r1 = new Room();
			r1.book();
			r1.unsubscribe();
			r1.checkIn();
			r1.checkOut();
			r1.setType("Standard Room");
			r1.setCapacity(1);
			r1.setCapacity(10);
			FreeTimeState fts = new FreeTimeState();
			r1.setState(fts);
			r1.setPrice(0.1);
			r1.setPrice(0.11);
			r1.setState(new FreeTimeState());
			assertEquals(0, r1.getRoomCode());
			assertEquals("Standard Room", r1.getType());
			assertEquals(10, r1.getCapacity());
			assertEquals(true, r1.getPrice() == 0.11);
			assertEquals(fts.getClass(), r1.getState().getClass());
			assertTrue(!r1.toString().isEmpty());
		}

	}

	@Test
	public void testRoom2() {
		{
			Room r1 = new Room(101, "Standard Room", 1, 1.1);
			assertTrue(!r1.toString().isEmpty());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp1() {
		{
			Room r1 = new Room();
			r1.setRoomCode(1111);//
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp2() {
		{
			Room r1 = new Room();
			r1.setRoomCode(99);//
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp3() {
		{
			Room r1 = new Room();
			r1.setRoomCode(1000);//
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp4() {
		{
			Room r1 = new Room();
			r1.setCapacity(11);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp5() {
		{
			Room r1 = new Room();
			r1.setCapacity(0);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp6() {
		{
			Room r1 = new Room();
			r1.setPrice(0.111);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp7() {
		{
			Room r1 = new Room();
			r1.setType("");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp8() {
		{
			Room r1 = new Room();
			r1.setPrice(0);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRoomExp9() {
		{
			Room r1 = new Room();
			r1.setPrice(-0.111);
		}
	}

	@Test
	public void testBS() {
		{
			BookedState bs1 = new BookedState();
			Room r1 = new Room();
			bs1.unsubscribe(r1);
			assertTrue(!bs1.toString().isEmpty());
			assertEquals(FreeTimeState.class, r1.getState().getClass());

		}
		{
			BookedState bs1 = new BookedState();
			Room r1 = new Room();
			bs1.checkIn(r1);
			assertEquals(CheckInState.class, r1.getState().getClass());

		}

	}

	@Test(expected = IllegalStateException.class)
	public void testBSExp() {
		BookedState bs1 = new BookedState();
		bs1.book(null);
	}

	@Test(expected = IllegalStateException.class)
	public void testBSExp1() {
		BookedState bs1 = new BookedState();
		Room r1 = new Room();
		bs1.checkOut(r1);
	}

	@Test
	public void testCS() {
		{
			CheckInState cs1 = new CheckInState();
			Room r1 = new Room();
			cs1.checkOut(r1);
			assertTrue(!cs1.toString().isEmpty());
			assertEquals(FreeTimeState.class, r1.getState().getClass());

		}
	}

	@Test(expected = IllegalStateException.class)
	public void testCSExp() {
		CheckInState cs1 = new CheckInState();
		Room r1 = new Room();
		cs1.book(r1);
	}

	@Test(expected = IllegalStateException.class)
	public void testCSExp1() {
		CheckInState cs1 = new CheckInState();
		Room r1 = new Room();
		cs1.unsubscribe(r1);
	}

	@Test(expected = IllegalStateException.class)
	public void testCSExp2() {
		CheckInState cs1 = new CheckInState();
		Room r1 = new Room();
		cs1.checkIn(r1);
	}

	@Test
	public void testFS() {
		{
			FreeTimeState fs1 = new FreeTimeState();
			Room r1 = new Room();
			fs1.book(r1);
			assertEquals(BookedState.class, r1.getState().getClass());

		}
		{
			FreeTimeState fs1 = new FreeTimeState();
			Room r1 = new Room();
			fs1.checkIn(r1);
			assertEquals(CheckInState.class, r1.getState().getClass());
		}
		{
			FreeTimeState fs1 = new FreeTimeState();
			Room r1 = new Room();
			fs1.toString();
		}
	}

	@Test(expected = Exception.class)
	public void testFSExp() {
		FreeTimeState fs1 = new FreeTimeState();
		Room r1 = new Room();
		fs1.unsubscribe(r1);
	}

	@Test(expected = Exception.class)
	public void testFSExp1() {
		FreeTimeState fs1 = new FreeTimeState();
		Room r1 = new Room();
		fs1.checkOut(r1);
	}

	@Test
	public void RoomType() {
		RoomType rt1 = new RoomType();
		rt1.isRoomType("Standard Room");
		rt1.isRoomType("Advanced Room");
		rt1.isRoomType("Deluxe Room");
		rt1.isRoomType("StandardRoom");
	}

	static InputStream conIn = null;
	static OutputStream conOut = null;
	static String sep = System.getProperty("line.separator");
	ByteArrayInputStream in = null;
	ByteArrayOutputStream out = null;

	@Before
	public void bef() {
		conIn = System.in;
		conOut = System.out;
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}

	@After
	public void aft() throws IOException {
		System.setIn(conIn);
		out.close();
		System.setOut((PrintStream) conOut);
	}

	@Test
	public void testHotel1() {
		{
			Hotel h1 = new Hotel();
			Hotel.main(new String[] { "why" });
		}
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.addRoom("Deluxe Room", 102, 2);
			h1.addRoom("Standard Room", 103, 2);
			h1.addRoom("Deluxe Room", 104, 1);

			h1.printAllRoomsInfo();
			h1.removeRoomFromList(102);

			List<Room> lst = h1.getFreeRooms();
			lst.get(0).setState(new CheckInState());
			h1.printAllRoomsInfo();
			List<Room> lst2 = h1.getFreeRooms();

			h1.queryRoom(104);
			h1.queryRoom(103);
			h1.queryRoom(101);
			// Java在不同系统中的换行符不同，在Windows中为\r\n，在Linux中为\n，
			// 所以一般不推荐这种多行字符串的比较方式
			assertEquals("2147483647" + "\r\n" + "RoomCode: 102" + "\r\n" + "RoomType: Deluxe Room" + "\r\n"
					+ "Capacity: 2" + "\r\n" + "RoomState: Free" + "\r\n" + "Price: 240.0" + "\r\n" + "RoomCode: 101"
					+ "\r\n" + "RoomType: Deluxe Room" + "\r\n" + "Capacity: 2" + "\r\n" + "RoomState: Free" + "\r\n"
					+ "Price: 240.0" + "\r\n" + "RoomCode: 104" + "\r\n" + "RoomType: Deluxe Room" + "\r\n"
					+ "Capacity: 1" + "\r\n" + "RoomState: Free" + "\r\n" + "Price: 200.0" + "\r\n" + "RoomCode: 103"
					+ "\r\n" + "RoomType: Standard Room" + "\r\n" + "Capacity: 2" + "\r\n" + "RoomState: Free" + "\r\n"
					+ "Price: 120.0" + "\r\n" + "RoomCode: 104" + "\r\n" + "RoomType: Deluxe Room" + "\r\n"
					+ "Capacity: 1" + "\r\n" + "RoomState: Free" + "\r\n" + "Price: 200.0" + "\r\n" + "RoomCode: 103"
					+ "\r\n" + "RoomType: Standard Room" + "\r\n" + "Capacity: 2" + "\r\n" + "RoomState: Free" + "\r\n"
					+ "Price: 120.0" + "\r\n" + "RoomCode: 101" + "\r\n" + "RoomType: Deluxe Room" + "\r\n"
					+ "Capacity: 2" + "\r\n" + "RoomState: CheckIn" + "\r\n" + "Price: 240.0" + "\r\n" + "RoomCode: 104"
					+ "\r\n" + "RoomType: Deluxe Room" + "\r\n" + "Capacity: 1" + "\r\n" + "RoomState: Free" + "\r\n"
					+ "Price: 200.0" + "\r\n" + "RoomCode: 103" + "\r\n" + "RoomType: Standard Room" + "\r\n"
					+ "Capacity: 2" + "\r\n" + "RoomState: Free" + "\r\n" + "Price: 120.0" + "\r\n" + "RoomCode: 101"
					+ "\r\n" + "RoomType: Deluxe Room" + "\r\n" + "Capacity: 2" + "\r\n" + "RoomState: CheckIn" + "\r\n"
					+ "Price: 240.0" + "\r\n" + "", out.toString());

		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHotelExp1() {
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.addRoom("Deluxe Room", 101, 2);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHotelExp2() {
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.removeRoomFromList(103);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHotelExp3() {
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.addRoom("Deluxe Room", 102, 2);
			h1.addRoom("Standard Room", 103, 2);
			h1.addRoom("Deluxe Room", 104, 1);

			h1.printAllRoomsInfo();
			h1.removeRoomFromList(102);

			List<Room> lst = h1.getFreeRooms();
			lst.get(0).setState(new CheckInState());
			h1.printAllRoomsInfo();
			List<Room> lst2 = h1.getFreeRooms();

			h1.queryRoom(104);
			h1.queryRoom(103);
			h1.queryRoom(101);
			h1.queryRoom(102);
		}
	}

	@Test
	public void testMg1() {
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.addRoom("Deluxe Room", 102, 2);
			h1.addRoom("Standard Room", 103, 2);
			h1.addRoom("Deluxe Room", 104, 1);
			List<Room> lst = h1.getFreeRooms();
			lst.get(0).setState(new CheckInState());

			Manager m1 = new Manager();
			assertEquals("240.0", "" + m1.checkIn(1, 101));
			assertEquals("756.0", "" + m1.checkIn(7, 103));
			assertEquals("1280.0", "" + m1.checkIn(8, 104));
			assertEquals("X", "" + m1.transferPrice(10.1));
			assertEquals(null, m1.transferPrice(-1));
			assertEquals(null, m1.transferPrice(4000));

		}
	}

	@Test(expected = NullPointerException.class)
	public void testMgExp1() {
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.addRoom("Deluxe Room", 102, 2);
			h1.addRoom("Standard Room", 103, 2);
			h1.addRoom("Deluxe Room", 104, 1);
			List<Room> lst = h1.getFreeRooms();
			lst.get(0).setState(new CheckInState());

			Manager m1 = new Manager();
			m1.checkIn(1, 1010);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMgExp2() {
		{
			Hotel h1 = new Hotel();
			h1.addRoom("Deluxe Room", 101, 2);
			h1.addRoom("Deluxe Room", 102, 2);
			h1.addRoom("Standard Room", 103, 2);
			h1.addRoom("Deluxe Room", 104, 1);
			List<Room> lst = h1.getFreeRooms();
			lst.get(0).setState(new CheckInState());

			Manager m1 = new Manager();
			m1.checkIn(0, 101);
		}
	}

	@Test
	public void testOI1() {
		{
			OrderItem oi1 = new OrderItem("why", 10.1, 2);
			assertEquals("why	10.10	2	20.20", oi1.PrintOrderItem());
			assertEquals("why", oi1.getProductName());
			assertEquals("10.1", "" + oi1.getPaymentPrice());
			assertEquals(2, oi1.getCount());
			assertEquals("20.2", "" + oi1.getAmount());
			oi1.setProductName("why1");
			oi1.setPaymentPrice(1.1);
			oi1.setCount(0);
			assertEquals("why1", oi1.getProductName());
			assertEquals("1.1", "" + oi1.getPaymentPrice());
			assertEquals(0, oi1.getCount());
			assertEquals("0.0", "" + oi1.getAmount());

		}
	}

	@Test
	public void testO1() {
		{
			OrderItem oi1 = new OrderItem("why", 10, 50);
			OrderItem oi2 = new OrderItem("why2", 1, 1000);
			OrderItem oi3 = new OrderItem("why3", 20.1, 3);
			ArrayList<OrderItem> arr1 = new ArrayList<OrderItem>();
			arr1.add(oi1);
			ArrayList<OrderItem> arr2 = new ArrayList<OrderItem>();
			arr1.add(oi2);
			ArrayList<OrderItem> arr3 = new ArrayList<OrderItem>();

			arr1.add(oi3);

			Order o1 = new Order(arr1);

			o1.setItems(arr1);
			assertEquals("1560.3", "" + o1.totalAmount());
			o1.createOrder(arr1);
			o1.createOrder(arr2);
			o1.createOrder(arr3);

			o1.printOrders();

			String outStr = out.toString();

			o1.searchMaxOrder();
			o1.printOrderDetails();
			assertEquals("10.10", o1.formatDouble(10.1));
			ArrayList<OrderItem> arrL = new ArrayList<OrderItem>();
			assertEquals(arrL.getClass(), o1.getItems().getClass());
			assertEquals("Order No.1" + "\r\n" + "why	8.00	50	400.00" + "\r\n" + "why2	.80	1000	800.00"
					+ "\r\n" + "why3	16.08	3	48.24" + "\r\n" + "Order Total:1248.24" + "\r\n" + "" + "\r\n"
					+ "Order No.2" + "\r\n" + "Order Total:.00" + "\r\n" + "" + "\r\n" + "Order No.3" + "\r\n"
					+ "Order Total:.00" + "\r\n" + "" + "\r\n" + "AllAmount: 1248.24" + "\r\n", outStr);
		}
	}

	@Test
	public void testO2() {
		{
			OrderItem oi1 = new OrderItem("why", 10, 50);
			OrderItem oi2 = new OrderItem("why2", 1, 1000);
			OrderItem oi3 = new OrderItem("why3", 20.1, 3);
			ArrayList<OrderItem> arr1 = new ArrayList<OrderItem>();
			arr1.add(oi1);

			Order o1 = new Order(arr1);

			o1.setItems(arr1);
			o1.totalAmount();
			o1.createOrder(arr1);

			o1.printOrders();
			o1.searchMaxOrder();
			o1.printOrderDetails();
			o1.formatDouble(10.1);
			o1.getItems();
		}
	}

	@Test
	public void testProd() {
		{
			Product p1 = new Product("why", 10.1, 2);
			p1.getPaymentPrice();
			p1.setPrice(1.1);
			p1.setDiscount(0.9);
			p1.setName("wju");

			assertEquals("Name：wju" + "\r\n" + "Price：1.10Yuan" + "\r\n" + "Discount: 90%" + "\r\n" + "Quantity：2",
					p1.getInfo());
			p1.setDiscount(1);
			p1.getInfo();
			p1.setCount(2);

		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setPrice(-1.1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp1() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setDiscount(-0.9);
		p1.setName("wju");
		p1.getInfo();
		p1.setCount(2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp2() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setDiscount(1.1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp3() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setDiscount(0.0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp4() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setPrice(0.111);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp5() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setName("why1");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp6() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setName("whywhywhywhywwwwwwwwwwwwwwwwwwwww");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp7() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setCount(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProdExp8() {
		Product p1 = new Product("why", 10.1, 2);
		p1.getPaymentPrice();
		p1.setCount(-1);
	}

	@Test
	public void testShop1() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			assertEquals(1, s1.addProduct(p1));
			assertEquals(2, s1.addProduct(p2));
			assertEquals(3, s1.addProduct(p3));
			assertEquals(4, s1.addProduct(p4));
			assertEquals(3, s1.addProduct(p4));

			assertEquals(
					"No.1" + "\r\n" + "Name：whyyy" + "\r\n" + "Price：1.00Yuan" + "\r\n" + "Discount: No discount"
							+ "\r\n" + "Quantity：4" + "\r\n" + "No.2" + "\r\n" + "Name：why" + "\r\n" + "Price：10.10Yuan"
							+ "\r\n" + "Discount: No discount" + "\r\n" + "Quantity：2" + "\r\n" + "No.3" + "\r\n"
							+ "Name：whdy" + "\r\n" + "Price：100.10Yuan" + "\r\n" + "Discount: No discount" + "\r\n"
							+ "Quantity：22" + "\r\n" + "No.4" + "\r\n" + "Name：whyy" + "\r\n" + "Price：100.10Yuan"
							+ "\r\n" + "Discount: No discount" + "\r\n" + "Quantity：22" + "\r\n" + "",
					s1.getAllProductsInfo());

			assertEquals(1, s1.deletProduct("why"));
			assertEquals(21, s1.sellProduct("whyy", 1));
			Product pp1 = s1.updateProduct("whyy", 100, 0.9);
			assertEquals("90.0", "" + pp1.getPaymentPrice());
			assertEquals(2, s1.searchProduct("whyy"));
			Product p22 = s1.getProductByName("whyy");
			assertEquals(true, p22 != null);
			assertEquals(null, s1.getProductByName("jadhw"));

		}
	}

	@Test(expected = NullPointerException.class)
	public void testShopExp1() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			s1.getAllProductsInfo();

			s1.deletProduct("whydawda");
		}
	}

	@Test(expected = NullPointerException.class)
	public void testShopExp2() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			s1.getAllProductsInfo();

			s1.sellProduct("whydawd", 1);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testShopExp3() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			s1.getAllProductsInfo();

			s1.sellProduct("why", 3);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testShopExp4() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			s1.getAllProductsInfo();

			s1.sellProduct("why", 0);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testShopExp5() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			s1.getAllProductsInfo();

			s1.sellProduct("why", -1);
		}
	}

	@Test(expected = NullPointerException.class)
	public void testShopExp6() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			s1.getAllProductsInfo();

			s1.updateProduct("whydwadaw", 10, 0.1);
		}
	}

	@Test
	public void testSK() {
		{
			Product p1 = new Product("why", 10.1, 2);
			Product p2 = new Product("whyy", 100.1, 22);
			Product p3 = new Product("whdy", 100.1, 22);
			Product p4 = new Product("whyyy", 1, 2);

			Shop s1 = new Shop();
			s1.addProduct(p1);
			s1.addProduct(p2);
			s1.addProduct(p3);
			s1.addProduct(p4);

			ShopKeeper sk1 = new ShopKeeper();
			sk1.setShop(s1);
			sk1.showAllProducts();
			Map<String, Integer> mp = new HashMap<String, Integer>();
			mp.put("why", 1);
			mp.put("whyy", 0);
			mp.put("whywda", 1);

			sk1.sellProducts(mp);
			Map<String, Integer> mp1 = new HashMap<String, Integer>();

			sk1.sellProducts(mp1);

			assertEquals("No.1" + "\r\n" + "Name：whyyy" + "\r\n" + "Price：1.00Yuan" + "\r\n" + "Discount: No discount"
					+ "\r\n" + "Quantity：2" + "\r\n" + "No.2" + "\r\n" + "Name：why" + "\r\n" + "Price：10.10Yuan"
					+ "\r\n" + "Discount: No discount" + "\r\n" + "Quantity：2" + "\r\n" + "No.3" + "\r\n" + "Name：whdy"
					+ "\r\n" + "Price：100.10Yuan" + "\r\n" + "Discount: No discount" + "\r\n" + "Quantity：22" + "\r\n"
					+ "No.4" + "\r\n" + "Name：whyy" + "\r\n" + "Price：100.10Yuan" + "\r\n" + "Discount: No discount"
					+ "\r\n" + "Quantity：22" + "\r\n" + "Selld Failed:Count cannot less than 0." + "\r\n"
					+ "Selld Successfully:why*1" + "\r\n" + "Selld Failed:Product is not exists." + "\r\n" + "",
					out.toString());

		}
	}

}
