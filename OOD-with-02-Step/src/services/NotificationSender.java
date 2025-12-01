package services;

public interface NotificationSender {
    void send(String to, String message);
}