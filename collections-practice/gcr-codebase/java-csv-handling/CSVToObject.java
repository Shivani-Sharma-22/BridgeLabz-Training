package BridgeLabz_Day37_CSV_Handling;

import java.io.*;
import java.util.*;

class Student{
    String id;
    String name;
    String age;
    String marks;
}

public class CSVToObject{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        List<Student> list = new ArrayList<>();
        String str;
        br.readLine();
        while((str = br.readLine()) != null){
            String[] d = str.split(",");
            Student s = new Student();
            s.id = d[0];
            s.name = d[1];
            s.age = d[2];
            s.marks = d[3];
            list.add(s);
        }
        list.forEach(s->System.out.println(s.name));
     }
}