import java.util.*;
import java.util.stream.*;

class Movie {
    private String name;
    private double rating;
    private int releaseYear;

    public Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}

public class TopTrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Movie A", 9.2, 2024),
            new Movie("Movie B", 8.7, 2023),
            new Movie("Movie C", 9.5, 2024),
            new Movie("Movie D", 8.9, 2022),
            new Movie("Movie E", 9.1, 2023),
            new Movie("Movie F", 8.8, 2024),
            new Movie("Movie G", 9.0, 2021)
        );

        movies.stream()
              .filter(movie -> movie.getReleaseYear() >= 2023) // recent movies
              .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
