package open;

public class Main {
    public static void main(String[] args) {


        DiscountCalculator regularDiscount = new DiscountCalculator(new RegularCustomerDiscount());
        System.out.println("Regular Customer Discount: " + regularDiscount.calculate(1000));
        DiscountCalculator premiumDiscount = new DiscountCalculator(new PremiumCustomerDiscount());
        System.out.println(premiumDiscount.calculate(2000));
        DiscountCalculator  vipDiscount = new DiscountCalculator(new VIPCustomerDiscount());
        System.out.println(vipDiscount.calculate(3000));
    }
}

