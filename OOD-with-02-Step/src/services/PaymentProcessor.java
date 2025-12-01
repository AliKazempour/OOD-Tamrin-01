package services;

import constants.PaymentMethods;

public class PaymentProcessor {

    public PaymentStrategy getPaymentStrategy(PaymentMethods method) {
        switch (method) {
            case CARD:
                return new CardPayment();
            case CASH:
                return new CashPayment();
            case PAYPAL:
                return new PaypalPayment();
            case ONSITE:
                return new OnSitePayment();
            default:
                throw new IllegalArgumentException("Unsupported payment method: " + method);
        }
    }
}