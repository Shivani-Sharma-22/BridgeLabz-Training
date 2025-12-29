package scenariobased;

import java.util.Random;

public class EmplyabilityDilevered {

    static int wagePerHour = 20;
    static int fullDayHours = 8;
    static int partTimeHours = 4;
    static Random random = new Random();

    //main method
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        if (checkAttendance()) {
            dailyWage();
            partTimeWage();
            monthlyWage();
            wageTillCondition();
        } else {
            System.out.println("Employee is Absent");
        }
    }

    // UC1: Check Employee Present or Absent
    public static boolean checkAttendance() {
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
            return true;
        }
        return false;
    }

    // UC2: Daily Wage
    public static void dailyWage() {
        int dailyWage = wagePerHour * fullDayHours;
        System.out.println("Full day Employee Wage is " + dailyWage);
    }

    // UC3: Part Time Wage
    public static void partTimeWage() {
        int partTimeWage = wagePerHour * partTimeHours;
        System.out.println("Part Time Employee Wage is " + partTimeWage);
    }

    // UC5: Monthly Wage
    public static void monthlyWage() {
        int workingDaysPerMonth = 20;
        int monthlyWage = wagePerHour * fullDayHours * workingDaysPerMonth;
        System.out.println("The Wage for a month is " + monthlyWage);
    }

    // UC6: Wage till 100 hours OR 20 days
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
            } else {
                workHours = 0;
            }

            totalHours += workHours;
        }

        int totalWage = totalHours * wagePerHour;
        
        System.out.println("Wages for the provided condition is " + totalWage);
    }
}
