package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class LargeCSV{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("large.csv"));
        int counter = 0;
        while(br.readLine() != null){
            counter++;
            if(counter % 100 == 0){
                System.out.println(counter);
            }
        }
        br.close();
    }
}