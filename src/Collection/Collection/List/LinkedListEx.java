package Collection.Collection.List;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();
		int a='a';
		for(int i=0;i<10;i++) {
			
			list.addLast((a)+"");
			a++;
		}
		
		System.out.println(list);
		list.addFirst("hello");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		

	}

}
