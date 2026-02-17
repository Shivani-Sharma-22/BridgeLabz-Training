package addressBook;
import java.util.*;
import java.io.*;
public class AddressBookService {
	
//	private ContactRepository repository = new ContactRepository();
	private AddressBookRepo repository = new AddressBookRepo();
	
	private Map<String, List<Contact>> cityMap = new HashMap<>();
    private Map<String, List<Contact>> stateMap = new HashMap<>();
	
	public void createAddressBook(String name) {
        if (repository.getAddressBook(name) == null) {
            repository.addAddressBook(name, new ContactRepository());
            System.out.println("Address Book '" + name + "' created.");
        } else {
            System.out.println("Address Book already exists!");
        }
    }
	
	
	//addContact
	public void addContact(String bookName,Contact contact) {
		ContactRepository book = repository.getAddressBook(bookName);
		if (book != null) {
            if (book.getAllContacts().contains(contact)) {
                System.out.println("Duplicate Entry! Contact already exists.");
            } else {
                book.addContact(contact);
                System.out.println("Contact added successfully.");
             // Add to City Map
                cityMap
                    .computeIfAbsent(contact.getCity(), k -> new ArrayList<>())
                    .add(contact);

                // Add to State Map
                stateMap
                    .computeIfAbsent(contact.getState(), k -> new ArrayList<>())
                    .add(contact);
            }
        } else {
            System.out.println("Address Book not found!");
        }
	}
	
	//display contacts
	public void displayContacts(String bookName) {
	    ContactRepository book = repository.getAddressBook(bookName);

	    Optional.ofNullable(book)
	            .ifPresent(b -> b.getAllContacts()
	                    .forEach(c -> System.out.println(
	                            c.getFirstName() + " " + c.getLastName()
	                                    + " | " + c.getCity()
	                                    + " | " + c.getPhoneNumber()
	                                    + " | " + c.getMail()
	                    )));
	}

	
	//edit Contact Number
	public void editPhoneNumber(String bookName, String name, long newNumber) {
	    Optional.ofNullable(repository.getAddressBook(bookName))
	            .flatMap(b -> b.findByFirstName(name))
	            .ifPresent(c -> c.setPhoneNumber(newNumber));
	}

	
	//edit Contact City
	public void editCity(String bookName, String name, String newCity) {
	    Optional.ofNullable(repository.getAddressBook(bookName))
	            .flatMap(b -> b.findByFirstName(name))
	            .ifPresent(c -> c.setCity(newCity));
	}

	
	//edit Contact Mail
	public void editMail(String bookName, String name, String newMail) {
	    Optional.ofNullable(repository.getAddressBook(bookName))
	            .flatMap(b -> b.findByFirstName(name))
	            .ifPresent(c -> c.setMail(newMail));
	}

	
	//deleteContact
	public void deleteContact(String bookName, String name) {
	    Optional.ofNullable(repository.getAddressBook(bookName))
	            .flatMap(b -> b.findByFirstName(name))
	            .ifPresent(c -> {
	                repository.getAddressBook(bookName).deleteContact(c);
	                System.out.println("Contact deleted.");
	            });
	}

	
	// Search person by City across all Address Books
	public void searchByCity(String city) {

	    boolean found = repository.getAllAddressBook().entrySet()
	            .stream()
	            .flatMap(entry ->
	                    entry.getValue().getAllContacts().stream()
	                            .filter(c -> c.getCity().equalsIgnoreCase(city))
	                            .map(c -> entry.getKey() + " -> " + c))
	            .peek(System.out::println)
	            .findAny()
	            .isPresent();

	    if (!found)
	        System.out.println("No person found in city: " + city);
	}

	
	// Search person by State across all Address Books
	public void searchByState(String state) {

	    boolean found = repository.getAllAddressBook().entrySet()
	            .stream()
	            .flatMap(entry ->
	                    entry.getValue().getAllContacts().stream()
	                            .filter(c -> c.getState().equalsIgnoreCase(state))
	                            .map(c -> entry.getKey() + " -> " + c))
	            .peek(System.out::println)
	            .findAny()
	            .isPresent();

	    if (!found)
	        System.out.println("No person found in state: " + state);
	}

