package BridgeLabz_Day37_CSV_Handling;

import java.io.*;
import java.util.*;

public class DetectDuplicates{
    public static void main(String[] args)throws Exception{
        Set<String> set =new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        br.readLine();
        String str;
        while((str = br.readLine()) != null){
            if(!set.add(str.split(",")[0])) {
                System.out.println(str);
            }
        }
        br.close();
    }
}