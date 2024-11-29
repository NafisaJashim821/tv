package inversion;

public class PaymentService {
    private PaymentMethod paymentMethod;
    public PaymentService( PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }
     public void makePayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
