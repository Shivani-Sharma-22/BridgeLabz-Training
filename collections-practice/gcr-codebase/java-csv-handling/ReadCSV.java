package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class ReadCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;
        br.readLine();
        while((line = br.readLine()) != null){
            String[] str = line.split(",");
            System.out.println(str[0] + " " + str[1] + " " + str[2] + " " + str[3]);
        }
        br.close();
    }
}