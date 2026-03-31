import java.util.*;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = null;

            System.out.print("Do you want to create array? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                arr = new int[n];

                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            System.out.println("Value = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Error: Array is not initialized!");
        }
    }
}
