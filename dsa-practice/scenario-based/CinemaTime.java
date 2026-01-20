import java.util.ArrayList;
import java.util.List;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

class MovieManager {

    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    // Add movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        titles.add(title);
        times.add(time);
    }

    // Search movie by keyword
    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).contains(keyword)) {
                System.out.println(
                        String.format("Movie: %s | Time: %s", titles.get(i), times.get(i))
                );
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
    }

    // Display all movies
    public void displayAllMovies() {
        try {
            for (int i = 0; i < titles.size(); i++) {
                System.out.println(
                        "Movie: " + titles.get(i) + " | Time: " + times.get(i)
                );
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error while accessing movie list");
        }
    }

    // Convert List to Array (Report)
    public void generateReport() {
        String[] movieArray = titles.toArray(new String[0]);
        System.out.println("Movie Report:");
        for (String movie : movieArray) {
            System.out.println(movie);
        }
    }

    // Time validation (HH:MM)
    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) return false;

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}

public class CinemaTime {
    public static void main(String[] args) {

        MovieManager manager = new MovieManager();

        try {
            manager.addMovie("Avengers", "18:30");
            manager.addMovie("Inception", "21:00");
            manager.addMovie("Avatar", "25:99"); // Invalid time
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAll Movies:");
        manager.displayAllMovies();

        System.out.println("\nSearch Result:");
        manager.searchMovie("Ave");

        System.out.println("\nPrintable Report:");
        manager.generateReport();
    }
}

