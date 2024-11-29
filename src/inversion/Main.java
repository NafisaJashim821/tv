package inversion;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(creditCardPayment);
        PaymentMethod payPalPayment = new PayPalPayment();
    paymentService =  new PaymentService(payPalPayment);
        paymentService.makePayment(150);
    }
}
