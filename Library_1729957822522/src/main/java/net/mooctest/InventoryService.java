package net.mooctest;

import net.mooctest.InvalidOperationException;

class InventoryService {
    public void reportLost(Book book, User user) throws Exception {
        if (!user.getBorrowedBooks().contains(book)) {
            throw new InvalidOperationException("The user has not borrowed this book and cannot report it as lost.");
        }
        // The user needs to pay compensation.
        double compensation = book.getTotalCopies() * 50;  // Assume that each book is compensated for 50 yuan.
        user.payFine(compensation);
        // Update book inventory.
        book.setTotalCopies(book.getTotalCopies() - 1);
        book.setAvailableCopies(book.getAvailableCopies() - 1);
    }

    public void reportDamaged(Book book, User user) throws Exception {
        if (!user.getBorrowedBooks().contains(book)) {
            throw new InvalidOperationException("The user has not borrowed this book and cannot report it as damaged.");
        }
        // The user needs to pay the repair cost.
        double repairCost = 30;  // Suppose the repair cost is 30 yuan.
        user.payFine(repairCost);
        // Set the book status to under repair.
        book.setInRepair(true);
    }
}
