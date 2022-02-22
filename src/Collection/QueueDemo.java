package Collection;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Insertion order preserved & duplicates allowed */

		PriorityQueue q = new PriorityQueue();

		q.add("A"); // if add not successful returns exception 
		q.add("B");
		q.offer("C"); // if offer not successful returns null 
		q.offer("C");
//		q.add(100); not allowed, only one data type
//      Allowed in LinkedList

		System.out.println(q); // [A, B, C, C]

		// get head element element() peak()
		System.out.println(q.element()); // if empty - exception
		System.out.println(q.peek()); // if empty - null

		// return and remove element from queue remove() poll()
		q.remove(); // if empty - exception
		q.poll(); // if empty - null
	}

}
