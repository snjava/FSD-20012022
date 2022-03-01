
// javac StaticKeyword.java  ---  javac fileName.java
// java StaticKeyword        ---  java className

public class StaticKeyword {
	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee.display();
	}
}


class Employee {
	static String companyName = "Abc pvt.ltd.";
	int id = 10;
	
	public static void display() {
		System.out.println("Static method display");
		System.out.println("Company Name : " + companyName);
		Employee emp = new Employee();
		System.out.println("Id : " + emp.id);
	}
}







