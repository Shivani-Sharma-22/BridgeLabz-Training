package review;



import java.util.Random;

public class ReviewQuestion1{

    static int wagePerHour = 20;
    static int fullDayHours = 8;
    static int partTimeHours = 4;
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        if (checkAttendance()) {
            dailyWage();
            partTimeWage();
            monthlyWage();
            wageTillCondition();
        }
    }

    // UC1 + UC4: Attendance using Random + Switch Case
    public static boolean checkAttendance() {

        int attendance = random.nextInt(2); // 0-Absent, 1-Present

        switch (attendance) {
            case 1:
                System.out.println("Employee is Present");
                return true;

            default:
                System.out.println("Employee is Absent");
                return false;
        }
    }

    // UC2
    public static void dailyWage() {
        int dailyWage = wagePerHour * fullDayHours;
        System.out.println("Full day Employee Wage is " + dailyWage);
    }

    // UC3
    public static void partTimeWage() {
        int partTimeWage = wagePerHour * partTimeHours;
        System.out.println("Part Time Employee Wage is " + partTimeWage);
    }

    // UC5
    public static void monthlyWage() {
        int workingDaysPerMonth = 20;
        int monthlyWage = wagePerHour * fullDayHours * workingDaysPerMonth;
        System.out.println("The Wage for a month is " + monthlyWage);
    }

    // UC6
    public static void wageTillCondition() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < 100 && totalDays < 20) {
            totalDays++;

            int empCheck = random.nextInt(3); // 0-Absent,1-Full,2-Part
            int workHours = 0;

            if (empCheck == 1) {
                workHours = fullDayHours;
            } else if (empCheck == 2) {
                workHours = partTimeHours;
            }

            totalHours += workHours;
        }

        int totalWage = totalHours * wagePerHour;
        System.out.println("Wages for the provided condition is " + totalWage);
    }
}
