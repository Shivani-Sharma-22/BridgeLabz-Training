public class findProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellPrice = 191;
        int profit = sellPrice - costPrice;
        int profitPer = profit / (costPrice*100);
        System.out.println("the cost price is INR "+ costPrice +" and selling price is INR " + sellPrice);
        System.out.println("the profit is INR "+ profit +" and the profit percentage "+ profitPer);
    }
}
