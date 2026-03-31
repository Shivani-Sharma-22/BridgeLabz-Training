package BridgeLabz_Day37_CSV_Handling;

import java.io.*;
import java.util.*;

public class MergeCSV{
    public static void main(String[] args)throws Exception{
        Map<String,String> map = new HashMap<>();
        BufferedReader b1=new BufferedReader(new FileReader("students1.csv"));
        b1.readLine();
        String str;
        while((str = b1.readLine()) != null){
            map.put(str.split(",")[0], str);
       }
       BufferedReader b2 = new BufferedReader(new FileReader("students2.csv"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("merged.csv"));
       bw.write("ID, Name, Age, Marks, Grade\n");
       b2.readLine();
       while((str = b2.readLine()) != null){
            String[] strArr = str.split(",");
            if(map.containsKey(strArr[0])){
                bw.write(map.get(strArr[0])+","+ strArr[1]+","+ strArr[2]+"\n");
            }
       }
       bw.close();
       b1.close();
       b2.close();}
}