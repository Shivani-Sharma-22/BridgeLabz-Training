package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class CountRows{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        int counter = 0;
        br.readLine();
        while(br.readLine() != null) {
            counter++;
        }
        br.close();
        System.out.println(counter);
    }
}