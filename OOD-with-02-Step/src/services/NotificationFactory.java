package services;

import constants.Notifier;

public class NotificationFactory {

    public NotificationSender create(Notifier notifier) {
        switch (notifier) {
            case EMAIL:
                return new EmailSender();
            case SMS:
                return new SmsSender();
            default:
                throw new IllegalArgumentException("Unsupported notifier: " + notifier);
        }
    }
}