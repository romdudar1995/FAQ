package Integer;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 14;
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println(num+" is a prime num");
		} else {
			System.out.println(num+" is not a prime num");
		}
		
		
		System.out.println(isPrime(13));
		
	}
	
	
	static boolean isPrime(int num) {
		
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println(num+" is a prime num");
			return true;
		} else {
			System.out.println(num+" is not a prime num");
			return false;
		}
	}

}
