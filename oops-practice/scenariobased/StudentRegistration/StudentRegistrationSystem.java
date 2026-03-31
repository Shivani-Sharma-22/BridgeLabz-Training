package StudentRegistration;

public class StudentRegistrationSystem {
	public static void main(String[] args) {
        RegistrationService service = new Registration();

        Student s1 = new Student("Deepak", 101);
        service.registerStudent(s1);

        service.enrollCourse(s1, "Math");
        service.enrollCourse(s1, "Physics");
        service.enrollCourse(s1, "Chemistry");
        service.enrollCourse(s1, "Biology"); // Exception here

        s1.viewCourses();

        service.dropCourse(s1, "Physics");
        s1.viewCourses();

        service.assignGrade(s1, "A");
        s1.viewGrade();
    }
}
