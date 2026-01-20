import java.util.Scanner;

// Abstract base class
abstract class Employee {

    // immutable core data
    private final String name;
    private final double salary;

    // cached bonus for performance
    protected final double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    // getters (no setters -> immutability)
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // polymorphic method
    public double getBonus() {
        return bonus;
    }
}

// Manager subclass
class Manager extends Employee {

    public Manager(String name, double salary) {
        // 10% bonus calculated once and cached
        super(name, salary, salary * 0.10);
    }
}

// Developer subclass
class Developer extends Employee {

    public Developer(String name, double salary) {
        // 5% bonus only if salary > 50000
        super(name, salary, salary > 50000 ? salary * 0.05 : 0.0);
    }
}

// Main class with user input
public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee role (Manager / Developer):");
        String role = sc.nextLine();

        System.out.println("Enter employee name:");
        String name = sc.nextLine();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        Employee employee;

        if (role.equalsIgnoreCase("Manager")) {
            employee = new Manager(name, salary);
        } else if (role.equalsIgnoreCase("Developer")) {
            employee = new Developer(name, salary);
        } else {
            System.out.println("Invalid employee role");
            return;
        }

        System.out.printf("Bonus: %.2f%n", employee.getBonus());
    }
}
