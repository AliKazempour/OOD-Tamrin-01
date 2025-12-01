package models;

public class LuxuryRoom extends Room {
    public LuxuryRoom(String number, double price) {
        super(number, "luxury", price);
    }

    @Override
    public void addFreeDinner() {
        System.out.println("Free dinner added for luxury room " + getNumber());
    }
}
