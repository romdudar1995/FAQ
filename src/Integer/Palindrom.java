package Integer;

public class Palindrom {

	public static void main(String[] args) {

		

		
		System.out.println(isPalindromeNum(214132));
		
		System.out.println(isPalindromeStr("AABBAA"));
		
			
	}
	
	
	static boolean isPalindromeNum(int num) {
		
		int originalNum = num;
		int rev = 0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		System.out.println("Rev is " + rev);
		

		if(rev == originalNum) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	static boolean isPalindromeStr(String str) {
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		System.out.println("Reverse - " + rev);
		
		if(str.equals(rev)) {
			return true;
		} else {
			return false;
		}
		
		
		
		
	}

}
