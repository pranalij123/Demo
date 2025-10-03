package Collection.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeEx {

	public static void main(String[] args) {
		Deque <Integer> queue=new ArrayDeque<>();
		 queue.addFirst(10);
		 queue.addFirst(34);
		 queue.addFirst(56);
		 System.out.println(queue);
		 queue.addLast(3445);
		 queue.addLast(577);
		 System.out.println(queue);
		 queue.offerFirst(34);
		 queue.offerLast(56);
		 System.out.println(queue);
		 System.out.println(queue.removeFirst());
		 System.out.println(queue);
		 System.out.println(queue.removeLast());
		 System.out.println(queue);
		 System.out.println(queue.pollFirst());
		 System.out.println(queue);
		 System.out.println(queue.pollLast());
		 System.out.println(queue);
		 System.out.println(queue.getFirst());
		 System.out.println(queue);
		 System.out.println(queue.getLast());
		 System.out.println(queue);
		 System.out.println(queue.peekFirst());
		 System.out.println(queue);
		 System.out.println(queue.peekLast());
		 System.out.println(queue);
	}

}

/*Output:
 * [56, 34, 10]
[56, 34, 10, 3445, 577]
[34, 56, 34, 10, 3445, 577, 56]
34
[56, 34, 10, 3445, 577, 56]
56
[56, 34, 10, 3445, 577]
56
[34, 10, 3445, 577]
577
[34, 10, 3445]
34
[34, 10, 3445]
3445
[34, 10, 3445]
34
[34, 10, 3445]
3445
[34, 10, 3445]

 * 
 */
