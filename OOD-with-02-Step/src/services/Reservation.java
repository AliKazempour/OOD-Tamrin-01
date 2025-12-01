package services;

import models.Customer;
import models.Room;
import constants.Notifier;

public class Reservation {
    public Room room;
    public Customer customer;
    public int nights;

    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }

    public double totalPrice() {
        return room.price * nights;
    }

    public String getCustomerName() {
        return customer.name;
    }

    public String getCustomerEmail() {
        return customer.email;
    }

    public String getCustomerMobile() {
        return customer.mobile;
    }

    public String getContactByNotifier(Notifier notifier) {
        switch (notifier) {
            case EMAIL:
                return customer.email;

            case SMS:
                return customer.mobile;

            default:
                return customer.email;
        }
    }
}
