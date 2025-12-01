package services;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by PayPal: " + amount);
    }
}
