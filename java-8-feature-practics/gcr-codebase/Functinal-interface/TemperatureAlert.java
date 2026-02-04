import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 40.0;

        Predicate<Double> isHighTemperature =
                temp -> temp > threshold;

        double currentTemp = 45.5;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("⚠ Alert! High Temperature");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
