package scenariobased;

import java.util.*;
public class PushUpCounts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] weekPushUp = new int[7];
		for(int i =0;i<7;i++) {
			weekPushUp[i] = sc.nextInt();
		}
		 int[] result = calculateAvgTotal(weekPushUp);

	        System.out.println("Total Push-ups = " + result[0]);
	        System.out.println("Average Push-ups = " + result[1]);
	}

	private static int[] calculateAvgTotal(int[] weekPushUp) {
		// TODO Auto-generated method stub
		int total = 0;
		int avg = 0;
		for(int i =0;i<weekPushUp.length;i++) {
			total += weekPushUp[i];
			avg = total/weekPushUp.length;
		}
		return new int[] { total, avg };

	}
}
