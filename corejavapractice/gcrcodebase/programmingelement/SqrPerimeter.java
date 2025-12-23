

import java.util.Scanner;

public class SqrPerimeter {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Fixed value for number of sides in a square
        final int NUMBER_OF_SIDES = 4;

        // Taking perimeter input from user
        double perimeter = input.nextDouble();

        // Calculating side length
        double sideLength = perimeter / NUMBER_OF_SIDES;

        // Displaying the result
        System.out.println("The length of the side is " + sideLength +
                " whose perimeter is " + perimeter);

        // Closing scanner
        input.close();
    }
}

