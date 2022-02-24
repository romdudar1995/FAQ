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
		
		
		System.out.println("checkerStr - "+checkerStr("Some text written by me", ".*\\S.*"));
		 //System.out.println("checkerStr - "+checkerStr("Some text written by me", ".*me.*"));
		//System.out.println(checkerStr("Some text written by me", ".*text.*"));
		
		System.out.println(checkerStr("Dtext2D", ".*[0-3].*"));
		
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		
		
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

		
	}
	
	
	static boolean checkerStr(String text, String regex ) {
		
		
		if(Pattern.matches(regex, text)) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
