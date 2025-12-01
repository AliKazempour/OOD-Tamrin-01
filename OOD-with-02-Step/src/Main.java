import constants.PaymentMethods;
import models.Customer;
import models.LuxuryRoom;
import constants.Notifier;
import services.NotificationFactory;
import services.PaymentProcessor;
import services.Reservation;
import models.Room;
import services.ReservationService;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "alikazempour83@gmail.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        NotificationFactory notificationFactory = new NotificationFactory();

        ReservationService service = new ReservationService(paymentProcessor, notificationFactory);
        service.makeReservation(res, PaymentMethods.PAYPAL, Notifier.SMS);
    }
}