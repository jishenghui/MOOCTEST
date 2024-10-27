package net.mooctest;

import net.mooctest.AccountStatus;
import net.mooctest.EmailException;
import net.mooctest.SMSException;

class NotificationService {
    public void sendNotification(User user, String message) {
        if (user.getAccountStatus() == AccountStatus.BLACKLISTED) {
            System.out.println("Blacklisted users cannot receive notifications.");
            return;
        }

        // Try sending an email first.
        try {
            sendEmail(user.getEmail(), message);
        } catch (EmailException e) {
            System.out.println("Email sending failed. Try sending a text message...");
            try {
                sendSMS(user.getPhoneNumber(), message);
            } catch (SMSException smsException) {
                System.out.println("Text message sending failed. Try using in-app notifications...");
                sendAppNotification(user, message);
            }
        }
    }

    public void sendEmail(String email, String message) throws EmailException {
        if (email == null || email.isEmpty()) {
            throw new EmailException("The user does not have an email address.");
        }
        System.out.println("Successfully sent email to " + email + ": " + message);
    }

    public void sendSMS(String phoneNumber, String message) throws SMSException {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new SMSException("The user does not have a phone number.");
        }
        System.out.println("Successfully sent text message to." + phoneNumber + ": " + message);
    }

    public void sendAppNotification(User user, String message) {
        // Suppose the user uses in-app notifications.
        System.out.println("Send an in-app notification to the user. [" + user.name + "]: " + message);
    }
}
