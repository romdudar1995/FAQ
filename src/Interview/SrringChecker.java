package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SrringChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example 1: "This Is The Sentence That Needs To Be Validated!"
		// should return an empty array ([]).

		// Example 2: "This Is The Sentence That Needs to be Validated!"
		// should return [to, be].

		// Example 3: "this is the sentence that needs to be validated!"
		// should return [this, is, the, sentence, that, needs, to, be, validated].

		String str = "This Is The Sentence That Needs to be Validated!";

		System.out.println(Arrays.toString(stringChecker(str)));

	}

	public static String[] stringChecker(String str) {

		String[] b = str.split(" ");
		String[] c = new String[0];

		for (int i = 0; i < b.length; i++) {

			if (Character.isUpperCase(b[i].charAt(0)) != true) {

				// convert the array to arrayList
				List<String> cList = new ArrayList<String>(Arrays.asList(c));

				// Add the new element to the arrayList
				cList.add(b[i]);

				// Convert the Arraylist back to array
				c = cList.toArray(c);

			}

		}
		return c;

	}

}