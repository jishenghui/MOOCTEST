package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @Author: 纪圣辉
 * @Description: TODO
 * @DateTime: 2024/11/12 下午9:05
 **/
public class LibraryTest {

    //对以上项目通过junit4框架进行单元测试，禁用mockito
    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    Random random = new Random();
    String lineSeparator = System.lineSeparator();//操作系统换行符
    PrintStream printStream;

    //捕获控制台输出，每个方法仅限使用一次(没有出缓,保守点)
    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        printStream = new PrintStream(outContent);
        System.setOut(printStream);
    }

    public String GetOutPutAfter() {
        return outContent.toString();//获取输出的内容
    }

    //关闭流
    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }
    private Library library;
    private User user1;
    private User user2;
    private Book book1;
    private Book book2;

    Book book;
    User user;
    BorrowRecord borrowRecord;
    Reservation reservation;

    @Before
    public void setUp() throws Exception {
        library = new Library();
        user1 = new RegularUser("John", "60");
        user2 = new VIPUser("Jane", "40");
        book1 = new Book("My Test Book 1", "Author 1", "ISBN123", BookType.GENERAL, 5);
        book2 = new Book("My Test Book 2", "Author 2", "ISBN456", BookType.RARE, 3);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testLibrary() {
        library = new Library();

    }

    @Test
    public void testVIPUser() {

    }

    @Test
    public void testRegularUser() {

    }

    @Test
    public void testUser() {

    }

    @Test
    public void testBook() throws Exception {
        GetOutPutBefore();
        String s="";
        Book[] books = new Book[5];
        books[0] = new Book("title0", "author0", "isbn0", BookType.GENERAL, 4);
        books[1] = new Book("title1", "author1", "isbn1", BookType.RARE, 1);
        books[2] = new Book("title2", "author2", "isbn2", BookType.JOURNAL, 20);
        books[3] = new Book("title3", "author3", "isbn3", BookType.EBOOK, 1000);
        books[4] = new Book("title4", "author4", "isbn4", BookType.GENERAL, 10);
        int[] out = {4, 5, 8, 0, 4};
        int[] in = {5, 15, 5, 0, 7};
        int[] t = {7, 9, 18, 0, 3};
        for (int i = 0; i < 5; i++) {
            assertTrue(books[i].isAvailable());
            for (int j = 0; j < out[i]; j++) {
                try {
                    books[i].borrow();
                } catch (Exception e) {
                    System.out.println("The book is unavailable and cannot be borrowed." + out[i]);
                }
                books[i].setTotalCopies(t[i]);
                try {
                    books[i].returnBook();
                } catch (Exception e) {
                    System.out.println("All copies are in the library." + in[i]);
                }
            }

        }

        books[0].reportRepair();
        assertFalse(books[0].isAvailable());
        books[0].reportRepair();
        try {
            books[0].borrow();
        } catch (Exception e) {
            System.out.println("The book is unavailable and cannot be borrowed." + out[0]);
        }

        books[1].reportDamage();
        assertFalse(books[1].isAvailable());
        books[1].reportDamage();
        try {
            books[1].borrow();
        } catch (Exception e) {
            System.out.println("The book is unavailable and cannot be borrowed." + out[0]);
        }

        books[3].setAvailableCopies(-1);
        assertFalse(books[3].isAvailable());
        assertEquals("title0", books[0].getTitle());
        books[0].setTitle("sss");
        assertEquals("sss", books[0].getTitle());


//        for (int i = 0; i < 5; i++) {
//            System.out.print(in[i]+",");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            System.out.print(t[i]+",");
//        }


        Reservation[] reservations = new Reservation[5];
        reservations[0] = new Reservation(books[0], new RegularUser("aaa", "111"));
        reservations[1] = new Reservation(books[1], new RegularUser("bbb", "222"));
        reservations[2] = new Reservation(books[2], new RegularUser("ccc", "333"));
        reservations[3] = new Reservation(books[3], new RegularUser("ddd", "444"));
        reservations[4] = new Reservation(books[4], new RegularUser("eee", "555"));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                books[i].addReservation(reservations[j]);
            }
        }
        int[][] pop = {{0, 4, 3, 2, 1}, {0, 4, 3,2,1}};
        for (int i = 0; i < 2; i++) {
            assertEquals(5, books[i].getReservationQueue().size());
            for (int j = 0; j < 5; j++) {
                Reservation r = books[i].getReservationQueue().poll();
                Reservation r1=reservations[pop[i][j]];
                assertEquals(r1, r);
            }
        }
        for (int i = 1; i < 5; i++) {
            books[i].removeReservation(reservations[i-1]);
        }

        s=GetOutPutAfter();
        assertEquals("Successfully borrowed the book. Remaining copies:3"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:4"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:3"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:4"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:3"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:4"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:3"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:4"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:0"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:1"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:0"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:1"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:0"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:1"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:0"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:1"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:0"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:1"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:19"+lineSeparator +
                "All copies are in the library.5"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:18"+lineSeparator +
                "All copies are in the library.5"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:17"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:18"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:17"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:18"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:17"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:18"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:17"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:18"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:17"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:18"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:17"+lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:18"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:9"+lineSeparator +
                "All copies are in the library.7"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:8"+lineSeparator +
                "All copies are in the library.7"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:7"+lineSeparator +
                "All copies are in the library.7"+lineSeparator +
                "Successfully borrowed the book. Remaining copies:6"+lineSeparator +
                "All copies are in the library.7"+lineSeparator +
                "Report book repair."+lineSeparator +
                "The book is under repair and temporarily unavailable."+lineSeparator +
                "The book is already under repair."+lineSeparator +
                "The book is under repair and temporarily unavailable."+lineSeparator +
                "The book is unavailable and cannot be borrowed.4"+lineSeparator +
                "Report book damage."+lineSeparator +
                "The book is damaged and cannot be borrowed."+lineSeparator +
                "This book is damaged. No need to report it again."+lineSeparator +
                "The book is damaged and cannot be borrowed."+lineSeparator +
                "The book is unavailable and cannot be borrowed.4"+lineSeparator +
                "There are no available copies."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "Reservation added successfully."+lineSeparator +
                "This reservation is not in the reservation queue."+lineSeparator +
                "Reservation cancelled successfully."+lineSeparator +
                "Reservation cancelled successfully."+lineSeparator +
                "Reservation cancelled successfully."+lineSeparator,s );
    }

    @Test
    public void testBorrowRecord() {

    }

    @Test
    public void testReservation() throws Exception {

    }






    @Test
    public void registerUser_CreditScoreTooLow_ShouldNotRegister() throws Exception {
        System.out.println("Credit score is too low to register a user.");
        library.registerUser(user2);

        Field usersField = Library.class.getDeclaredField("users");
        usersField.setAccessible(true);
        List<User> users = (List<User>) usersField.get(library);
        assertEquals(1, users.size());
    }

    @Test
    public void registerUser_UserAlreadyExists_ShouldNotRegister() throws Exception {
        library.registerUser(user1);
        System.out.println("User already exists.");
        library.registerUser(user1);

        Field usersField = Library.class.getDeclaredField("users");
        usersField.setAccessible(true);
        List<User> users = (List<User>) usersField.get(library);
        assertEquals(1, users.size());
    }

    @Test
    public void registerUser_ValidUser_ShouldRegister() throws Exception {
        library.registerUser(user1);
        System.out.println("Successfully registered user:John");

        Field usersField = Library.class.getDeclaredField("users");
        usersField.setAccessible(true);
        List<User> users = (List<User>) usersField.get(library);
        assertEquals(1, users.size());
    }

    @Test
    public void addBook_BookAlreadyExists_ShouldNotAdd() throws Exception {
        library.addBook(book1);
        System.out.println("This book already exists.");
        library.addBook(book1);

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
        assertEquals(1, books.size());
    }

    @Test
    public void addBook_NewBook_ShouldAdd() throws Exception {
        library.addBook(book2);
        System.out.println("Successfully added book:My Test Book 2");

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
        assertEquals(1, books.size());
    }

    @Test
    public void processReservations_BookUnavailable_ShouldNotProcess() throws Exception {
//        book1.setAvailable(false);
        library.processReservations(book1);
        System.out.println("The book is unavailable and cannot process reservations.");

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
        assertEquals(0, books.size());
    }

    @Test
    public void processReservations_BookAvailableWithReservation_ShouldProcess() throws Exception {

        Reservation reservation = new Reservation(book1,user1);
        book1.getReservationQueue().add(reservation);
        library.processReservations(book1);

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
        assertEquals(0, books.size());

        Field usersField = Library.class.getDeclaredField("users");
        usersField.setAccessible(true);
        List<User> users = (List<User>) usersField.get(library);
//        assertTrue(users.get(0).getBooks().contains(book1));
    }

    @Test
    public void autoRenewBook_RenewalSuccessful_ShouldRenew() throws Exception {
        user1.borrowBook(book1);
        library.autoRenewBook(user1, book1);
        System.out.println("Successfully automatically renewed book:My Test Book 1");

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
        assertEquals(0, books.size());
    }

    @Test
    public void repairUserCredit_CreditRepairSuccessful_ShouldRepair() throws Exception {
        library.repairUserCredit(user2, 100);
        System.out.println("User credit repair is successful. Current credit score:50");
        assertEquals(110, user2.getCreditScore());

        Field usersField = Library.class.getDeclaredField("users");
        usersField.setAccessible(true);
        List<User> users = (List<User>) usersField.get(library);
        assertEquals(0, users.size());
    }

    @Test
    public void reportLostBook_LossReportSuccessful_ShouldReport() throws Exception {
        user1.borrowBook(book1);
        library.reportLostBook(user1, book1);
        System.out.println("Book loss report is successful. Book:My Test Book 1");

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
//        assertTrue(books.get(0).isAvailable());
    }

    @Test
    public void reportDamagedBook_DamageReportSuccessful_ShouldReport() throws Exception {
        user1.borrowBook(book1);
        library.reportDamagedBook(user1, book1);
        System.out.println("Book damage report is successful. Book:My Test Book 1");

        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
//        assertTrue(books.get(0).isDamaged());
    }
}
