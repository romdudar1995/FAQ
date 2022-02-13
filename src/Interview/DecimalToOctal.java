package Interview;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(converDecimalToOctal(78));

		System.out.println(convertOctalToDecimal(116));
	}

	static int converDecimalToOctal(int decimal) {

		int octalNumber = 0, i = 1;

		while (decimal != 0) {

			octalNumber += (decimal % 8) * i;
			decimal /= 8;
			i *= 10;

		}

		return octalNumber;

	}

	static int convertOctalToDecimal(int octal) {

		int decimalNumber = 0, i = 0;

		while (octal != 0) {

			decimalNumber += (octal % 10) * Math.pow(8, i);
			i++;
			octal /= 10;
		}
		return decimalNumber;
	}

}
