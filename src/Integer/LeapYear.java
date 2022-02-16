package Integer;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year");

		int y = sc.nextInt();

		sc.close();

		System.out.println("Year is leap - " + isLeap(y));
	}

	private static boolean isLeap(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else
				return true;
		} else {
			return false;
		}

	}

}
