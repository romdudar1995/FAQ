package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList alDup = new ArrayList();
		
		alDup.addAll(al);
		alDup.removeAll(al);
		
		
		Collections.sort(al);
		System.out.println("Sorted: " + al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse: " + al);
		
		Collections.shuffle(al);
		System.out.println("Shuffling: " + al);
		

	}

}
