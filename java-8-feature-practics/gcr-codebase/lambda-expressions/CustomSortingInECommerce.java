package BridgeLabz_Day39_LambdaExpressions;

import java.util.*;

public class CustomSortingInECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", 20000, 4.5, 10),
                new Product("Laptop", 60000, 4.7, 15),
                new Product("Headphones", 3000, 4.2, 5)
        );
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        for(Product prod : products) {
            System.out.println(prod.name + " - " + prod.price);
        }
    }
}
