import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(546);
		set.add(423);
		set.add(134);
		set.add(765);
		set.add(765);
		set.add(987);
		set.add(121);

		System.out.println(set);
		
		System.out.println("Smallest : "+set.first());
		System.out.println("Largest : "+set.last());
		
		// grater value than the provided value
		System.out.println("Higher : "+set.higher(520)); // 546
		
		// smaller value than the provided value
		System.out.println("Lower : "+set.lower(520)); // 423
		
		// equals or grater value than the provided value
		System.out.println("ceiling : "+set.ceiling(520)); // 546
		
		// equals or less value than the provided value
		System.out.println("floor : "+set.floor(520)); // 423
		
		
		System.out.println("=================");
		Iterator it = set.iterator();
		//it.hasNext(); // it check for the next method present or not.
		//it.next(); // it jumps on the next value and also return the value.
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
