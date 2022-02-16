package String;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {

		String str = "String before reversing";
//		String [] a = str.split(" ");
//		
//		System.out.println(Arrays.toString(a));  // [String, before, reversing]
//		
//		for(int i=a.length-1; i>=0; i--) {
//			System.out.println(a[i]);
//		}
		System.out.println("str = " + str);
		System.out.println("fullReverse = " + fullReverse(str));
		System.out.println("byWordsReverse = " + byWordsReverse(str));
		

	}

	public static String fullReverse(String str) {

		String newStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			newStr = newStr + str.charAt(i);

		}

		return newStr;

	}

	public static String byWordsReverse(String str) {

		String[] a = str.split(" ");
		String newStr = "";

		for (int i = a.length - 1; i >= 0; i--) {
			newStr = newStr + a[i] + " ";
		}

		return newStr;

	}

}
