import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = List.of(
            120.50, 121.75, 119.80, 122.30
        );

        stockPrices.forEach(price ->
            System.out.println("Stock Price Update: " + price)
        );
    }
}
