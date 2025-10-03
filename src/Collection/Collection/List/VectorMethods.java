package Collection.Collection.List;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector<Integer> list=new Vector<>();
		System.out.println(list.capacity());
		for(int i=10;i<=110;i+=10) {
			list.addElement(i);
		}
		System.out.println(list.capacity());
		System.out.println(list);
		System.out.println(list.firstElement());
		System.out.println(list.lastElement());
		System.out.println(list.elementAt(2));
		list.removeElementAt(3);
		System.out.println(list);
		list.insertElementAt(700, 2);
		System.out.println(list);
	}

}
