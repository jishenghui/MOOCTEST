package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.BookType;
import net.mooctest.UserType;
import net.mooctest.*;

import java.util.*;

class RegularUser extends User {
    private static final int BORROW_LIMIT = 5;
    private static final int BORROW_PERIOD = 14;

    public RegularUser(String name, String userId) {
        super(name, userId, UserType.REGULAR);
    }

    @Override
    public void borrowBook(Book book) throws Exception {
        if (accountStatus == AccountStatus.BLACKLISTED) {
            throw new IllegalStateException("Blacklisted users cannot borrow books.");
        }
        if (accountStatus == AccountStatus.FROZEN) {
            throw new AccountFrozenException("The account is frozen and books cannot be borrowed.");
        }
        if (borrowedBooks.size() >= BORROW_LIMIT) {
            throw new InvalidOperationException("The maximum number of books borrowed has been reached.");
        }
        if (fines > 50) {
            accountStatus = AccountStatus.FROZEN;
            throw new OverdueFineException("The fine is too high and the account has been frozen.");
        }
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("The book is unavailable and cannot be borrowed.");
        }
        if (creditScore < 60) {
            throw new InsufficientCreditException("The credit score is too low and books cannot be borrowed.");
        }
        if (book.getBookType() == BookType.RARE) {
            throw new InvalidOperationException("Ordinary users cannot borrow rare books.");
        }

        // Increase the complex judgment of book inventory and borrowable status.
        if (book.getAvailableCopies() < 1) {
            System.out.println("Insufficient book inventory. Add to the reservation queue.");
            reserveBook(book);
            return;
        }

        // Book borrowing is successful.
        book.borrow();
        Date borrowDate = new Date();
        Date dueDate = calculateDueDate(borrowDate, BORROW_PERIOD);
        BorrowRecord record = new BorrowRecord(book, this, borrowDate, dueDate);
        borrowedBooks.add(record);
        creditScore += 1;  // Increase credit score.
        System.out.println(name + "successfully borrowed " + book.getTitle() + ", due date:" + dueDate);
    }

    @Override
    public void returnBook(Book book) throws Exception {
        BorrowRecord record = findBorrowRecord(book);
        if (record == null) {
            throw new InvalidOperationException("The book has not been borrowed.");
        }
        book.returnBook();
        record.setReturnDate(new Date());
        borrowedBooks.remove(record);

        // 
        long borrowDuration = (record.getReturnDate().getTime() - record.getBorrowDate().getTime()) / (1000 * 60 * 60 * 24);
        if (borrowDuration > BORROW_PERIOD) {
            System.out.println("Return the book" + (borrowDuration - BORROW_PERIOD) + "days overdue and calculate the fine." );
        }

        fines += record.calculateFine();
        if (fines > 100) {
            accountStatus = AccountStatus.FROZEN;
            throw new OverdueFineException("The fine is too high and the account has been frozen.");
        }

        if (record.getFineAmount() > 0) {
            creditScore -= 5; // Return books overdue and deduct credit scores.
            if (creditScore < 50) {
                accountStatus = AccountStatus.FROZEN;
            }
        } else {
            creditScore += 2; // Return books on time and increase credit score.
        }
    }

    public Date calculateDueDate(Date borrowDate, int periodDays) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(borrowDate);
        cal.add(Calendar.DAY_OF_MONTH, periodDays);
        return cal.getTime();
    }

    public BorrowRecord findBorrowRecord(Book book) {
        for (BorrowRecord record : borrowedBooks) {
            if (record.getBook().equals(book)) {
                return record;
            }
        }
        return null;
    }
}
