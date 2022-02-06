package Java;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_Array2 {

	public static void main(String[] args) {
		
		
//		int a[]= {30, 50, 32, 70, 34};
	
		
		Integer a[]= {21,43,54,32,42};
		
		System.out.println("Array elements before sorting: " + Arrays.toString(a));

//		Arrays.parallelSort(a);
		Arrays.sort(a);
		Arrays.sort(a, Collections.reverseOrder());
		
		
		
		
		
		System.out.println("Array elements after sorting: " + Arrays.toString(a));

	}

}
