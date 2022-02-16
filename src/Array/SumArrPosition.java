package Array;

import java.util.Arrays;

public class SumArrPosition {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

//		for(int i=0; i<array.length; i++) {
//			System.out.println("Outer loop , " + "i =    " + i);
//			for(int j=0; j<array.length; j++) {
//				System.out.println("Inner loop , " + "j = " + j);
//			}
//		}

//		System.out.println("sumOfArray = " + Practice.sumOfArray(array));
//		System.out.println("checkNumInArray = " + Practice.checkNumInArray(array, 4));
		System.out.println("arrPosition = " + Arrays.toString(arrPosition(array, 7)));	

		System.out.println(Arrays.toString(testArray(array)));

//      Fizz Buzz
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println("Fizz");
//				continue;
//			} else if (i % 5 == 0) {
//				System.out.println("Buzz");
//				continue;
//			}
//			System.out.println(i);
//		}

	}

	public static int sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;

	}

	public static boolean checkNumInArray(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {

			if (num == array[i]) {

				return true;

			}
		}
		return false;

	}

	// [2,7,11,19] > [0,1] t=9
	public static int[] arrPosition(int[] a, int target) {
		int[] b = new int[2];
		for (int i = 0; i < a.length; i++) {
			System.out.println("i =" + i);
			for (int j = 1; j < a.length; j++) {
				System.out.println("j =" + j);
				if (a[i] + a[j] == target) {
					b[0] = i;
					b[1] = j;
					return b;
				}
			}
		}
		return b;
	}

	public static int[] testArray(int[] array) {
		return array;
	}

}
