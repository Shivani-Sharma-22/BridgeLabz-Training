import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<Integer> sensorReadings = List.of(
            45, 72, 88, 60, 95
        );

        int threshold = 70;

        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading ->
                          System.out.println("High Reading Detected: " + reading)
                      );
    }
}
