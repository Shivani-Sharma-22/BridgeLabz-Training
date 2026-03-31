import java.io.*;

// Class marked for backup
class UserData implements Serializable {
    private int id;
    private String name;

    public UserData(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Backup utility
public class BackupSystem {
    public static void main(String[] args) {
        UserData user = new UserData(1, "Shivani");

        try {
            FileOutputStream fos = new FileOutputStream("backup.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.close();

            System.out.println(" Backup successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
