import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		char ch = 'A';
		list.add("Abcd");   
		list.add(45.34);    
		list.add(123);
		list.add(45.34);
		list.add(ch);
		list.add("Abcd");
		
		
		System.out.println(list);
		
		list.addFirst(111);
		list.addLast(222);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		
	}
}
