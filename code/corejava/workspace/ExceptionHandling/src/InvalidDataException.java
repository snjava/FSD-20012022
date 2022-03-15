
public class InvalidDataException extends RuntimeException {

	private String message;
	public InvalidDataException(String message) {
		this.message = message;
	}
	
	public void printMsg() {
		System.err.println("Got Invalid Data Exception : " + message);
	}
	
}
