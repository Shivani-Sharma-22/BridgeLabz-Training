package EmployeeWagemodel;


import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {

    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    private int totalWage;
    private int totalHoursWorked;
    private int totalDaysWorked;

    private List<DailyWage> dailyWages;
    private List<EmployeeAttendance> attendanceRecords;

    public CompanyEmpWage(String companyName,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;

        this.dailyWages = new ArrayList<>();
        this.attendanceRecords = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public int getTotalDaysWorked() {
        return totalDaysWorked;
    }

    public void setTotalDaysWorked(int totalDaysWorked) {
        this.totalDaysWorked = totalDaysWorked;
    }

    public List<DailyWage> getDailyWages() {
        return dailyWages;
    }

    public List<EmployeeAttendance> getAttendanceRecords() {
        return attendanceRecords;
    }

    public void addDailyWage(DailyWage wage) {
        dailyWages.add(wage);
    }

    public void addAttendance(EmployeeAttendance attendance) {
        attendanceRecords.add(attendance);
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + companyName + '\'' +
                ", totalWage=" + totalWage +
                ", totalHours=" + totalHoursWorked +
                ", totalDays=" + totalDaysWorked +
                '}';
    }
}

