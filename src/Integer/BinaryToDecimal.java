package Integer;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convertBinaryToDecimal(1001));

	}

	static int convertBinaryToDecimal(int num) {

		int decimalNumber = 0;
		int i = 0;

		while (num != 0) {

			int reminder = num % 10;
			num = num / 10;
			decimalNumber = (int) (decimalNumber + reminder * Math.pow(2, i));
			i++;
		}
		return decimalNumber;

	}

}
