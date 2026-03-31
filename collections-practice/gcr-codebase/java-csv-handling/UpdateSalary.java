package BridgeLabz_Day37_CSV_Handling;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated.csv"));
        String line;
        line = br.readLine();
        bw.write(line + "\n");
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equalsIgnoreCase("IT")) {
                int salary = Integer.parseInt(d[3]);
                salary = (int) (salary * 1.10);
                d[3] = String.valueOf(salary);
            }
            bw.write(String.join(",", d) + "\n");
        }
        br.close();
        bw.close();
        System.out.println("Salary updated successfully");
    }
}
