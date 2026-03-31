package BridgeLabz_Day37_CSV_Handling.CSV_Encrypt_Decrypt;

import java.io.*;
import java.util.Base64;

public class DecryptCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("secure.csv"));
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] strArr = line.split(",");
            String email = new String(Base64.getDecoder().decode(strArr[1]));
            String salary = new String(Base64.getDecoder().decode(strArr[2]));
            System.out.println("Email : " + email + ", Salary : " + salary);
        }
        br.close();
    }
}
