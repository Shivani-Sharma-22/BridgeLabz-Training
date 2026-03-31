

public class Library {
	static String libName = "Egmore Library";
	static int bookCount = 0;
    String title;
	String  author;
	final String isbn;
	
	Library(String title,String  author,String isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		bookCount++;
	}
	
	//method to display library name
	public static void totalBook() {
		System.out.println("Total Number of Book is:"+bookCount);
	}
	//method to display the account details
		public void displayBookDetails() {
			if(this instanceof Library) {
				System.out.println("Library Name: "+libName);
				System.out.println("Title: "+title);
				System.out.println("Author: "+author);
				System.out.println("ISBN: " + isbn);
			}
			else {
				System.out.println("invalid Book instance: ");
			}
		}
		//main method 
		public static void main(String[] args) {
			Library book1 = new Library("Effective Java","Joshua Bloch","978-0134685991");
			//Display the details
			book1.displayBookDetails();
			
			
			
		}
}

