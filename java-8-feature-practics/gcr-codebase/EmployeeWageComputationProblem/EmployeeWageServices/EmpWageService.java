package EmployeeWageServices;


public interface EmpWageService {

    void addCompany(String name,
                    int wagePerHour,
                    int maxDays,
                    int maxHours);

    void computeEmployeeWage(String companyName);

    int getTotalWage(String companyName);

    void displayCompanyReport(String companyName);

    void displayAllCompanies();
}

