package services;

public class OnSitePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid on site: " + amount);
    }
}
