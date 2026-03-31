package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {
    public static void main(String[] args) {
        try {
            List<Employee> emp = new ArrayList<>();
            emp.add(new Employee(1, "Kanhiya", 26));
            emp.add(new Employee(2, "Bhavy", 23));
            emp.add(new Employee(3, "Naman", 28));
            ObjectMapper mapper = new ObjectMapper();
            String jsonArr = mapper.writeValueAsString(emp);
            System.out.println(jsonArr);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
