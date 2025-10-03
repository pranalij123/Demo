package Collection.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<>();
		queue.add(34);
		queue.add(80);
		queue.add(30);
		System.out.println(queue);
		queue.offer(34);
		
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue);
	}

}

/*Output:
 * [30, 80, 34]
30
[34, 80, 34]
34
[34, 80]
34
[34, 80]
34
[34, 80]

 * 
 * */
