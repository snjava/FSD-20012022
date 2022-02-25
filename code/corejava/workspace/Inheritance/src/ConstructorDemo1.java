import java.util.Scanner;

public class ConstructorDemo1 {
	public static void main(String[] args) {
		EmpInfo emp1 = new EmpInfo(121, "Abcd");
		EmpInfo emp2 = new EmpInfo(111, "Xyz", 23, 234234.23);
		EmpInfo emp3 = new EmpInfo(11, "Lmn", 23);
		EmpInfo emp4 = new EmpInfo();
	}
}
class EmpInfo {
	private int id;
	private String name;
	private int age;
	private double salary;
	public EmpInfo() { // no-Param
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter Id : ");
		id = scan.nextInt();
		System.out.println("Enter Name : ");
		name = scan.next();
		scan.close();
	}
	public EmpInfo(int id, String name) { // 2 param
		this.id = id;
		this.name = name;
	}
	public EmpInfo(int id, String name, double salary) { // 3 param
		this(id,name);
		this.salary = salary;
	}
	public EmpInfo(int id, String name, int age, double salary) { // 4 param
		this(id, name, salary);
		this.age = age;
	}
}