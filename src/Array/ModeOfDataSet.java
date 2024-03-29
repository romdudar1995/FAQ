package Array;

import java.util.HashMap;

public class ModeOfDataSet {

	public static int mode(int[] array) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int max = 1;
		int temp = 0;

		for (int i = 0; i < array.length; i++) {

			if (hm.get(array[i]) != null) {

				int count = hm.get(array[i]);
				count++;
				hm.put(array[i], count);

				if (count > max) {
					max = count;
					temp = array[i];
				}
			}

			else
				hm.put(array[i], 1);
		}
		return temp;
	}

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 3, 4, 5 };

		System.out.println(mode(a));

	}
}