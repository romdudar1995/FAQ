package Interview;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1234 -> 4
		// 123 -> 3
		
		
		int num = 1234;
		int count = 0;
		
		while(num!=0) {
			num = num/10;
			count++;
			
		}
		
		System.out.println(count);
	
		
		

	}

}
