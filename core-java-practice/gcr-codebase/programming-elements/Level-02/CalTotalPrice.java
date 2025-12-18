import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class CalTotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //Taking unitPrice input from user
    int unitPrice = input.nextInt();
    //Taking quantity input from user
    int quantity = input.nextInt();

    int totalPurchase = (unitPrice*quantity);
    System.out.println(" The total purchase price is INR "+totalPurchase+"if the quantity "+"and unit price is INR"+unitPrice);
    }

}
