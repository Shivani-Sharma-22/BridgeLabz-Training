
public class Students {
	static String universityName = "GLA University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;
    
     Students(String name, int rollNumber, String grade) {
    	 this.name = name;
         this.rollNumber = rollNumber;
         this.grade = grade;
         totalStudents++;
    }
     static void displayTotalStudents() {
         System.out.println("Total Students: " + totalStudents);
     }
     void displayStudent() {
         System.out.println(
             "Name: " + name +
             ", Roll: " + rollNumber +
             ", Grade: " + grade
         );
     }
     public static void main(String[] args) {
    	 Students s1 = new Students("Aman", 1, "A");
         Students s2 = new Students("Neha", 2, "A+");
         Students s3 = new Students("Rahul", 3, "B");

         System.out.println("University Name:"+ universityName);
         s1.displayStudent();
         s2.displayStudent();
         s3.displayStudent();

         Students.displayTotalStudents();
	}
}
