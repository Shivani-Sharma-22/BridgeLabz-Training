import java.util.Scanner;

public class BMICalculationUsing2D {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            double weight = sc.nextDouble();
            while (weight <= 0) {
                weight = sc.nextDouble();
            }

            double height = sc.nextDouble();
            while (height <= 0) {
                height = sc.nextDouble();
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
