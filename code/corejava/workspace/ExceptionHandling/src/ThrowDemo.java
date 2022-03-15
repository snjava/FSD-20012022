
public class ThrowDemo {

	public static void main(String[] args) {
		printData("A", "Pune");
	}
	
	public static void printData(String name, String city) {
		
		if(!(name.length()>=2 && name.length()<=15)) { // identify scenario 
			throw new InvalidDataException("Invalid Name");
			
			//IllegalArgumentException ex = new IllegalArgumentException("Invalid Name"); // Object of Exception
			//throw ex; // throw object of Exception
		}
		
		System.out.println("Name : "+ name);
		System.out.println("City : "+city);
	}

}
