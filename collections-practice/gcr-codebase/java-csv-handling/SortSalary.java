package BridgeLabz_Day37_CSV_Handling;

import java.io.*;
import java.util.*;

public class SortSalary{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        List<String[]> ll = new ArrayList<>();br.readLine();String s;
        while((s = br.readLine()) != null){
            ll.add(s.split(","));
        }
        ll.sort((a, b)->Integer.parseInt(b[3]) - Integer.parseInt(a[3]));
        for(int i = 0; i <5 ; i++) {
            System.out.println(ll.get(i)[1]);
        }
        br.close();
    }
}