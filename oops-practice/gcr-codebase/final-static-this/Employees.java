
class Employees {
    static String companyName = "BridgeLabz";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employees(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployee() {
        System.out.println(
            "Employee ID: " + id +
            ", Name: " + name +
            ", Designation: " + designation
        );
    }

    // main method
    public static void main(String[] args) {
        Employees e1 = new Employees("Rohit", 101, "Java Developer");
        Employees e2 = new Employees("Anita", 102, "QA Engineer");
        Employees e3 = new Employees("Karan", 103, "Backend Developer");

        System.out.println("Company Name: " + companyName);
        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();

        Employees.displayTotalEmployees();
    }
}

