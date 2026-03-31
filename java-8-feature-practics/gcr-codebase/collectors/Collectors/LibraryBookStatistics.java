package Collectors;

import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }
    String getGenre() {
        return genre;
    }
    int getPages() {
        return pages;
    }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> booksList = List.of(
                new Book("Fiction",300),
                new Book("Fiction",500),
                new Book("Science",400)
        );
        Map<String, IntSummaryStatistics> statsMap =
                booksList.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));
        System.out.println(statsMap);
    }
}

