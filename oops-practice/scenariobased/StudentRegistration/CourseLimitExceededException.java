package StudentRegistration;

//custom exception class
public class CourseLimitExceededException extends Exception {
	public CourseLimitExceededException(String message) {
		super(message);
	}
}
