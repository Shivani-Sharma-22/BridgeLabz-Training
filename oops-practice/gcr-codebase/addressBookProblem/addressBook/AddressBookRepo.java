package addressBook;
import java.util.*;
public class AddressBookRepo {
	public HashMap<String, ContactRepository> books = new HashMap<>();
	
	public void addAddressBook(String name, ContactRepository book) {
        books.put(name, book);
    }
	
	public ContactRepository getAddressBook(String name) {
        return books.get(name);
    }
	
	public Map<String, ContactRepository> getAllAddressBook() {
        return books;
    }
}
