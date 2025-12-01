package services;

import constants.Notifier;
import constants.PaymentMethods;
import models.Reservation;

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

        System.out.println("Processing reservation for " + res.getCustomerName());

        
        PaymentStrategy strategy = paymentProcessor.getPaymentStrategy(paymentMethod);
        strategy.pay(res.totalPrice());

        
        NotificationSender sender = notificationFactory.create(notifier);
        sender.send(res.getCustomerContact(notifier), "Your reservation confirmed!");

        System.out.println("------------------------------");
    }
}