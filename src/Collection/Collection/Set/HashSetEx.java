package Collection.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
public static void main(String[] args) {
	Set<Integer> set= new HashSet<>();
	for(int i=1;i<10;i++) {
		set.add(i);
	}
	set.add(60);
	set.add(55);
	System.out.println(set);
	
}
}

//Note : it allows only single null value
