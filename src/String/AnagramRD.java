package String;

public class AnagramRD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "listen", s2 = "silent", s3 = s1.concat(s2), empty = "";

		System.out.println(s3);

		for (int i = 0; i < s3.length(); i++) {
			for (int j = i + 1; j < s3.length(); j++) {
				if (s3.charAt(i) == s3.charAt(j)) {
					System.out.println("s3.charAt(i) -" + s3.charAt(i));
					empty += s3.charAt(i);

				}

			}

		}

		if (s1.equals(empty)) {
			System.out.println("THIS IS ANAGRAM!");
		} else {
			System.out.println("THIS IS NOT ANAGRAM");
		}

	}

}
