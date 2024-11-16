package net.mooctest;

import net.mooctest.BookType;
import net.mooctest.BookNotAvailableException;
import net.mooctest.InvalidOperationException;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
class Book {
    private String title;
    private String author;
    private String isbn;
    private BookType bookType;
    private int totalCopies;
    private int availableCopies;
    private boolean inRepair; // the book under repair or not
    private boolean isDamaged; // the book is damaged or not
    private Queue<Reservation> reservationQueue;

    public Book(String title, String author, String isbn, BookType bookType, int totalCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.bookType = bookType;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        this.inRepair = false;
        this.isDamaged = false;
        this.reservationQueue = new PriorityQueue<>(Comparator.comparingInt(Reservation::getPriority));
    }

    // Judge whether the book is available.
    public boolean isAvailable() {
        if (inRepair) {
            System.out.println("The book is under repair and temporarily unavailable.");
            return false;
        }
        if (isDamaged) {
            System.out.println("The book is damaged and cannot be borrowed.");
            return false;
        }
        if (availableCopies <= 0) {
            System.out.println("There are no available copies.");
            return false;
        }
        return true;
    }

    // Borrow a book.
    public void borrow() throws Exception {
        if (!isAvailable()) {
            throw new BookNotAvailableException("The book is unavailable and cannot be borrowed.");
        }
        availableCopies--;
        System.out.println("Successfully borrowed the book. Remaining copies:" + availableCopies);
    }

    // Return a book.
    public void returnBook() throws InvalidOperationException {
        if (availableCopies >= totalCopies) {
            throw new InvalidOperationException("All copies are in the library.");
        }
        availableCopies++;
        System.out.println("Successfully returned the book. Currently available copies for borrowing:" + availableCopies);
    }

    // Report book damage.
    public void reportDamage() {
        if (isDamaged) {
            System.out.println("This book is damaged. No need to report it again.");
        } else {
            isDamaged = true;
            System.out.println("Report book damage.");
        }
    }

    // Report that the book is under repair.
    public void reportRepair() {
        if (inRepair) {
            System.out.println("The book is already under repair.");
        } else {
            inRepair = true;
            System.out.println("Report book repair.");
        }
    }

    // Add a reservation.
    public void addReservation(Reservation reservation) {
        reservationQueue.add(reservation);
        System.out.println("Reservation added successfully.");
    }

    // Remove reservation.
    public void removeReservation(Reservation reservation) {
        if (reservationQueue.contains(reservation)) {
            reservationQueue.remove(reservation);
            System.out.println("Reservation cancelled successfully.");
        } else {
            System.out.println("This reservation is not in the reservation queue.");
        }
    }

    public BookType getBookType() {
        return bookType;
    }

    public Queue<Reservation> getReservationQueue() {
        return reservationQueue;
    }

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
