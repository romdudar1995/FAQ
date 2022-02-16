package String;

import java.util.HashSet;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {

		String a1 = "listen";
		String a2 = "silent";

		String str = a1.concat(a2); // listensilent

		String new_str = removeDuplicates(str);


		if (a1.equals(new_str)) {
			System.out.println(a1 + " is anagram of " + a2);
		} else {
			System.out.println(a1 + " is not anagram of " + a2);
		}

	}

	public static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();

	}

}
