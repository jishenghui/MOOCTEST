package net.mooctest;

import net.mooctest.AccountStatus;

import java.util.Date;
class Reservation {
    private Book book;
    private User user;
    private Date reservationDate;
    private int priority;

    public Reservation(Book book, User user) {
        this.book = book;
        this.user = user;
        this.reservationDate = new Date();
        this.priority = calculatePriority();
    }

    // Calculate reservation priority.
    public int calculatePriority() {
        // 用户的信用分越高，优先级就越高。
        int priority = user.getCreditScore();

        // If the user is a VIP, the priority will be additionally increased by 10 points.
        if (user instanceof VIPUser) {
            priority += 10;
            System.out.println("For VIP users' reservations, the priority is enhanced.");
        }

        // If the user has a record of delayed return in past borrowings, the priority is reduced.
        for (BorrowRecord record : user.getBorrowedBooks()) {
            if (record.getReturnDate() != null && record.getReturnDate().after(record.getDueDate())) {
                priority -= 5; // For each delayed return of a book, the priority is reduced by 5.
                System.out.println("Delayed return records will lower the reservation priority.");
            }
        }

        // Blacklisted users cannot make reservations.
        if (user.getAccountStatus() == AccountStatus.BLACKLISTED) {
            System.out.println("Blacklisted users cannot reserve books.");
            return -1;
        }

        return priority;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public int getPriority() {
        return priority;
    }
}
