package DesignPatterns;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryCatalog catalog = LibraryCatalog.getInstance();
        User student = UserFactory.createUser("student", "Shivani");
        User faculty = UserFactory.createUser("faculty", "Dr. Sharma");
        student.showRole();
        faculty.showRole();
        catalog.addObserver(student);
        catalog.addObserver(faculty);
        Book book = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();
        catalog.addBook(book);
    }
}
