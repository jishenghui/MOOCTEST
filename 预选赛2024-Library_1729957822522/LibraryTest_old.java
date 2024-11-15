package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LibraryTest_old {

    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
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


    VIPUser vipUser;
    RegularUser regularUser;
    User user;
    BorrowRecord borrowRecord;


    Book[] books;
    BookType[] bookTypes = {BookType.JOURNAL, BookType.GENERAL, BookType.RARE, BookType.EBOOK};
    String title[] = new String[]{"EgTeVSCt", "OudaohVe", "2yddbW8K", "ugvvg72J", "sim03Unl", "R0iq5eyn", "PqqvqPkW", "Bmtn4Ziw", "kD4BTkL3", "e86QdC80", "mC7jTdSk", "WN3LDSod", "v9ZL2172", "AVRL7A9C", "dlIaXhos"};
    String author[] = new String[]{"YUZ1wE", "m0DFoB", "RBwGEf", "yYMSHc", "9IrFZQ", "0spxK0", "jJLIg6", "6e6s6D", "1lEVKC", "3QTYjS", "eDJarE", "5vPVMP", "10cG1B", "bpuXLl", "MPCFOK"};
    String isbn[] = new String[]{"8566908731", "3123487738", "5490104672", "1790673077", "7475678373", "1214544420", "9691866049", "4122528541", "4640856619", "7631975238", "0176417709", "2948412612", "4396556349", "9519095366", "7987990416"};
    int[] nums = new int[]{4, 8, 0, 9, 4, 0, 0, 4, 0, 7, 1, 3, 1, 3, 1};

    @Before
    public void setUp() throws Exception {
        books = new Book[15];
        for (int i = 0; i < 15; i++) {
            books[i] = new Book(title[i], author[i], isbn[i], bookTypes[i % 4], nums[i]);
        }
        user = new VIPUser("jsh", "000-1");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testVIPUser() throws Exception {
        GetOutPutBefore();
        vipUser = new VIPUser("jsh", "2023_001");
        assertEquals(null, vipUser.findBorrowRecord(books[0]));


        assertEquals(4, books[0].getAvailableCopies());
        vipUser.borrowBook(books[0]);
        assertEquals(3, books[0].getAvailableCopies());

        String out = GetOutPutAfter();
        assertEquals("Successfully borrowed the book. Remaining copies:3", out.substring(0, 50));
        GetOutPutEnd();


        BorrowRecord borrowRecord1 = vipUser.findBorrowRecord(books[0]);
        AutoRenewalService autoRenewalService = new AutoRenewalService();
        autoRenewalService.autoRenew(vipUser, books[0]);
        assertEquals(0, borrowRecord1.calculateFine(), 0.01);
        assertEquals(books[0], borrowRecord1.getBook());
        Date date1 = borrowRecord1.getDueDate();

        vipUser.extendBorrowPeriod(books[0]);
        assertEquals(3, books[0].getAvailableCopies());
        Date date2 = borrowRecord1.getDueDate();
        assertNotEquals(date1, date2);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        date1 = cal.getTime();
        assertEquals(date1, date2);

        GetOutPutBefore();
        vipUser.returnBook(books[0]);
        assertEquals(4, books[0].getAvailableCopies());
        out = GetOutPutAfter();
        assertEquals("Successfully returned the book. Currently available copies for borrowing:4" + lineSeparator, out);
        GetOutPutEnd();


    }


    @Test
    public void testRegularUser() throws Exception {
        GetOutPutBefore();
        regularUser = new RegularUser("ykq", "002");
        assertEquals(null, regularUser.findBorrowRecord(books[0]));


        assertEquals(4, books[0].getAvailableCopies());
        regularUser.borrowBook(books[0]);
        assertEquals(3, books[0].getAvailableCopies());

        String out = GetOutPutAfter();
        assertEquals("Successfully borrowed the book. Remaining copies:3", out.substring(0, 50));
        GetOutPutEnd();

        BorrowRecord borrowRecord1 = regularUser.findBorrowRecord(books[0]);
        assertEquals(0, borrowRecord1.calculateFine(), 0.01);
        assertEquals(books[0], borrowRecord1.getBook());


        GetOutPutBefore();
        regularUser.returnBook(books[0]);
        assertEquals(4, books[0].getAvailableCopies());
        out = GetOutPutAfter();
        assertEquals("Successfully returned the book. Currently available copies for borrowing:4" + lineSeparator, out);
        GetOutPutEnd();

    }


    @Test
    public void testUser() throws Exception {
        user = new User("hyf", "003", UserType.STUDENT) {
            @Override
            public void borrowBook(Book book) throws Exception {
                borrowedBooks.add(new BorrowRecord(book, this, null, null));
                book.borrow();
                fines += 100;
                user.accountStatus = AccountStatus.FROZEN;
                creditScore += 1;  // Increase credit score.
                System.out.println(name + "successfully borrowed " + book.getTitle());
            }

            @Override
            public void returnBook(Book book) throws Exception {
                BorrowRecord record = findBorrowRecord(book);
                if (record == null) {
                    throw new InvalidOperationException("The book has not been borrowed.");
                }
                fines -= 98;
                book.returnBook();
                borrowedBooks.remove(record);
            }
        };
        GetOutPutBefore();
        user.borrowBook(books[0]);
        user.returnBook(books[0]);
        String out = GetOutPutAfter();
        assertEquals("Successfully borrowed the book. Remaining copies:3" + lineSeparator +
                "hyfsuccessfully borrowed EgTeVSCt" + lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:4" + lineSeparator, out);
        GetOutPutEnd();

        GetOutPutBefore();
        user.payFine(1);
        assertEquals(1, user.fines, 0.01);
        user.payFine(1);
        assertEquals(0, user.getFines(), 0.01);
        out = GetOutPutAfter();
        assertEquals("Paid a fine of 1.0 yuan." + lineSeparator +
                "There is still a fine of 1.0 yuan to be paid." + lineSeparator +
                "Paid a fine of 1.0 yuan." + lineSeparator +
                "The fine has been cleared and the account status is restored." + lineSeparator, out);
        GetOutPutEnd();

        for (int i = 0; i < 7; i++) {
            user.reserveBook(books[i]);
        }

        assertEquals(7, user.reservations.size());

        for (int i = 0; i < 7; i += 2) {
            user.cancelReservation(books[i]);
        }
        assertEquals(3, user.reservations.size());

        GetOutPutBefore();
        user.receiveNotification(books[0].getTitle());
        out = GetOutPutAfter();
        assertEquals("Notify user [hyf]: EgTeVSCt" + lineSeparator, out);
        GetOutPutEnd();

        GetOutPutBefore();
        user.accountStatus = AccountStatus.BLACKLISTED;
        user.receiveNotification(books[1].getTitle());
        out = GetOutPutAfter();
        assertEquals("Blacklisted users cannot receive notifications." + lineSeparator, out);
        GetOutPutEnd();

        GetOutPutBefore();
        user.accountStatus = AccountStatus.ACTIVE;
        user.addScore(10);
        out = GetOutPutAfter();
        assertEquals("Credit score increased by 10. Current credit score: 111" + lineSeparator, out);
        GetOutPutEnd();

        GetOutPutBefore();
        user.deductScore(5);
        out = GetOutPutAfter();
        assertEquals("Credit score decreased by 5. Current credit score: 106" + lineSeparator, out);
        GetOutPutEnd();


    }


    @Test
    public void testBorrowRecord() {
//        Date date1=new Date();
        borrowRecord = new BorrowRecord(books[0], new VIPUser("jsh", "001"), new Date(99999999999L), new Date(1000000000000L));
        borrowRecord.setReturnDate(new Date(1000000000000L)); // 11 days after due date
//        borrowRecord.setDueDate(new Date(999999999999L)); // 1 day before return date
        assertEquals(0.0, borrowRecord.calculateFine(), 0.01);
        GetOutPutBefore();
        borrowRecord.extendDueDate(5);
        String out = GetOutPutAfter();
        assertEquals("The borrowing period has been extended to:Fri Sep 14 09:46:40 CST 2001" + lineSeparator, out);

    }

    @Test
    public void testReservation() throws IOException {
        GetOutPutBefore();
        Reservation reservation = new Reservation(books[1], new VIPUser("jsh", "001"));
        assertEquals(110, reservation.calculatePriority());
        String out = GetOutPutAfter();
        assertEquals("For VIP users' reservations, the priority is enhanced." + lineSeparator +
                "For VIP users' reservations, the priority is enhanced." + lineSeparator, out);
        GetOutPutEnd();

    }

    @Test
    public void testBook() throws IOException {
        GetOutPutBefore();
        assertEquals(true, books[0].isAvailable());
        assertEquals(false, books[0].isDamaged());
        try {
            books[0].borrow();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(3, books[0].getAvailableCopies());
        try {
            books[0].returnBook();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(4, books[0].getAvailableCopies());
        books[0].reportDamage();
        books[0].reportRepair();

        Queue queue = books[0].getReservationQueue();
        books[0].setDamaged(true);
        books[0].setInRepair(false);
        assertEquals(false, books[0].isAvailable());
        try {
            books[0].borrow();
        } catch (Exception e) {

        }
        books[0].reportDamage();
        books[0].setInRepair(true);
        assertEquals(false, books[0].isAvailable());
        books[0].reportRepair();
        assertEquals(4, books[0].getTotalCopies());
        books[0].setTotalCopies(100);
        assertEquals(100, books[0].getTotalCopies());
        books[0].setAvailableCopies(125);
        try {
            books[0].returnBook();
        } catch (Exception e) {

        }
        books[0].setTitle("aaaaa");
        assertEquals("aaaaa", books[0].getTitle());
        assertEquals(125, books[0].getAvailableCopies());
        books[0].removeReservation(new Reservation(books[2], new VIPUser("jjj", "000")));


        String out = GetOutPutAfter();
        assertEquals("Successfully borrowed the book. Remaining copies:3" + lineSeparator +
                "Successfully returned the book. Currently available copies for borrowing:4" + lineSeparator +
                "Report book damage." + lineSeparator +
                "Report book repair." + lineSeparator +
                "The book is damaged and cannot be borrowed." + lineSeparator +
                "The book is damaged and cannot be borrowed." + lineSeparator +
                "This book is damaged. No need to report it again." + lineSeparator +
                "The book is under repair and temporarily unavailable." + lineSeparator +
                "The book is already under repair." + lineSeparator +
                "For VIP users' reservations, the priority is enhanced." + lineSeparator +
                "This reservation is not in the reservation queue." + lineSeparator, out);
        GetOutPutEnd();
    }

    @Test
    public void testAutoRenewalService() throws Exception {
        GetOutPutBefore();
        AutoRenewalService autoRenewalService = new AutoRenewalService();
        try {
            autoRenewalService.autoRenew(user, books[0]);
        } catch (Exception e) {
            System.out.println("The borrowing record of this book is not found.");
        }
        user.creditScore = 59;
        try {
            autoRenewalService.autoRenew(user, books[0]);
        } catch (Exception e) {
            System.out.println("The credit score is too low to renew the loan.");
        }
        user.reserveBook(books[0]);
        try {
            autoRenewalService.autoRenew(user, books[0]);
        } catch (Exception e) {
            System.out.println("The book has been reserved by other users and cannot be renewed.");
        }
        user.setAccountStatus(AccountStatus.BLACKLISTED);
        try {
            autoRenewalService.autoRenew(user, books[0]);
        } catch (Exception e) {
            System.out.println("The account is frozen and cannot be automatically renewed.");
        }
        String s = GetOutPutAfter();
        assertEquals("The borrowing record of this book is not found." + lineSeparator +
                "The credit score is too low to renew the loan." + lineSeparator +
                "For VIP users' reservations, the priority is enhanced." + lineSeparator +
                "Reservation added successfully." + lineSeparator +
                "The book has been reserved by other users and cannot be renewed." + lineSeparator +
                "The account is frozen and cannot be automatically renewed." + lineSeparator, s);
        GetOutPutEnd();
    }


}
