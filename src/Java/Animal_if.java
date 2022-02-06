package Java;

import java.util.*;
import java.util.Scanner;

public class Animal_if {

	public static void main(String[] args) {

		int num;

		Scanner a = new Scanner(System.in);
		num = a.nextInt();

		System.out.println("enter num " + num);

		if (num % 8 == 0) {
			System.out.print("AN");
		}

		if (num % 16 == 0) {
			System.out.print("IM");
		}

		if (num % 32 == 0) {
			System.out.print("AL");
		}
	}
}