package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.UserType;
import net.mooctest.*;

import java.util.*;
class VIPUser extends User {
    private static final int BORROW_LIMIT = 10;
    private static final int BORROW_PERIOD = 30;
    private boolean hasExtendedBorrow;

    public VIPUser(String name, String userId) {
        super(name, userId, UserType.VIP);
        this.hasExtendedBorrow = false;
    }

    @Override
    public void borrowBook(Book book) throws Exception {
        if (accountStatus == AccountStatus.BLACKLISTED) {
            throw new IllegalStateException("Blacklisted users cannot borrow books.");
        }
        if (accountStatus == AccountStatus.FROZEN) {
            throw new AccountFrozenException("The account is frozen and cannot borrow books.");
        }
        if (borrowedBooks.size() >= BORROW_LIMIT) {
            throw new InvalidOperationException("The maximum number of books borrowed has been reached.");
        }
        if (fines > 50) {
            accountStatus = AccountStatus.FROZEN;
            throw new OverdueFineException("The fine is too high. The account has been frozen.");
        }
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("The book is unavailable and cannot be borrowed.");
        }
        if (creditScore < 50) {
            throw new InsufficientCreditException("The credit score is too low and borrowing is not allowed.");
        }

        // VIP users can borrow rare and precious books.
        book.borrow();
        Date borrowDate = new Date();
        Date dueDate = calculateDueDate(borrowDate, BORROW_PERIOD);
        BorrowRecord record = new BorrowRecord(book, this, borrowDate, dueDate);
        borrowedBooks.add(record);
        creditScore += 2; // Increase credit score.
        System.out.println(name + " Successfully borrowed " + book.getTitle() + ". Due date: " + dueDate);
    }

    @Override
    public void returnBook(Book book) throws Exception {
        BorrowRecord record = findBorrowRecord(book);
        if (record == null) {
            throw new InvalidOperationException("This book has not been borrowed.");
        }
        book.returnBook();
        record.setReturnDate(new Date());
        borrowedBooks.remove(record);
        fines += record.calculateFine(); // Update fine.
        if (fines > 100) {
            accountStatus = AccountStatus.FROZEN;
            throw new OverdueFineException("The fine is too high. The account has been frozen.");
        }
        if (record.getFineAmount() > 0) {
            creditScore -= 3; // For VIP users, 3 points will be deducted for overdue.
        } else {
            creditScore += 3; // Return books on time. VIP users will gain 3 points.
        }
    }

    public void extendBorrowPeriod(Book book) throws Exception {
        if (hasExtendedBorrow) {
            throw new InvalidOperationException("This book has already been renewed.");
        }
        BorrowRecord record = findBorrowRecord(book);
        if (record == null) {
            throw new InvalidOperationException("This book has not been borrowed.");
        }
        record.extendDueDate(7); // Renew for 7 days.
        hasExtendedBorrow = true;
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
