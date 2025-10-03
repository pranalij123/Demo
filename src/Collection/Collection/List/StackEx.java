package Collection.Collection.List;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		
		for(int i=10;i<=110;i+=10) {
			list.push(i);
		}
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.search(30));
		System.out.println(list.empty());
		
		
	}

}

/*output
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
110
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
110
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
8
false
*/