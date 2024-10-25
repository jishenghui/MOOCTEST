package net.mooctest;

import org.junit.*;
import java.util.*;
import java.math.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Hotel_Test {
    private Manager manager;
    private List<Room> testRooms;
    private Room room;
    Hotel hotel;
    @Before
    public void setUp() {
        hotel=new Hotel();
        room = new Room();
        room = new Room(101, "Standard Room", 1, 100.00);
        testRooms = new ArrayList<>();
        testRooms.add(new Room(101, "Standard Room", 1, 100.00));
        testRooms.add(new Room(102, "Deluxe Room", 2, 200.00));
        testRooms.add(new Room(103, "Advanced Room", 3, 300.00));
        // 设置Hotel的rooms字段
        Hotel.rooms = testRooms;
        // 初始化Manager实例
        manager = new Manager();
    }





//    room


    @Test
    public void testSetRoomCode_ValidCode() {
        room.setRoomCode(102);
        assertEquals(102, room.getRoomCode());
        try {
            room.setRoomCode(1000);
        } catch (Exception e) {
        }
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testSetRoomCode_InvalidCode() {
//        room.setRoomCode(999);
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoomCode_CodeWith00() {
        room.setRoomCode(1002);
        room.setRoomCode(2);
        room.setRoomCode(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoomCode_CodeWith01() {

        room.setRoomCode(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoomCode_CodeWith02() {

        room.setRoomCode(2);

    }

    @Test
    public void testSetType_ValidType() {
        try {
            room.setType("Double");
        } catch (Exception e) {
            System.out.println("Type not exists: " + "Double");
        }

//        assertEquals("Double", room.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetType_InvalidType() {
        room.setType("Quad");
        assertEquals(room.getType(), "Quad");
    }

    @Test
    public void testSetCapacity_ValidCapacity() {
        room.setCapacity(2);
        assertEquals(2, room.getCapacity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacity_InvalidCapacity() {
        room.setCapacity(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacity_InvalidCapacity1() {
        room.setCapacity(11);
    }

    @Test
    public void testSetPrice_ValidPrice() {
        room.setPrice(150.00);
        assertEquals(150.00, room.getPrice(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPrice_NegativePrice() {
        room.setPrice(-10.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPrice_InvalidPriceLength() {
        room.setPrice(100.123);
    }

    @Test
    public void testToString() {
        String expected = "RoomCode: 101" + System.lineSeparator() +
                "RoomType: Standard Room" + System.lineSeparator() +
                "Capacity: 1" + System.lineSeparator() +
                "RoomState: Free" + System.lineSeparator() +
                "Price: 100.0" + System.lineSeparator();
        assertEquals(expected, room.toString());
    }

    @Test
    public void testBook(){
        room.book();
    }
    @Test(expected = IllegalStateException.class)
    public void testUnsubscribe(){
        room.unsubscribe();
    }
    @Test
    public void testCheckIn(){
        room.checkIn();
    }
    @Test(expected = IllegalStateException.class)
    public void testCheckOut(){
        room.checkOut();
    }








//    hotel

    @Test
    public void testMain() {
        // Setup
        // Run the test
        Hotel.main(new String[]{"args"});

        // Verify the results
    }

    @Test
    public void testQueryRoom() {
        Hotel.queryRoom(103);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNullQueryRoom() {
        Hotel.queryRoom(104);
    }

    @Test
    public void testPrintAllRoomsInfo() {
        // Setup
        // Run the test
        Hotel.printAllRoomsInfo();

        // Verify the results
    }

    @Test
    public void testGetFreeRooms() {
        // Setup
        // Run the test
        final List<Room> result = Hotel.getFreeRooms();

        // Verify the results
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRoom01() {
        // Setup
        // Run the test
        Hotel.addRoom("type", 0, 0);

        // Verify the results
    }

    @Test
    public void testAddRoom02() {
        // Setup
        // Run the test
        Hotel.addRoom("Advanced Room", 109, 3);
        Hotel.addRoom("Deluxe Room", 110, 2);

        // Verify the results
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRoom03() {
        // Setup
        // Run the test
        Hotel.addRoom("Advanced Room", 101, 0);

        // Verify the results
    }


    @Test
    public void testRemoveRoomFromList() {
        // Setup
        // Run the test
        Hotel.removeRoomFromList(101);

        // Verify the results
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRoomFromList1() {
        // Setup
        // Run the test
        Hotel.removeRoomFromList(114);

        // Verify the results
    }








//    manager

    @Test(expected = NullPointerException.class)
    public void checkIn_RoomNotExists_ShouldThrowNullPointerException() {
        manager.checkIn(5, 999); // 不存在的房间号
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIn_DaysLessThanZero_ShouldThrowIllegalArgumentException() {
        manager.checkIn(-1, 101); // 存在的房间号，但天数非法
    }

    @Test
    public void checkIn_RoomExistsAndDaysGreaterThanSeven_ShouldReturnDiscountedPrice() {
        double expectedPrice = 100.00 * 8 * 0.8;
        double actualPrice = manager.checkIn(8, 101);
        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void checkIn_RoomExistsAndDaysBetweenFourAndSeven_ShouldReturnDiscountedPrice() {
        double expectedPrice = 200.00 * 5 * 0.9;
        double actualPrice = manager.checkIn(5, 102);
        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void checkIn_RoomExistsAndDaysLessThanFour_ShouldReturnNormalPrice() {
        double expectedPrice = 300.00 * 3;
        double actualPrice = manager.checkIn(3, 103);
        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void transferPrice_ValidPrice01_ShouldReturnRomanNumeral() {
        assertEquals(manager.transferPrice(185.5),"CLXXXVI");
    }
    @Test
    public void transferPrice_NoValidPrice01_ShouldReturnRomanNumeral() {
        assertNull(manager.transferPrice(-1));
        assertNull(manager.transferPrice(10000));

    }





    @Test(expected = IllegalStateException.class)
    public void TestBook() {
        new BookedState().book(room);
    }

    @Test
    public void TestUnsubscribe() {
        new BookedState().unsubscribe(room);
    }

    @Test
    public void TestCheckIn() {
        new BookedState().checkIn(room);
    }

    @Test(expected = IllegalStateException.class)
    public void TestCheckOut() {
        new BookedState().checkOut(room);
    }







    @Test(expected = IllegalStateException.class)
    public void testCheckInStateBook() {
        new CheckInState().book(room);
    }

    @Test(expected = IllegalStateException.class)
    public void testCheckInStateUnsubscribe() {
        new CheckInState().unsubscribe(room);
    }

    @Test(expected = IllegalStateException.class)
    public void testCheckInStateCheckIn() {
        new CheckInState().checkIn(room);
    }

    @Test
    public void testCheckInStateCheckOut() {
        new CheckInState().checkOut(room);
    }
}
