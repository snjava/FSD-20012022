import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCustomObj {
	public static void main(String[] args) {
		Employee e1 = new Employee(121, "A", 12.34);
		Employee e2 = new Employee(111, "B", 11.34);
		Employee e3 = new Employee(12, "D", 15.34);
		Employee e4 = new Employee(11, "C", 13.34);
		Employee e5 = new Employee(121, "A", 12.34);
		
		SortBySalary salarySort = new SortBySalary();
		SortByName nameSort = new SortByName();
		
		TreeSet<Employee> set = new TreeSet<Employee>(nameSort);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println("id\tName\tSalary");
		System.out.println("=========================");
		Iterator<Employee> it = set.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.print(e.id + "\t");
			System.out.print(e.name + "\t");
			System.out.print(e.salary + "\n");
		}
	}
}
class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + "\n";
	}

	@Override
	public int compareTo(Employee o) {
		if(id > o.id) {
			return 1;
		} else if(id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary > o2.salary) {
			return 1;
		} else if(o1.salary < o2.salary) {
			return -1;
		} else {
			return 0;
		}
	}
}

class SortByName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}










