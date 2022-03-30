import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(234,123);
		map.put(23,"Xyz");
		map.put(534,123);
		map.put(345,999999);
		map.put(222,555);
		map.put(53,12.3);
		map.put(11111,null);
		
		System.out.println(map);
		
		// grater value than the provided value
		System.out.println(map.higherEntry(222)); //234=123
		System.out.println(map.higherKey(222)); //234
		
		// smaller value than the provided value
		System.out.println(map.lowerEntry(222)); //53=12.3
		System.out.println(map.lowerKey(222)); //53
		
		System.out.println();
		
		// equals or grater value than the provided value
		System.out.println(map.ceilingEntry(222)); //222=555
		System.out.println(map.ceilingKey(222)); //222
		
		// equals or less value than the provided value
		System.out.println(map.floorEntry(222)); //222=555
		System.out.println(map.floorKey(222)); //222
		
		System.out.println();
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		System.out.println();
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
	}
}
