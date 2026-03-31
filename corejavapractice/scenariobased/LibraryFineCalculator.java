package scenariobased;

import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter Due Date (day): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine = ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine");
            }
        }

        sc.close();
    }
}

