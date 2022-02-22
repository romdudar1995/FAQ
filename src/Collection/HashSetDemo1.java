package Collection;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet(); // default capacity 16 Load factor 0.75
//		HashSet hs = new HashSet(100, (float)0.85);
//		HashSet<Integer> hss = new HashSet<Integer>();
		/* Duplicates not allowed, insertion order NOT preserved */
		hs.add(100);
		hs.add("welcome");
		hs.add(12.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);

		System.out.println(hs); // insertion order not preserved

		hs.remove(12.4); // only by value no index available

		hs.contains('A'); // true

		for (Object o : hs) {
			System.out.println(o);
		}

		HashSet<Integer> evenNumber = new HashSet<Integer>();

		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);

		System.out.println(evenNumber);

		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.addAll(evenNumber);
		numbers.add(10);
		System.out.println(numbers);
		numbers.removeAll(evenNumber); // [2, 4, 6, 10]
		System.out.println(numbers); // [10]
	}

}
