import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(DateUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println(DateUtils.formatDate(today, "MMM dd, yyyy"));
    }
}
