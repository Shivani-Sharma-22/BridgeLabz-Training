package linkedList;
import java.util.Scanner;

class StudentNode {
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning.");
    }

    // Add at end
    public void addAtEnd(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Student added at end.");
    }

    // Add at specific position
    public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Student added at position " + position);
    }

    // Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student record deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student record deleted.");
        }
    }

    // Search by Roll Number
    public void searchByRollNo(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade
    public void updateGrade(int rollNo, String newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    private void displayStudent(StudentNode student) {
        System.out.println("-----------------------");
        System.out.println("Roll No : " + student.rollNo);
        System.out.println("Name    : " + student.name);
        System.out.println("Age     : " + student.age);
        System.out.println("Grade   : " + student.grade);
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        while (true) {
            System.out.println("\n--- Student Record Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> list.addAtBeginning(1, "Shivani", 21, "A");
                case 2 -> list.addAtEnd(2, "Rahul", 22, "B");
                case 3 -> list.addAtPosition(2, 3, "Amit", 20, "A+");
                case 4 -> list.deleteByRollNo(2);
                case 5 -> list.searchByRollNo(1);
                case 6 -> list.updateGrade(1, "A+");
                case 7 -> list.displayAll();
                case 8 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
