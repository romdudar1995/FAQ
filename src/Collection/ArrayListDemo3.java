package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "Dog", "Cat", "Elephant" };

		for (String value : arr) {
			System.out.println(value);
		}

		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
