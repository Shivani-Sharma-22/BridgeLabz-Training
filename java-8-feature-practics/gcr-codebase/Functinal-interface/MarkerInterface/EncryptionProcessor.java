package MarkerInterface;

public class EncryptionProcessor {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println(" Encrypting sensitive data...");
        } else {
            System.out.println("No encryption required");
        }
    }

    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("123456789", 50000);

        process(account);
    }
}

