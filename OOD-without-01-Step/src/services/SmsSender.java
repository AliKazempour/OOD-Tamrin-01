package services;

class SmsSender {
    public void sendSms(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}
