package Interview;

public class ExpressedPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 34 => 3+31 5+29 11+23 17+17

		int num = 34;
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {

			if (checkPrimeNumber(i)) {
				if (checkPrimeNumber(num - i)) {
					System.out.println(num + " = " + i + " + " + (num - i));
					flag = true;
				}
			}

		}

	}

	static boolean checkPrimeNumber(int num) {

		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
