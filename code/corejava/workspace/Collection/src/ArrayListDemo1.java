
import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Abcd");
		list.add(45.34);
		list.add(123);
		
		ArrayList list1 = new ArrayList();
		list1.add("Xyz");
		list1.add("Lmn");
		list1.add(111);
		
		System.out.println(list);
		
		System.out.println("Removed : " + list.remove("Abcd"));
		
		System.out.println(list);
		
		System.out.println("Contains : " + list.contains(45.34));
		
		System.out.println("Total Elements : " + list.size());
		
		//list.clear();
		
		//System.out.println(list);
		
		System.out.println("IsEmpty : " + list.isEmpty());
		
		list.addAll(list1);
		System.out.println(list);
		
		
	}
}
