package Integer;

import java.util.Scanner;

public class Count_number {

	public static void main(String[] args) {

		
		int num=12345;
		int count=0;
		
		while (num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Number of digits: " +count);
		
		
		// Comment
		
//		int a = 123456;
//		String b = "";
//		String c=a+b;
		
//		System.out.println(c.length());
	}

}
