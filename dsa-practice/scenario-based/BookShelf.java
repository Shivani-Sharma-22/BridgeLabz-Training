import java.util.*;
import java.util.LinkedList;

class Book{
	int bookId;
	String title;
	String genre;
	
	public Book(int bookId, String title,String genre) {
		this.bookId = bookId;
		this.genre = genre;
		this.title = title;
	}
//	@Override
    public String toString() {
        return bookId + " - " + title;
    }
}
class BookService{
	private HashMap<String, LinkedList<Book>> bookMap = new HashMap<>();
    
	// optional: to avoid duplicate book IDs
    private HashSet<Integer> bookIds = new HashSet<>();
	public void addBook(int bookId,String genre,String title) {
		if(bookIds.contains(bookId)) {
			System.out.println("Book with ID " + bookId + " already exists");
            return;
		}
		Book book = new Book(bookId, title, genre);
		bookMap.computeIfAbsent(genre, g -> new LinkedList<>()).add(book);
        bookIds.add(bookId);

        System.out.println("Book added successfully");
	}
	public void removeBook(int id) {
		if(!bookIds.contains(id)) {
			System.out.println("Book not found");
            return;
		}
		for(LinkedList<Book> list:bookMap.values()) {
			Iterator<Book> itr = list.iterator();
			while (itr.hasNext()) {
                if (itr.next().bookId == id) {
                    itr.remove();
                    bookIds.remove(id);
                    System.out.println("Book removed successfully");
                    return;
                }
           }
	   }
    }
	public void displayBook() {
		if (bookMap.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }
		for (String genre : bookMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : bookMap.get(genre)) {
                System.out.println("  " + book);
            }
        }
	}
}
public class BookShelf {
	public static void main(String[] args) {

        BookService service = new BookService();

        service.addBook(101, "Java Basics", "Java");
        service.addBook(102, "OOPS Concepts", "Java");
        service.addBook(103, "Fairy Tales", "Story");

        service.displayBook();

        service.removeBook(102);

        service.displayBook();
    }
}
