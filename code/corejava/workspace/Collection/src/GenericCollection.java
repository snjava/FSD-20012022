import java.util.ArrayList;
import java.util.Iterator;

public class GenericCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(98);
		list.add(78);
		list.add(65);
		list.add(45);
		list.add(79);
		list.add(71);
		list.add(75);
		list.add(67);
		list.add(89);
		
		int count = getCount(list, 75);
		System.out.println(count);
	}
	
	public static int getCount(ArrayList<Integer> list, int percent) {
		int count = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int val = it.next();
			if(val >= percent) {
				count++;
			}
		}
		return count;
	}
}









