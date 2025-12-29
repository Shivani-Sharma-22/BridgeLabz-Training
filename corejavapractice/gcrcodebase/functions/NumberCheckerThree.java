package gcrcodebase.functions;

public class NumberCheckerThree {
	 // Count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Store digits in array
    public static int[] getDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    //Reverse the digit array
    public static int[] reverseDigit(int[] digits) {
    	int[] rev = new int[digits.length];
    	for(int i = 0;i<digits.length;i++) {
    		rev[i] = digits[digits.length-1-i];
    	}
    	return rev;
    }
 // Compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] digits) {
    	int[] reversed = reverseDigit(digits);
    	return compareArrays(digits,reversed);
    }
    public static boolean duckNumber(int[] digits) {
    	for(int i :digits) {
    		if(i == 0) {
    			return true;
    		}
    	}
    	return false;
    }
}
