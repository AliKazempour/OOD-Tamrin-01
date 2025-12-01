package services;

import constants.Notifier;
import constants.PaymentMethods;

public class ReservationService {

    private final PaymentProcessor paymentProcessor;
    private final NotificationFactory notificationFactory;

    public ReservationService(PaymentProcessor paymentProcessor,
            NotificationFactory notificationFactory) {
        this.paymentProcessor = paymentProcessor;
        this.notificationFactory = notificationFactory;
    }

    public void makeReservation(Reservation res,
            PaymentMethods paymentMethod,
            Notifier notifier) {
        PaymentStrategy strategy = paymentProcessor.getPaymentStrategy(paymentMethod);
        strategy.pay(res.totalPrice());

        NotificationSender sender = notificationFactory.create(notifier);
        String contact = res.getContactByNotifier(notifier);
        sender.send(contact, "Your reservation confirmed!");

        System.out.println("--------------------------------");
    }
}

