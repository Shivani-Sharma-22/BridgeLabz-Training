package BridgeLabz_Day37_CSV_Handling.CSV_Encrypt_Decrypt;

import java.io.*;
import java.util.Base64;

public class EncryptCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("secure.csv"));
        bw.write("ID,Email,Salary\n");
        String email = Base64.getEncoder().encodeToString("test@gmail.com".getBytes());
        String salary = Base64.getEncoder().encodeToString("60000".getBytes());
        bw.write("101," + email + "," + salary + "\n");
        bw.close();
        System.out.println("Encrypted CSV created");
    }
}
