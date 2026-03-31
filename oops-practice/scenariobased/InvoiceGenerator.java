// Custom Exception
class InvalidInvoiceFormatException extends Exception {
    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}

public class InvoiceGenerator {

    // Method to parse invoice string
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {

        if (!input.contains("-") || !input.contains("INR")) {
            throw new InvalidInvoiceFormatException("Invalid Invoice Format");
        }

        // Split by comma to get individual tasks
        String[] tasks = input.split(",");

        for (String task : tasks) {
            if (!task.contains("-")) {
                throw new InvalidInvoiceFormatException("Missing '-' in task: " + task);
            }
        }
        return tasks;
    }

    // Method to calculate total amount
    public static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;

        for (String task : tasks) {
            try {
                // Example: "Logo Design - 3000 INR"
                String[] parts = task.split("-");
                String amountPart = parts[1].replace("INR", "").trim();
                int amount = Integer.parseInt(amountPart);
                total += amount;
            } catch (Exception e) {
                throw new InvalidInvoiceFormatException("Invalid amount in task: " + task);
            }
        }
        return total;
    }

    // Main Method
    public static void main(String[] args) {

        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

        try {
            String[] tasks = parseInvoice(input);
            int totalAmount = getTotalAmount(tasks);

            System.out.println("Invoice Details:");
            for (String task : tasks) {
                System.out.println(task.trim());
            }
            System.out.println("Total Invoice Amount: " + totalAmount + " INR");

        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
