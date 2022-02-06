package Interview;

import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(IntegerReverse.reverseNumber(num));

		sc.close();
	}

	public static int reverseNumber(int num) {

		int rev = 0;

		while (num != 0) {
			System.out.println(num);
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		return rev;

	}

}
