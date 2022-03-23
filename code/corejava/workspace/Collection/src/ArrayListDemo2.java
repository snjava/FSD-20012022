import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(50);
		list.add(23);
		list.add(54);
		list.add(23);
		list.add(65);
		list.add(74);
		list.add(99);
		
		System.out.println(list);
		
		list.add(1, 33);
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println(list.get(4));
		
		list.set(1, 55);
		
		System.out.println(list);
		
	}

}
