package FactoryRobotHazardAnalyzer;

import java.util.Scanner;

public class FactoryRobotMain {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();
        try {
            System.out.println("Enter Arm Precision (0.0 - 1.0) : ");
            double armPrecision = myScan.nextDouble();

            System.out.println("Enter Worker Density (1 - 20) : ");
            int workerDensity = myScan.nextInt();
            myScan.nextLine();

            System.out.println("Enter Machinery State (Worn/Faulty/Critical) : ");
            String machineryState = myScan.nextLine().trim();

            double risk = auditor.calculateHazardRisk(armPrecision, workerDensity, machineryState);

            System.out.println("Robot Hazard Risk Score : " + risk);

        }
        catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}