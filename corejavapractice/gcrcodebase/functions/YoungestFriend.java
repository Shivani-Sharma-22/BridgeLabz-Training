package gcrcodebase.functions;

import java.util.*;
public class YoungestFriend {
	public static int findYoungest(int[] age) {
		for(int i =0;i<age.length;i++) {
			if(age[i] > age[i+1] && age[i] > age[i+2]) {
				return age[i];
			}
			else if(age[i+1] > age[i] && age[i+1] > age[i+2]) {
				return age[i+1];
			}
			else {
				return age[i+2];
			}
		}
		return -1;
		
	}
	public static int findTallest(int[] age) {
		for(int i =0;i<age.length;i++) {
			if(age[i] > age[i+1] && age[i] > age[i+2]) {
				return age[i];
			}
			else if(age[i+1] > age[i] && age[i+1] > age[i+2]) {
				return age[i];
			}
			else {
				return age[i];
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		for(int i =0;i<height.length;i++) {
		System.out.println("enter the height " + (i + 1) + ": ");
		height[i] = sc.nextInt();
		}
		int[] age = new int[3];
		for(int i =0;i<age.length;i++) {
			System.out.println("enter the age " + (i + 1) + ": ");
			height[i] = sc.nextInt();
			}
		System.out.println("Youngest Person " + findYoungest(age) + "Tallest person :" + findTallest(age));
	}
}
