package open;

public class VIPCustomerDiscount implements DiscountStrategy{

    public double calculateDiscount(double amount) {
        return amount * 0.3; // 30% discount for VIP customers
    }
}
