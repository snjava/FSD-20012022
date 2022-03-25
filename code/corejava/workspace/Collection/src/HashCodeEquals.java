import java.util.HashSet;

public class HashCodeEquals {
	public static void main(String[] args) {
		Student s1 = new Student("A", "9900998899");
		Student s2 = new Student("B", "9900998877");
		Student s3 = new Student("C", "9901998899");
		Student s4 = new Student("D", "9900998899");
		Student s5 = new Student("E", "9922998899");

		HashSet set = new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);

		System.out.println(set);

	}
}

class Student {
	String name;
	String contact;

	public Student(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Name : " + name + "  Contact : " + contact + "\n";
	}

	@Override
	public int hashCode() {
		return contact.length();
	}

	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		return contact.equals(st.contact);
	}

}
