package Java;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();  //1234
		
		
		
		// Using algoritm
		
		int rev=0;
		
		while(num!=0)
		{
			System.out.println(num);
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		System.out.println("Reverse num is: " + rev);
		
		
		
		
		// Using StringBuffer class
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
		
//		System.out.println("Reverse number is:"+ rev);
		
	
		

	}

}
