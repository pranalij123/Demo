package Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterFace {
	public static void main(String[] args) {
		System.out.println("**************add()****************");
		Collection<Integer> c= new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		System.out.println("c :"+c);
		System.out.println("***************addAll(c)***************");
		Collection<Integer> c1= new ArrayList<>();
		c1.addAll(c);
		System.out.println("C1 :"+c1);
		
		System.out.println("*****************remove(20)******************");
		System.out.println(c1.remove(20));
		System.out.println("after removing ele :"+ c1);
		System.out.println("*****************clear()********************");
		
		c1.clear();
		System.out.println("c1 :"+c1);
		System.out.println("*******************contains(10)******************");
		System.out.println(c.contains(10));
		System.out.println("*************************************");
		Collection<Integer> c2= new ArrayList<>();
		for(int i=10;i<100;i+=10) {
			c2.add(i);
		}
		System.out.println("C2:" +c2);
		
		System.out.println("*****************containsAll(c)********************");
		System.out.println(c2.containsAll(c));
		System.out.println("********************retainAll(c)*****************");
		System.out.println(c2.retainAll(c));
		System.out.println("C2:" +c2);
		System.out.println("*******************removeAll(c)******************");
		c2.removeAll(c);
		System.out.println("C2:" +c2);
		System.out.println("*****************isEmpty()********************");
		
		System.out.println(c.isEmpty());
	}
	
}

/* output
 * **************add()****************
c :[10, 20, 30]
***************addAll(c)***************
C1 :[10, 20, 30]
*****************remove(20)******************
true
after removing ele :[10, 30]
*****************clear()********************
c1 :[]
*******************contains(10)******************
true
*************************************
C2:[10, 20, 30, 40, 50, 60, 70, 80, 90]
*****************containsAll(c)********************
true
********************retainAll(c)*****************
true
C2:[10, 20, 30]
*******************removeAll(c)******************
C2:[]
*****************isEmpty()********************
false

 */
