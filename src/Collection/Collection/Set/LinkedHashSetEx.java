package Collection.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=1;i<10;i++) {
			set.add(i);
		}
		set.add(60);
		set.add(55);
		System.out.println(set);
	}

}
