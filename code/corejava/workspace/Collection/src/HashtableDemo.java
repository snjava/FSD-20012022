import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put("Abc",123);
		map.put(23.34,"Xyz");
		map.put(534,123);
		map.put('X',999999);
		map.put("Abc",555);
		map.put(53.4,123);
		//map.put(null,123);
		//map.put(11111,null);
		
		System.out.println(map);
	}
}
