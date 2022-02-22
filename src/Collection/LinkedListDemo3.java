package Collection;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();

		l.add("Dog");
		l.add("Dog");
		l.add("Cat");
		l.add("Horse");

		System.out.println(l);
		l.addFirst("Tiger");
		l.addLast("Lion");

		System.out.println(l);

		l.getFirst();
		l.removeFirst();
		l.removeLast();

	}

}
