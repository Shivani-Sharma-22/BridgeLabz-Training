package gcrcodebase.programmingelement;

import java.util.*;
public class YoungestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter age of Amar");
        int ageOfAmar = sc.nextInt();
        System.out.println("Enter age of Akbar");
        int ageOfAkbar = sc.nextInt();
        System.out.println("Enter age of Anothy");
        int ageOfAnthony  = sc.nextInt();
        System.out.println("Enter height of Amar");
        int heightOfAmar = sc.nextInt();
        System.out.println("Enter height of Akbar");
        int heightOfAkbar = sc.nextInt();
        System.out.println("Enter height of Anothy");
        int heightOfAnthony  = sc.nextInt();
        
        //find youngest person among three person
        if(ageOfAmar < ageOfAkbar && ageOfAmar < ageOfAnthony ){
            System.out.println("The aged person is Amar");
        }
        else if(ageOfAkbar < ageOfAmar && ageOfAkbar < ageOfAnthony){
            System.out.println("The aged person is Akbar ");
        }
        else{
            System.out.println("The aged person is Anothy");
        }
        //find the tallest person
        if(heightOfAmar > heightOfAkbar && heightOfAmar > heightOfAnthony ){
            System.out.println("The Tallest person is Amar");
        }
        else if(heightOfAkbar > heightOfAmar && heightOfAkbar > heightOfAnthony){
            System.out.println("The Tallest person is Akbar ");
        }
        else{
            System.out.println("The Tallest person is Anothy");
        }
        
    }
}
