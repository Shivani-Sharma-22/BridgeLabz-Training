package gcrcodebase.programmingelement;

public class DiscountAmount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercentage = 10;
        int calDiscount = (fee/discountPercentage);
        int payFees = (fee - calDiscount);
        System.out.println("The discount amount is INR "+ calDiscount+" and final discounted fee is INR "+ payFees);

    }
}
