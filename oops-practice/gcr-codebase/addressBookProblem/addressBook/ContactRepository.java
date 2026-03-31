package addressBook;

import java.util.*;

public class ContactRepository {
	private ArrayList<Contact> contacts = new ArrayList<>();
	
	//create
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	//read
	public List<Contact> getAllContacts() {
        return contacts;
    }
	
	public Optional<Contact> findByFirstName(String firstName) {
	    return contacts.stream()
	            .filter(c -> c.getFirstName().equalsIgnoreCase(firstName))
	            .findFirst();
	}


	
	//delete
	public void deleteContact(Contact contact) {
		contacts.remove(contact);
	}
}
