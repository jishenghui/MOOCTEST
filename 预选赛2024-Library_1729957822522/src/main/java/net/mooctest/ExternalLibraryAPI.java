package net.mooctest;

import java.util.Random;

class ExternalLibraryAPI {
    public static boolean checkAvailability(String bookTitle) {
        // Simulate the availability of books in an external library system.
        System.out.println("Check the availability of books in the external library system...");
        return new Random().nextBoolean();  // Randomly return available or unavailable.
    }

    public static void requestBook(String userId, String bookTitle) {
        // Simulate requesting books from an external library.
        System.out.println("Request successful: Borrow books from the external library. [" + bookTitle + "]，User ID:" + userId);
    }
}
