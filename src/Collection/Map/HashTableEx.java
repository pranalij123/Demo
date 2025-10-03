package Collection.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer,String> map= new Hashtable<>();
		map.put(2, "abc");
		map.put(1, "xyz");
		map.put(3, "pqr");
		
		System.out.println(map);
		Hashtable<Integer,String> map2=new Hashtable<>();
		map2.putAll(map);
		System.out.println(map2);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map2.clear();
		System.out.println(map2);
		System.out.println(map.get(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Radha"));
		System.out.println(map.remove(2));
		System.out.println(map);
		map.forEach((k,v)->System.out.println(k+" : "+v));

	}

}


/*OutPut
{3=pqr, 2=abc, 1=xyz}
{3=pqr, 2=abc, 1=xyz}
3
false
{}
xyz
true
false
abc
{3=pqr, 1=xyz}
1 : xyz
3 : pqr



*/