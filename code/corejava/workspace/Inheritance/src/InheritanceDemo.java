public class InheritanceDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 121;
		emp.name = "Abcd";
		emp.city = "Pune";
		emp.age = 23;
		emp.salary = 23324.23;
		emp.getEmpInfo();
		
		JavaDeveloper javaDev = new JavaDeveloper();
		javaDev.name = "Xyz";
		javaDev.city = "Pune";
		javaDev.age = 24;
		javaDev.id = 122;
		javaDev.salary = 33434.34;
		javaDev.langKnown = "Core Java, Adv,Java, Spring, Html, JS";
		javaDev.getEmpInfo();	
	}
}
class Person {
	String name;
	String city;
	int age;
	public void showInfo() {
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
		System.out.println("Age : " + age);
	}
}
// Employee IS-A Person
class Employee extends Person {
	int id;
	double salary;
	public void getEmpInfo() {
		System.out.println("Id : " + id);
		showInfo();
		System.out.println("Salary : " + salary);
	}
}
// JavaDeveloper IS-A Employee
class JavaDeveloper extends Employee { // 6 variable
	String langKnown;
}

