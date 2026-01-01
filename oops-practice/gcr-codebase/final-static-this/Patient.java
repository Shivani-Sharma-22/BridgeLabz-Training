class Patient {
    static String hospitalName = "Mathura City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("Ramesh", 45, "Diabetes", 201);
        Patient p2 = new Patient("Sita", 30, "Fever", 202);
        Patient p3 = new Patient("Amit", 60, "Heart Problem", 203);

        System.out.println("Hospital Name: " + hospitalName);

        p1.displayPatient();
        p2.displayPatient();
        p3.displayPatient();

        Patient.getTotalPatients();
    }
}
