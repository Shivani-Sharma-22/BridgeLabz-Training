import java.util.Scanner;

public class FindBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =10;
        //Initialize emp array
        int[] age = new int[10];
        for(int i =0;i<n;i++){
            age[i] = sc.nextInt();
        }
        for(int i =0;i<age.length;i++){
            if(age[i] < 0){
                System.out.println("Invalid");
            }
            else if(age[i] >= 18){
                System.out.println("The student with the age "+ i +" can vote");
            }
            else{
                System.out.println("The student with the age "+ i +" can not vote");
            }
        }
        sc.close();
    }
}
