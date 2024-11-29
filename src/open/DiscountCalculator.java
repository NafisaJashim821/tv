package open;

public class DiscountCalculator {

    private DiscountStrategy discountStrategy;
    public DiscountCalculator(DiscountStrategy discountStrategy){
        this.discountStrategy= discountStrategy;
    }
    public  double calculate (double amount){
        return  discountStrategy.calculateDiscount(amount);
    }
}
