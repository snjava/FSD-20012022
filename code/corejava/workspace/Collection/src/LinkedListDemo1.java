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
		
		list.push(555); // add element at the start of list
		System.out.println("After Push : "+list);
		
		// select the first element and also removes it. if List empty then 
		// it throws NoSuchElementException.
		System.out.println("Pop : "+list.pop()); 
		System.out.println("After pop : "+list);
		
		// select the first element and also removes it. if List empty then 
		// it will return a null value.
		System.out.println("Poll : "+list.poll()); 
		System.out.println("After poll : "+list);
		
		// select the first element and but not removes it.
		System.out.println("peek : "+list.peek()); 
		System.out.println("After peek : "+list);
		
		
	}
}















