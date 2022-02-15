package Interview;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "@#$@#% my string 12424";
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));

			if ((Character.isLetter(s.charAt(i))) || (Character.isDigit(s.charAt(i)))
					|| (Character.isWhitespace(s.charAt(i)))) {

				s2 = s2 + s.charAt(i);

			}

		}

		System.out.println(s2);
		
		// Using regular experession
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("rep - " + s);
	}

}
