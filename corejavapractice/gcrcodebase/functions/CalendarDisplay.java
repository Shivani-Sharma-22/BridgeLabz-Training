package gcrcodebase.functions;
import java.util.Scanner;
import java.time.LocalDate;

public class CalendarDisplay {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get number of days in month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    return 29;
                else
                    return 28;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        LocalDate date = LocalDate.of(year, month, 1);
        int startDay = date.getDayOfWeek().getValue(); // Mon=1 ... Sun=7
        startDay = startDay % 7; // make Sunday = 0

        int days = getDaysInMonth(month, year);

        // Print spaces before first date
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print dates
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
