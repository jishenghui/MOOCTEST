package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.AccountFrozenException;
import net.mooctest.InsufficientCreditException;
import net.mooctest.InvalidOperationException;

class AutoRenewalService {
    public void autoRenew(User user, Book book) throws Exception {
        if (user.getAccountStatus() != AccountStatus.ACTIVE) {
            throw new AccountFrozenException("The account is frozen and cannot be automatically renewed.");
        }
        if (book.getReservationQueue().size() > 0) {
            throw new InvalidOperationException("The book has been reserved by other users and cannot be renewed.");
        }
        if (user.getCreditScore() < 60) {
            throw new InsufficientCreditException("The credit score is too low to renew the loan.");
        }
        // Update the due date of the borrowing record.
        BorrowRecord record = user.findBorrowRecord(book);
        if (record != null) {
            record.extendDueDate(14);  // The default renewal period is 14 days.
        } else {
            throw new InvalidOperationException("The borrowing record of this book is not found.");
        }
    }
}
