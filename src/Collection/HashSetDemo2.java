package Collection;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		HashSet<Integer> set2 = new HashSet<Integer>();

		set2.add(3);
		set2.add(4);
		set2.add(5);

		set1.addAll(set2);

		System.out.println("union - " + set1); // [1, 2, 3, 4, 5]

		set1.retainAll(set2); // common elements [3, 4, 5]
		System.out.println("intersection - " + set1);

		set1.removeAll(set2);
		System.out.println("difference - " + set1);

		set1.containsAll(set2); // subset true
	}

}
