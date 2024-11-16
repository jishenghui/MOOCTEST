package net.mooctest;

import net.mooctest.InvalidOperationException;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<User> users;
    private NotificationService notificationService;
    private AutoRenewalService autoRenewalService;
    private CreditRepairService creditRepairService;
    private InventoryService inventoryService;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        notificationService = new NotificationService();
        autoRenewalService = new AutoRenewalService();
        creditRepairService = new CreditRepairService();
        inventoryService = new InventoryService();
    }

    public void registerUser(User user) {
        if (user.getCreditScore() < 50) {
            System.out.println("Credit score is too low to register a user.");
        } else if (users.contains(user)) {
            System.out.println("User already exists.");
        } else {
            users.add(user);
            System.out.println("Successfully registered user:" + user.name);
        }
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("This book already exists.");
        } else {
            books.add(book);
            System.out.println("Successfully added book:" + book.getTitle());
        }
    }

    public void processReservations(Book book) {
        if (!book.isAvailable()) {
            System.out.println("The book is unavailable and cannot process reservations.");
            return;
        }

        Reservation nextReservation = book.getReservationQueue().poll();
        if (nextReservation != null) {
            User user = nextReservation.getUser();
            try {
                user.borrowBook(book);
                notificationService.sendNotification(user, "The book [\" + book.getTitle() + \"] you reserved is now available for borrowing.");
            } catch (Exception e) {
                System.out.println("An error occurred while processing the reservation:" + e.getMessage());
            }
        }
    }

    public void autoRenewBook(User user, Book book) {
        try {
            autoRenewalService.autoRenew(user, book);
            System.out.println("Successfully automatically renewed book:" + book.getTitle());
        } catch (Exception e) {
            System.out.println("Automatic renewal failed:" + e.getMessage());
        }
    }

    public void repairUserCredit(User user, double payment) {
        try {
            creditRepairService.repairCredit(user, payment);
            System.out.println("User credit repair is successful. Current credit score:" + user.getCreditScore());
        } catch (InvalidOperationException e) {
            System.out.println("Credit repair failed: " + e.getMessage());
        }
    }

    public void reportLostBook(User user, Book book) {
        try {
            inventoryService.reportLost(book, user);
            System.out.println("Book loss report is successful. Book:" + book.getTitle());
        } catch (Exception e) {
            System.out.println("Reporting loss failed:" + e.getMessage());
        }
    }

    public void reportDamagedBook(User user, Book book) {
        try {
            inventoryService.reportDamaged(book, user);
            System.out.println("Book damage report is successful. Book:" + book.getTitle());
        } catch (Exception e) {
            System.out.println("Reporting damage failed:" + e.getMessage());
        }
    }
}
