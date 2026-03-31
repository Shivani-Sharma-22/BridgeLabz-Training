package EmployeeWageServices;


import EmployeeWagemodel.CompanyEmpWage;
import EmployeeWagemodel.DailyWage;
import EmployeeWagemodel.EmployeeAttendance;
import EmployeeWagerepository.EmpWageRepository;

import java.util.Random;

public class EmpWageServiceImpl implements EmpWageService {

    private EmpWageRepository repository;
    private Random random = new Random();

    // Attendance constants
    private static final int ABSENT = 0;
    private static final int PART_TIME = 1;
    private static final int FULL_TIME = 2;

    public EmpWageServiceImpl(EmpWageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addCompany(String name, int wagePerHour, int maxDays, int maxHours) {

        CompanyEmpWage company =
                new CompanyEmpWage(name, wagePerHour, maxDays, maxHours);

        repository.addCompany(company);
    }

    @Override
    public void computeEmployeeWage(String companyName) {

        CompanyEmpWage company = repository.getCompany(companyName);

        if (company == null) {
            System.out.println("Company not found!");
            return;
        }

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalDays < company.getMaxWorkingDays()
                && totalHours < company.getMaxWorkingHours()) {

            totalDays++;

            int attendance = random.nextInt(3);
            int hours = getWorkingHours(attendance);

            if (totalHours + hours > company.getMaxWorkingHours())
                break;

            totalHours += hours;

            int dailyWageAmount = hours * company.getWagePerHour();
            totalWage += dailyWageAmount;

            // Save attendance record
            EmployeeAttendance attendanceRecord =
                    new EmployeeAttendance(totalDays, attendance, hours);

            company.addAttendance(attendanceRecord);

            // Save daily wage record
            DailyWage wageRecord =
                    new DailyWage(totalDays, hours, dailyWageAmount);

            company.addDailyWage(wageRecord);
        }

        company.setTotalDaysWorked(totalDays);
        company.setTotalHoursWorked(totalHours);
        company.setTotalWage(totalWage);

        repository.updateCompany(company);
    }

    private int getWorkingHours(int attendanceType) {

        switch (attendanceType) {
            case PART_TIME:
                return 4;

            case FULL_TIME:
                return 8;

            default:
                return 0;
        }
    }

   
    @Override
    public int getTotalWage(String companyName) {

        CompanyEmpWage company = repository.getCompany(companyName);

        if (company == null) {
            System.out.println("Company not found!");
            return 0;
        }

        return company.getTotalWage();
    }


    @Override
    public void displayCompanyReport(String companyName) {

        CompanyEmpWage company = repository.getCompany(companyName);

        if (company == null) {
            System.out.println("Company not found!");
            return;
        }

        System.out.println(company);

        System.out.println("Daily Wage Records:");
        company.getDailyWages().forEach(System.out::println);
    }

    @Override
    public void displayAllCompanies() {

        repository.getAllCompanies()
                .forEach(System.out::println);
    }
}

