package Interview;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// !5 5x4x3x2x1 = 120

		int number = 5;
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
