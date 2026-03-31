package EmployeeWageuserInterface;



import EmployeeWageServices.EmpWageService;
import EmployeeWageServices.EmpWageServiceImpl;
import EmployeeWagerepository.EmpWage;
import EmployeeWagerepository.EmpWageRepository;

import java.util.Scanner;

public class WageApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // dependency wiring
        EmpWageService service =
                new EmpWageServiceImpl(new EmpWage());


        boolean running = true;

        while (running) {

            System.out.println("\n==== Employee Wage System ====");
            System.out.println("1. Add Company");
            System.out.println("2. Compute Employee Wage");
            System.out.println("3. View Company Report");
            System.out.println("4. Get Total Wage");
            System.out.println("5. Display All Companies");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Company name: ");
                    String name = scanner.nextLine();

                    System.out.print("Wage per hour: ");
                    int wage = scanner.nextInt();

                    System.out.print("Max working days: ");
                    int days = scanner.nextInt();

                    System.out.print("Max working hours: ");
                    int hours = scanner.nextInt();

                    service.addCompany(name, wage, days, hours);
                    System.out.println("Company added!");
                    break;

                case 2:
                    System.out.print("Enter company name: ");
                    service.computeEmployeeWage(scanner.nextLine());
                    System.out.println("Wage computed!");
                    break;

                case 3:
                    System.out.print("Enter company name: ");
                    service.displayCompanyReport(scanner.nextLine());
                    break;

                case 4:
                    System.out.print("Enter company name: ");
                    String company = scanner.nextLine();

                    int total = service.getTotalWage(company);

                    if (total == 0) {
                        System.out.println("Company not found!");
                    } else {
                        System.out.println("Total Wage: " + total);
                    }
                    break;


                case 5:
                    service.displayAllCompanies();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
        System.out.println("Application closed.");
    }
}

