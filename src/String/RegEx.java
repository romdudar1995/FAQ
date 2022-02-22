package String;

import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text    =
		        "This is the text to be searched " +
		        "for occurrences of the http:// pattern.";

		String regex = ".*http://.*";

		boolean matches = Pattern.matches(regex, text);

		System.out.println("matches = " + matches);
		
		
		
		// System.out.println(checkerStr("Some text written by me", ".*me.*"));
		//System.out.println(checkerStr("Some text written by me", ".*text.*"));
		
		System.out.println(checkerStr("Dtext2D", ".*[0-3].*"));
		
		
		System.out.println(Pattern.matches("[xyz]", "x"));  // true [x or y or z]
		System.out.println(Pattern.matches("[xyz]?", "xx"));  // false [x occurs more than (?) one time ]
		System.out.println(Pattern.matches("[xyz]+", "xx"));  // true [x occurs more than (+) one time ]
		System.out.println(Pattern.matches("[xyz]*", "yyyzzzz"));  // true [x,y or z occurs more than (*) one time or zero ]

	}
	
	
	static boolean checkerStr(String text, String regex ) {
		
		
		if(Pattern.matches(regex, text)) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
