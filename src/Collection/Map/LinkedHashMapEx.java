package Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(1,"Ram");
		map.put(3,"Raj");
		map.put(2, "Sakshi");
		System.out.println(map);
		
		Map<Integer,String> map2=new HashMap<>();
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

	}

}
/*
{1=Ram, 3=Raj, 2=Sakshi}
{1=Ram, 2=Sakshi, 3=Raj}
3
false
{}
Ram
true
false
Sakshi
{1=Ram, 3=Raj}

*/