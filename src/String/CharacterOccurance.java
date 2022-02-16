package String;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I love cOding";

		String s2 = s.toUpperCase();

		System.out.println("s2 - " + s2);

		// I - 1
		// o - 2

		int countI = 0;
		int countO = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'I') {
				countI++;
			} else if ((s.charAt(i) == 'o') || (s.charAt(i) == 'O')) {
				countO++;
			}

		}

		System.out.println("I - " + countI);
		System.out.println("O - " + countO);

	}

}
