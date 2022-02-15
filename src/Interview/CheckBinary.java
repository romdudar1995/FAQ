package Interview;

public class CheckBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 1010510;
		
		System.out.println(isBinary(num));

		

	}
	
	public static boolean isBinary(int num) {
		
		while(num>0) {
			
			int lastDigit = num % 10;
			
			System.out.println("Last - " + lastDigit);
			
			if((lastDigit != 1) && (lastDigit != 0)) {
				return false;
			}
				
	
			
			num/=10;
		}
		return true;
		
		
	}

}
