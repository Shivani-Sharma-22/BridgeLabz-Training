
import java.util.*;
public class BonusOfEmployees {
    public static void main(String[] args) {
        //Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        //taking input salary,year from user
        int salary = sc.nextInt();
        int year = sc.nextInt();
        
        double bonus = 0.0;
        if(year > 5){
            bonus = salary * (0.05);
        }
        System.out.println("bonus of employees is " + bonus);
    }
}
