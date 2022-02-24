package String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "java16som99aabb32";
		

		System.out.println(reverseDigits(s1));

	}
	
	private static String reverseDigits(String s) {
	    // the pattern will match a sequence of 1 or more digits
	    Matcher matcher = Pattern.compile("\\d+").matcher(s);   // \\D to reverse words
	    // fetch the position of the next sequence of digits
	    if (!matcher.find()) {
	        return s; // no more digits
	    }
	    // keep everything before the number
	    String pre = s.substring(0, matcher.start());
	    // take the number and reverse it
	    String number = matcher.group();
	    number = new StringBuilder(number).reverse().toString();

	    // continue with the rest of the string, then concat!
	    return pre + number + reverseDigits(s.substring(matcher.end()));
	}
	
	

}
