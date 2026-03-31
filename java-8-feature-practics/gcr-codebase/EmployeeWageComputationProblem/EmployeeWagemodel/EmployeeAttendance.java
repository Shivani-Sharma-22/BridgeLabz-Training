package EmployeeWagemodel;



public class EmployeeAttendance {

    private int dayNumber;
    private int attendanceType; // 0 = Absent, 1 = Part-time, 2 = Full-time
    private int workingHours;

    public EmployeeAttendance(int dayNumber, int attendanceType, int workingHours) {
        this.dayNumber = dayNumber;
        this.attendanceType = attendanceType;
        this.workingHours = workingHours;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(int attendanceType) {
        this.attendanceType = attendanceType;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "EmployeeAttendance{" +
                "day=" + dayNumber +
                ", type=" + attendanceType +
                ", hours=" + workingHours +
                '}';
    }
}

