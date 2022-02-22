package Collection;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();
//		LinkedList<Integer> li = new LinkedList<Integer>();

		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);

		l.size(); // 6

		l.remove(3);

		l.add(3, "Java");

		l.get(3); // Java

		l.set(3, "Java 11"); // update

		l.contains("Java"); // false

		l.isEmpty(); // false

		for (Object e : l) { // in case of num will be (int i : l) {}
			System.out.println(e);
		}
		

	}

}
