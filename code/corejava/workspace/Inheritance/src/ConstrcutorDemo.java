public class ConstrcutorDemo {
	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println(stud.id); // 1
		System.out.println(stud.name); // NA
	}
}
class Student {
	int id;
	String name;
	public Student() { // no-param constructor
		System.out.println("This No-param Constrcutor");
		id = 1;
		name = "NA";
	}
}
