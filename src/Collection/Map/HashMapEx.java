package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
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

/*Output 
 * {1=Ram, 2=Raj, 3=Sakshi}
{1=Ram, 2=Raj, 3=Sakshi}
3
false
{}
Ram
true
false
Raj
{1=Ram, 3=Sakshi}

 * 
 */
