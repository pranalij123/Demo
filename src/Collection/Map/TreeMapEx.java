package Collection.Map;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> map= new TreeMap<>();
		map.put(2, "abc");
		map.put(1, "xyz");
		map.put(3, "pqr");
		map.put(6, null);
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.floorKey(2));
		System.out.println(map.ceilingKey(2));
		System.out.println(map.lastEntry());
		System.out.println(map.firstEntry());
		map.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
