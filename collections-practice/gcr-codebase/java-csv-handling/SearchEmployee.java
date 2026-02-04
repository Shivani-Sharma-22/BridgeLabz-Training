package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class SearchEmployee{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String l;
        br.readLine();
        while((l = br.readLine()) != null){
            String[] str = l.split(",");
            if(str[1].equalsIgnoreCase("Alice"))
                System.out.println(str[2] + " " + str[3]);
        }
        br.close();
    }
}