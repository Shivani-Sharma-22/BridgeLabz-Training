package gcrcodebase.functions;

import java.util.*;
public class FindFootballHeight {
	 public static int findSum(int[] heights) {
	        int sum = 0;
	        for (int h : heights) {
	            sum += h;
	        }
	        return sum;
	    }
	 public static double findMean(int[] heights) {
	        return (double) findSum(heights) / heights.length;
	    }

	    public static int findShortest(int[] heights) {
	        int min = heights[0];
	        for (int h : heights) {
	            if (h < min)
	                min = h;
	        }
	        return min;
	    }
	    public static int findTallest(int[] heights) {
	        int max = heights[0];
	        for (int h : heights) {
	            if (h > max)
	                max = h;
	        }
	        return max;
	    }
	    public static void main(String[] args) {

	        int[] heights = new int[11];

	        for (int i = 0; i < heights.length; i++) {
	            heights[i] = (int) (Math.random() * 101) + 150;
	        }

	        System.out.println("Heights:");
	        for (int h : heights)
	            System.out.print(h + " ");

	        System.out.println("\nShortest Height: " + findShortest(heights));
	        System.out.println("Tallest Height: " + findTallest(heights));
	        System.out.println("Mean Height: " + findMean(heights));
	    }

}
