package services;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}
