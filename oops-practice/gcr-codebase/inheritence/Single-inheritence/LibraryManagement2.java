
//Super Class
  class Bookkk{
	String title;
	int publicationYear;
	
	Bookkk(String title,int publicationYear){
		this.publicationYear = publicationYear;
		this.title = title;
	}
	public void displayInfo() {
		System.out.println("Tilte: "+ title);
		System.out.println("Publication Year: "+publicationYear);
	}
	
}

   class Author extends Bookkk{
	String name;
	String bio;
	
	public Author(String name,String bio,String title, int publicationYear){
		super(title,publicationYear);
		this.bio = bio;
		this.name = name;
	}
	public void displayInfo() {
		super.displayInfo(); //book details
		System.out.println("Name: "+ name);
		System.out.println("Bio: "+bio);
	}
	
}
public class LibraryManagement2 {
	public static void main(String[] args) {
		Author auth = new Author("The 7 Habits ",
				"The 7 Habits of Highly Effective People is considered by many to be one of the most inspiring and impactful books about personal success ever written.",
				"The 7 Habits of Highly Effective People"
				,1990);
		
		auth.displayInfo();
	}
}

