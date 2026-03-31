package scenariobased;

import java.util.*;
public class LineComparisionProblem {
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		//input for line one
		System.out.println("Inputs for Line One:");
		System.out.println("Enter X1:");
		double x1 = sc.nextDouble();
		System.out.println("Enter Y1:");
	    double y1 = sc.nextDouble();
	    System.out.println("Enter X2:");
		double x2 = sc.nextDouble();
		System.out.println("Enter Y2:");
		double y2 = sc.nextDouble();
		//Length of line one
		System.out.println("Length of Line one");
		Double LineOneLength =  findLengthOfLine(x1,y1,x2,y2);
		System.out.println(LineOneLength);
		//input for second line
		System.out.println("Inputs for Line Two:");
		System.out.println("Enter X3:");
		double x3 = sc.nextDouble();
		System.out.println("Enter Y3:");
	    double y3 = sc.nextDouble();
	    System.out.println("Enter X4:");
		double x4 = sc.nextDouble();
		System.out.println("Enter Y4:");
		double y4 = sc.nextDouble();
		//length of line two
		System.out.println("Length of Line Two");
		Double LineTwoLength =  findLengthOfLine(x3,y3,x4,y4);
		System.out.println(LineTwoLength);
		
		System.out.println(isEquals(LineOneLength,LineTwoLength));
		System.out.println(comparingTwoLines(LineOneLength,LineTwoLength));
		
	}
	//UC1
	public static Double findLengthOfLine(double x1,double y1,double x2,double y2) {
		double lenght = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		return lenght;
	}
	
	//Uc2
	public static boolean isEquals(Double LineOneLength1, Double LineTwoLength2 ) {
		return LineOneLength1.equals(LineTwoLength2);
	}
	// UC3
	public static String comparingTwoLines(Double LineOneLength, Double LineTwoLength) {

	    int result = LineOneLength.compareTo(LineTwoLength);

	    if (result > 0) {
	        return "Line One is Greater than Line Two";
	    }
	    else if (result == 0) {
	        return "Both Lines are Equal";
	    }
	    else {
	        return "Line One is Less than Line Two";
	    }
	}

	
}
