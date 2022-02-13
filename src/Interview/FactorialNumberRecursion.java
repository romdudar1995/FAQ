package Interview;

public class FactorialNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplyNum(5));
	}
	
	
	static int multiplyNum(int num) {
		
		if(num>=1) {
			return num * multiplyNum(num-1);
		}
		else {
			return 1; 
		}
		
	}

}
