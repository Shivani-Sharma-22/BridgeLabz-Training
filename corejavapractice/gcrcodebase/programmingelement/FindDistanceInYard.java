
import java.util.Scanner;
public class FindDistanceInYard{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fixed conversion values
        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;

        // Taking distance input from user in feet
        double distanceInFeet = input.nextDouble();

        // Converting feet to yards
        double distanceInYards = distanceInFeet / FEET_PER_YARD;

        // Converting yards to miles
        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        // Displaying the result
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);

        input.close();

    }
}


