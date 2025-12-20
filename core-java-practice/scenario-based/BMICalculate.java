import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you height: ");
        int height = sc.nextInt();
        System.out.println("Eneter your weight: ");
        int weight = sc.nextInt();

        int BMI = weight / (height * height);

        if(BMI < 18.5){
            System.out.println(" Underweight ");
        }
        else if(BMI < 24.9 ){
            System.out.println("Normal");
        }
        else {
            System.out.println("OverWeight");
        }
        sc.close();
    }
}
