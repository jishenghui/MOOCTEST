package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.BookType;

import java.util.Date;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

class BorrowRecord {
    private Book book;
    private User user;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private double fineAmount;

    public BorrowRecord(Book book, User user, Date borrowDate, Date dueDate) {
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.fineAmount = 0.0;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
        this.fineAmount = calculateFine();
    }

    // Calculate fine.
    public double calculateFine() {
        if (returnDate == null || returnDate.before(dueDate)) {
            return 0.0;
        }

        // Calculate the number of overdue days.
        long overdueDays = (returnDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
        double baseFine = 1.0; // The basic fine per day is 1 yuan.
        if (book.getBookType() == BookType.RARE) {
            baseFine = 5.0;  // For rare books, the fine is 5 yuan per day.
        } else if (book.getBookType() == BookType.JOURNAL) {
            baseFine = 2.0;  // For periodicals, the fine is 2 yuan per day.
        }

        // Add more fine conditions.
        if (user.getAccountStatus() == AccountStatus.BLACKLISTED) {
            System.out.println("The user has been blacklisted and the fine is doubled.");
            baseFine *= 2;
        }

        // If the book is damaged, an additional fine is required.
        if (book.isDamaged()) {
            baseFine += 50.0;  // The additional fine for a damaged book is 50 yuan.
            System.out.println("The book is damaged. An additional fine of 50 yuan is imposed.");
        }

        return overdueDays * baseFine;
    }

    public Book getBook() {
        return book;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void extendDueDate(int extraDays) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dueDate);
        cal.add(Calendar.DAY_OF_MONTH, extraDays);
        dueDate = cal.getTime();
        System.out.println("The borrowing period has been extended to:" + dueDate);
    }
}
