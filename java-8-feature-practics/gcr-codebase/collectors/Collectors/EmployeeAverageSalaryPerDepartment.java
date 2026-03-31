package Collectors;

import java.util.*;
import java.util.stream.*;

class Employee {
    String department;
    double salary;

    Employee(String d, double s) {
        department = d; salary = s;
    }
    String getDepartment() {
        return department;
    }
    double getSalary() {
        return salary;
    }
}

public class EmployeeAverageSalaryPerDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("IT",50000),
                new Employee("IT",70000),
                new Employee("HR",40000)
        );
        Map<String,Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));
        System.out.println(avgSalary);
    }
}

