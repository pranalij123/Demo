package Collection.Collection.List;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(10);
		
		System.out.println(list.size());
		for(int i=10;i<=120;i+=10) 
			
			list.add(i);
		
		System.out.println(list.size());
		System.out.println(list);
		
		list.trimToSize();
		System.out.println(list.size());
		
		System.out.println(list.subList(3, 7));
		list.ensureCapacity(15);
		System.out.println(list);
		System.out.println(list.size());
	}

}
