import java.util.*;

class Doctor {
    private String name;
    private String specialty;
    private boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public boolean isWeekendAvailable() {
        return weekendAvailable;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr. Amit", "Cardiology", true),
            new Doctor("Dr. Riya", "Neurology", false),
            new Doctor("Dr. Neha", "Orthopedics", true),
            new Doctor("Dr. Rahul", "Dermatology", true)
        );

        doctors.stream()
               .filter(Doctor::isWeekendAvailable)
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
