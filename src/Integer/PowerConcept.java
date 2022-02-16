package Integer;

public class PowerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3^4 = 81               3x3x3x3= 9  27   81
		
		
		int base = 3;
		int exponent = 4;
		
		long result = 1;
		
		
		while(exponent!=0) {		
			result *= base;
			System.out.println("IN res" + result);
			exponent--;
			System.out.println("IN exp" + exponent);
		}
		System.out.println(result);
		
		

	}

}
