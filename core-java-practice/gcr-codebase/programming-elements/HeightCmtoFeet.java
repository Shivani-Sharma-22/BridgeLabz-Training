import java.util.Scanner;

public class HeightCmtoFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        double CmPerInch = 2.54;
        int InchedPerFoot = 12;

        // Converting centimeters to total inches
        double totalInches = height / CmPerInch;

        // Calculating feet and remaining inches
        int heightInFeet = (int) (totalInches / InchedPerFoot);
        double remainingInches = totalInches % InchedPerFoot;

        // Displaying the result
        System.out.println("Your height in cm is " + height +
                " while in feet is " + heightInFeet +
                " and inches is " + remainingInches);
    }
}
