package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class WriteCSV {
    public static void main(String[] args)throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));
        bw.write("ID, Name, Department, Salary\n");
        bw.write("1, Alice, IT, 60000\n2, Bob, HR, 50000\n3, Charlie, Sales, 55000\n4," +
                " David, IT, 65000\n5, Eva, Finance, 70000\n");
        bw.close();
    }
}