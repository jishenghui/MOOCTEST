package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.UserType;
import net.mooctest.AccountFrozenException;
import net.mooctest.InsufficientCreditException;
import net.mooctest.InvalidOperationException;
import net.mooctest.ReservationNotAllowedException;

import java.util.*;
abstract class User {
    protected String name;
    protected String userId;
    protected UserType userType;
    protected double fines;
    protected int creditScore;
    protected List<BorrowRecord> borrowedBooks;
    protected List<Reservation> reservations;
    protected AccountStatus accountStatus;
    protected String email;
    protected String phoneNumber;

    public User(String name, String userId, UserType userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        this.fines = 0.0;
        this.creditScore = 100;
        this.borrowedBooks = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.accountStatus = AccountStatus.ACTIVE;
    }

    public abstract void borrowBook(Book book) throws Exception;

    public abstract void returnBook(Book book) throws Exception;

    // The user pays the fine.
    public void payFine(double amount) {
        if (accountStatus == AccountStatus.BLACKLISTED) {
            throw new IllegalStateException("");
        }
        if (amount > fines) {
            throw new IllegalArgumentException("If the user is on the blacklist, they cannot pay the fine.");
        }
        fines -= amount;
        System.out.println("Paid a fine of " + amount + " yuan.");
        if (fines == 0) {
            if (accountStatus == AccountStatus.FROZEN) {
                System.out.println("The fine has been cleared and the account status is restored.");
                accountStatus = AccountStatus.ACTIVE;
            }
        } else {
            System.out.println("There is still a fine of " + fines + " yuan to be paid.");
        }
    }

    public double getFines() {
        return fines;
    }

    // The user reserves a book.
    public void reserveBook(Book book) throws Exception {
        if (accountStatus == AccountStatus.BLACKLISTED) {
            throw new IllegalStateException("Blacklisted users cannot reserve books.");
        }
        if (accountStatus == AccountStatus.FROZEN) {
            throw new AccountFrozenException("The account is frozen and books cannot be reserved.");
        }
        if (reservations.contains(book)) {
            throw new ReservationNotAllowedException("This book has already been reserved.");
        }
        if (creditScore < 50) {
            throw new InsufficientCreditException("Insufficient credit score. Cannot reserve books.");
        }
        if (!book.isAvailable()) {
            System.out.println("The book is unavailable and has been added to the reservation queue.");
        }
        Reservation reservation = new Reservation(book, this);
        book.addReservation(reservation);
        reservations.add(reservation);
    }

    public void cancelReservation(Book book) throws Exception {
        Reservation reservation = findReservation(book);
        if (reservation == null) {
            throw new InvalidOperationException("This book has not been reserved.");
        }
        book.removeReservation(reservation);
        reservations.remove(reservation);
    }

    protected Reservation findReservation(Book book) {
        for (Reservation reservation : reservations) {
            if (reservation.getBook().equals(book)) {
                return reservation;
            }
        }
        return null;
    }

    public void receiveNotification(String message) {
        if (accountStatus == AccountStatus.BLACKLISTED) {
            System.out.println("Blacklisted users cannot receive notifications.");
        } else {
            System.out.println("Notify user [" + name + "]: " + message);
        }
    }

    public void addScore(int points) {
        if (accountStatus == AccountStatus.BLACKLISTED) {
            throw new IllegalStateException("Blacklisted users cannot increase their credit score.");
        }
        creditScore += points;
        System.out.println("Credit score increased by " + points + ". Current credit score: " + creditScore);
    }

    public void deductScore(int points) {
        creditScore -= points;
        if (creditScore < 0) {
            creditScore = 0;
        }
        if (creditScore < 50 && accountStatus != AccountStatus.BLACKLISTED) {
            accountStatus = AccountStatus.FROZEN;
            System.out.println("The credit score is too low. The account has been frozen.");
        }
        System.out.println("Credit score decreased by " + points + ". Current credit score: " + creditScore);
    }

    public int getCreditScore() {
        return creditScore;
    }

    public List<BorrowRecord> getBorrowedBooks() {
        return borrowedBooks;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
    public BorrowRecord findBorrowRecord(Book book) {
        for (BorrowRecord record : borrowedBooks) {
            if (record.getBook().equals(book)) {
                return record;
            }
        }
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
