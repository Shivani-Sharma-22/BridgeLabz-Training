package FileBackupScheduler;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BackupScheduler scheduler = new BackupScheduler();

        while(true) {
            System.out.println("\n1. Add Backup Task");
            System.out.println("2. Execute All Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            try {
                switch(ch) {
                    case 1:
                        System.out.print("Enter Task ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Folder Path: ");
                        sc.nextLine();
                        String path = sc.nextLine();

                        System.out.print("Enter Priority (1-10): ");
                        int priority = sc.nextInt();

                        scheduler.addTask(new BackupTask(id, path, priority));
                        break;

                    case 2:
                        scheduler.executeTasks();
                        break;

                    case 3:
                        System.exit(0);
                }
            }
            catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

