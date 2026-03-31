package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class ValidateCSV{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("users.csv"));
        String l;
        br.readLine();
        while((l = br.readLine()) != null){
            String[] d = l.split(",");
            if(!d[2].matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")||!d[3].matches("\\d{10}"))
                System.out.println("Invalid : "+l);
        }
        br.close();
    }
}