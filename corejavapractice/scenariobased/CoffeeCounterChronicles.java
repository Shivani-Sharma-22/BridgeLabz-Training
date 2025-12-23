package scenariobased;

import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        while (true) {
            // taking input for Coffee type and quantity
            System.out.println("Enter your coffee type: ");
            String coffeeType = sc.next();
            
            double price = 0.0;
            if (coffeeType.equals("exit")) {
                break;
            }
            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();

            switch (coffeeType) {
                case "Latte":
                    price = 300;
                    

                    break;
                case "Mocha":
                    price = 250;
                    break;

                case "Cappuccino":
                    price = 400;
                    break;

                case "ColdCoffee":
                    price = 199;
                    break;

                default:
                    System.out.println("Invalid Coffee Type");
            }
            double bill = quantity*price+(price*0.18);
            System.out.println("Total bill = "+ bill);
        }
        sc.close();
    }
}
