package Java;

public class Count_Sum_of_Digits {

	public static void main(String[] args) {
		
		
		int num = 1234;
		
		int sum=0;
		
		
		while(num>0) 
		{
			sum = sum+num%10;   // 4
			num=num/10;        // 123
		}
		
		System.out.println("Sum of digits in a number: " + sum);
		

	}

}
