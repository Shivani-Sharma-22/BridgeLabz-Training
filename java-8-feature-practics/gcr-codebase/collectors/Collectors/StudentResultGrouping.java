package Collectors;


import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String n, String g) {
        name = n; grade = g;
    }
    String getName() {
        return name;
    }
    String getGrade() {
        return grade;
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Aman","A"),
                new Student("Riya","B"),
                new Student("Karan","A"),
                new Student("Neha","B")
        );
        Map<String,List<String>> resultMap = students.stream()
                        .collect(Collectors.groupingBy(Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));
        System.out.println(resultMap);
    }
}

