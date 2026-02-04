package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonCreate {
    public static void main(String[] args) {
        // subjects array
        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Physics");
        subjects.put("Computer Science");

        // student object
        JSONObject student = new JSONObject();
        student.put("name", "Bhavy");
        student.put("age", 21);
        student.put("subjects", subjects);

        System.out.println(student.toString(2));
    }
}
