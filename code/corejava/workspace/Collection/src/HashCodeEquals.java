import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashCodeEquals {
	public static void main(String[] args) {
		Student s1 = new Student("A", "9900998899", 345);
		Student s2 = new Student("B", "9900998877", 324);
		Student s3 = new Student("C", "9901998899", 654);
		Student s4 = new Student("D", "9900998899", 123);
		Student s5 = new Student("E", "9922998899", 247);
		Student s6 = new Student("F", "772998899", 247);

		HashSet set = new HashSet();
		//LinkedHashSet set = new LinkedHashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);

		System.out.println(set);

	}
}

class Student {
	String name;
	String contact;
	int id;

	public Student(String name, String contact, int id) {
		this.name = name;
		this.contact = contact;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + ", contact=" + contact + ", id=" + id + "\n";
	}

	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj; 
		if(id == st.id) {
			return true;
		}else {
			return false;
		}
		
		//return id == st.id;
	}
	
}












