public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(121);
		e1.setName("Abc");
		e1.setAge(25);
		e1.displayEmpDetails();
	}
}

// POJO (Plain Old Java Object), Bean, Entity, Model, DTO(Data Transfer Object)
class Employee
{
	//=======Data Member========
	private int empId;
	private String name;
	private int age;
	private double salary;
	
	//=====Setter Methods=====
	public void setId(int id) {
		this.empId = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>=23 && age<=60) {
			this.age = age;
		} else {
			System.err.println("Invalid Age...");
			System.exit(0); // terminate the program manually 
		}
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//======Getter Methods=====
	public int getId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	
	//======Member Function======
	public void displayEmpDetails() {
		System.out.println("Id : " + empId);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}













