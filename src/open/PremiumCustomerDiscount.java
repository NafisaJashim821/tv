package open;

public class PremiumCustomerDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }
}
