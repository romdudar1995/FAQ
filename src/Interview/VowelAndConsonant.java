package Interview;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a e i o u

		char ch = 'a';

		System.out.println(isVowel(ch));

	}

	private static boolean isVowel(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else {
			return false;
		}

	}

}
