import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        

        double areaOfTriangle = (1.0/2.0)*base*height;
        System.out.println("Area of triangle is "+ areaOfTriangle);
    }
}
