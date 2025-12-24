package gcrcodebase.methods;

import java.util.*;
public class TrignometricFunction {
	public static double[] calculateTrigonometricFunctions(double radian) {
		double sinTheta = Math.sin(radian);
		double cosThetha = Math.cos(radian);
		double tanThetha = Math.tan(radian);
		
		return new double[] {sinTheta,cosThetha,tanThetha};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the angle");
		double angle = sc.nextDouble();
		
		double radian = Math.toRadians(angle);
		double[] result = calculateTrigonometricFunctions(radian);
		System.out.println("sine valve "+result[0]+", cosine value "+result[1]+", tangent value "+result[2]);
	}
}
