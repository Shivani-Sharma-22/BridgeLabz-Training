package gcrcodebase.programmingelement;

public class DividedPens {
    public static void main(String[] args) {
        int pens = 14;
        int student = 3;
        int divOfPen = pens/3;
        int totaldistruted = (divOfPen+divOfPen+divOfPen);
        int remaining = pens - totaldistruted;
        System.out.println("The pen Per Student is "+ divOfPen +" and the reamining pens not distributed is "+remaining);
    }
}
