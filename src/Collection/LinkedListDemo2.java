package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();

		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");

		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);

		new_l.removeAll(l);

		System.out.println(new_l.isEmpty());

		Collections.sort(l);

		System.out.println(l);

		Collections.sort(l, Collections.reverseOrder());
	}

}
