import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Abc",123);
		map.put(23.34,"Xyz");
		map.put(534,123);
		map.put('X',999999);
		map.put("Abc",555);
		map.put(53.4,123);
		map.put(null,123);
		map.put(11111,null);
		map.put(null,5555);
		
		System.out.println(map);
		
		System.out.println(map.get(53.4));
		
		System.out.println(map.containsKey("Abc"));
		System.out.println(map.containsValue("Abc"));
		
		System.out.println("Removing the value : " + map.remove('X'));
		System.out.println(map);
		
		map.remove(534, 124);
		System.out.println(map);
		
		//map.clear();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		HashMap map1 = new HashMap();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		
		
		map.putAll(map1);
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
	}
}
