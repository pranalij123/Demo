package Collection.Collection.Set;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=10;i<110;i+=10) {
			set.add(i);
		}
		set.add(24);
		set.add(22);
		set.add(34);
		set.add(30);
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.lower(30));
		System.out.println(set.floor(50));
		System.out.println(set.ceiling(30));
		System.out.println(set.higher(56));
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);
		System.out.println(set.subSet(20, 70));
		System.out.println(set.headSet(50));
		System.out.println(set.tailSet(50));
		

	}

}

/*Output
[10, 20, 22, 24, 30, 34, 40, 50, 60, 70, 80, 90, 100]
10
100
24
50
30
60
10
[20, 22, 24, 30, 34, 40, 50, 60, 70, 80, 90, 100]
100
[20, 22, 24, 30, 34, 40, 50, 60, 70, 80, 90]
[20, 22, 24, 30, 34, 40, 50, 60]
[20, 22, 24, 30, 34, 40]
[50, 60, 70, 80, 90]

*/