import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abcd");
		set.add(123);
		set.add(345.23);
		set.add(2341);
		set.add(345634.43);
		set.add("abcd");
		set.add(123);
		
		System.out.println(set);
	}
}
