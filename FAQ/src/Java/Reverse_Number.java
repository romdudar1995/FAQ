package Java;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();  //1234
		
		// Using StringBuffer class
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse number is:"+ rev);
		
	
		

	}

}
