package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.InvalidOperationException;

class CreditRepairService {
    public void repairCredit(User user, double payment) throws InvalidOperationException {
        if (payment < 10) {
            throw new InvalidOperationException("The minimum payment amount is 10 yuan.");
        }
        user.addScore((int) payment / 10);  // For every 10 yuan paid, 1 credit point is restored.
        if (user.getCreditScore() >= 60) {
            user.setAccountStatus(AccountStatus.ACTIVE);  // Restore account status.
        }
    }
}
