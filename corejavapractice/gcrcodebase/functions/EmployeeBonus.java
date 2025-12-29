package gcrcodebase.functions;

public class EmployeeBonus {

    // Method 1: Generate salary and years of service
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2]; // [salary, years]

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (Math.random() * 90000); // 5 digit salary
            data[i][1] = 1 + (int)(Math.random() * 10);  // years of service (1–10)
        }
        return data;
    }

    // Method 2: Calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][4];
        // [oldSalary, years, bonus, newSalary]

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = salary + bonus;
        }
        return result;
    }

    // Method 3: Display table and totals
    public static void displayResult(double[][] result) {

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n",
                    (i + 1),
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);

            totalOld += result[i][0];
            totalBonus += result[i][2];
            totalNew += result[i][3];
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t%.2f\n",
                totalOld, totalBonus, totalNew);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        double[][] employeeData = generateEmployeeData();
        double[][] finalData = calculateBonus(employeeData);
        displayResult(finalData);
    }
}
