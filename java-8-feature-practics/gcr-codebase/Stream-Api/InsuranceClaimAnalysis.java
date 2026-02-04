import java.util.*;
import java.util.stream.Collectors;

class Claim {
    private String claimType;
    private double amount;

    public Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health", 50000),
            new Claim("Health", 30000),
            new Claim("Vehicle", 20000),
            new Claim("Vehicle", 40000),
            new Claim("Life", 100000)
        );

        Map<String, Double> averageClaimAmount =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      Claim::getClaimType,
                      Collectors.averagingDouble(Claim::getAmount)
                  ));

        averageClaimAmount.forEach(
            (type, avg) -> System.out.println(type + " : " + avg)
        );
    }
}
