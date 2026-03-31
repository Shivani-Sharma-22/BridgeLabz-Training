package EmployeeWagemodel;


public class DailyWage {

    private int dayNumber;
    private int hoursWorked;
    private int dailyWage;

    public DailyWage(int dayNumber, int hoursWorked, int dailyWage) {
        this.dayNumber = dayNumber;
        this.hoursWorked = hoursWorked;
        this.dailyWage = dailyWage;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(int dailyWage) {
        this.dailyWage = dailyWage;
    }

    @Override
    public String toString() {
        return "DailyWage{" +
                "day=" + dayNumber +
                ", hours=" + hoursWorked +
                ", wage=" + dailyWage +
                '}';
    }
}

