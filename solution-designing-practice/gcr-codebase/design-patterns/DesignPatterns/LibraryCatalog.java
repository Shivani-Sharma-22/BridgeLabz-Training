package DesignPatterns;

import java.util.*;

public class LibraryCatalog {
    private static LibraryCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book.getTitle());
    }

    private void notifyObservers(String bookName) {
        for (Observer obs : observers) {
            obs.update("New book available : " + bookName);
        }
    }
}
