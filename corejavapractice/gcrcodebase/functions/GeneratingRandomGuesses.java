package gcrcodebase.functions;

import java.util.Random;
import java.util.Scanner;

public class GeneratingRandomGuesses {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int low = 1;
    	int high = 100;
    	
    	while(true) {
    		int guess = generateGuess( low, high);
    		System.out.println("Computer guess "+guess);
    		String feedback = sc.next();
    		
    		if(feedback.equals("correct")) {
    			break;
    		}
    		else if(feedback.equals("low")) {
    			low = guess+1;
    		}else if(feedback.equals("high")) {
    			high = guess - 1;
    		}
    	}
    	System.out.println("Game Over");
    	sc.close();
    }

	private static int generateGuess(int low, int high) {
		// TODO Auto-generated method stub
		return low+(int)(Math.random()*(high-low+1));
	}
}
