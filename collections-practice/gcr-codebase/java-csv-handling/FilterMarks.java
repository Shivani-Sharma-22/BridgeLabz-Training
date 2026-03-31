package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class FilterMarks{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String str;
        br.readLine();
        while((str = br.readLine()) != null){
            String[] strArr = str.split(",");
            if(Integer.parseInt( strArr[3]) > 80 ) {
                System.out.println(strArr[1]);
            }
        }
        br.close();
    }
}