	//view person by city
	
	public void viewPersonsByCity(String city) {

	    cityMap.getOrDefault(city, Collections.emptyList())
	            .forEach(c -> System.out.println(
	                    c.getFirstName() + " " + c.getLastName()
	                            + " | " + c.getPhoneNumber()
	            ));
	}

	// view person by state 
	public void viewPersonsByState(String state) {
		stateMap.getOrDefault(state, Collections.emptyList())
		.forEach(c->System.out.println(
				c.getFirstName()+" "+ c.getLastName()+ " | "+c.getPhoneNumber()));
	}
	
	// Count by City
	public void countByCity(String city) {

	    long count = cityMap.getOrDefault(city, Collections.emptyList())
	            .stream()
	            .count();

	    System.out.println("Number of persons in city '" + city + "': " + count);
	}


	// Count by State
	public void countByState(String state) {
	    long count = stateMap.getOrDefault(state, Collections.emptyList())
	    		.stream().count();
	    System.out.println("Number of persons in state "+ state+": "+ count);
	}
	
	//sort sort the entries in the address book alphabetically by Person’s name
	public void sortByPersonName(String name) {

	    ContactRepository book = repository.getAddressBook(name);

	    if (book == null) {
	        System.out.println("Address book not found!");
	        return;
	    }

	    book.getAllContacts()
	            .stream()
	            .sorted(Comparator.comparing(Contact::getFirstName))
	            .forEach(System.out::println);
	}
	// sort by city state or zip
	public void sortContacts(String bookName, String type) {

	    ContactRepository book = repository.getAddressBook(bookName);
	    if (book == null) return;

	    Comparator<Contact> comparator;

	    switch (type.toLowerCase()) {

	        case "city":
	            comparator = Comparator.comparing(Contact::getCity);
	            break;

	        case "state":
	            comparator = Comparator.comparing(Contact::getState);
	            break;

	        case "zip":
	            comparator = Comparator.comparingInt(Contact::getZip);
	            break;

	        default:
	            System.out.println("Invalid sort type");
	            return;
	    }

	    book.getAllContacts()
	            .stream()
	            .sorted(comparator)
	            .forEach(System.out::println);
	}

    //write to file
	public void writeToFile(String bookName, String filePath) {

	    ContactRepository book = repository.getAddressBook(bookName);

	    if (book == null) {
	        System.out.println("Address book not found!");
	        return;
	    }

	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

	        for (Contact c : book.getAllContacts()) {

	            writer.write(
	                    c.getFirstName() + "," +
	                    c.getLastName() + "," +
	                    c.getAddress() + "," +
	                    c.getCity() + "," +
	                    c.getState() + "," +
	                    c.getZip() + "," +
	                    c.getPhoneNumber() + "," +
	                    c.getMail()
	            );

	            writer.newLine();
	        }

	        System.out.println("Contacts saved successfully!");

	    } catch (IOException e) {
	        System.out.println("Error writing file!");
	    }
	}
    // read from file
	public void readFromFile(String bookName, String filePath) {

	    ContactRepository book = repository.getAddressBook(bookName);
	    if (book == null) return;

	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

	        String line;

	        while ((line = reader.readLine()) != null) {

	            String[] data = line.split(",");

	            Contact c = new Contact(
	                    data[0],
	                    data[1],
	                    data[2],
	                    data[3],
	                    data[4],
	                    Integer.parseInt(data[5]),
	                    Long.parseLong(data[6]),
	                    data[7]
	            );

	            book.addContact(c);
	        }

	        System.out.println("Loaded successfully!");

	    } catch (Exception e) {
	        System.out.println("Error reading file!");
	    }
	}


}
