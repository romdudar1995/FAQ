package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		
		/*Duplicates not allowed, insertion order preserved */
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
	}

}
