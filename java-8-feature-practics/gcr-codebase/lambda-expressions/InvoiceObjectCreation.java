package BridgeLabz_Day39_LambdaExpressions;

import java.util.*;
import java.util.function.Function;

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList("TX1001", "TX1002", "TX1003");
        Function<String, Invoice> creator = Invoice::new;
        List<Invoice> invoices = new ArrayList<>();

        for(String id : transactions) {
            invoices.add(creator.apply(id));
        }

        invoices.forEach(i -> i.show());
    }
}
