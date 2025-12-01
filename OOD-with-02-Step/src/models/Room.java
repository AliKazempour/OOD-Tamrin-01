package models;

public class Room {
    public String number;
    public String type; // "standard" or "luxury"
    public double price;

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
