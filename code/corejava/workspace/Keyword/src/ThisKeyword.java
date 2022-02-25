public class ThisKeyword {
	public static void main(String[] args) {
		Student stud1 = new Student();
		//stud1.setId(10);
	}
}

class Student {
	int id = 12;
	public Student() {
		this(12, "Xyz"); // call constructor using this keyword
		System.out.println("This is no Param Constructor");
	}
	public Student(int id) {
		System.out.println("This is 1 Param Constructor");
	}
	
	public Student(int id, String name) {
		this(id);
		System.out.println("This is 2 Param Constructor");
	}

	public void setId(int id) {
		System.out.println(id); // 10
		System.out.println(this.id); // variable call using this keyword
		this.getId(); // method call using this keyword
	}
	public int getId() {
		System.out.println("This is get Id");
		return id;
	}
}









