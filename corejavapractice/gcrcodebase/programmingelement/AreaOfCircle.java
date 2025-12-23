import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int area=(int) (3.14*radius*radius);
        System.out.print("Area of Circle: "+area);
        sc.close();
    }
}
