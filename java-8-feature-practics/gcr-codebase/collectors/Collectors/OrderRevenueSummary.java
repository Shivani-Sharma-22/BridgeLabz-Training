package Collectors;

import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String c, double a) {
        customer = c; amount = a;
    }
    String getCustomer() {
        return customer;
    }
    double getAmount() {
        return amount;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Aman",500),
                new Order("Aman",700),
                new Order("Riya",300)
        );

        Map<String,Double> revenue =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomer,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        System.out.println(revenue);
    }
}

