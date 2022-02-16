package String;

public class StringWordCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "RomanAutoToyotaCar";

		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			if ((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')) {
				count++;
			}

		}

		System.out.println("count is " + count);

		int count2 = 0;
		for (int i = 0; i < a.length(); i++) {
			if (Character.isUpperCase(a.charAt(i))) {
				count2++;
			}
		}

		System.out.println("count2 is " + count2);
		
		
		
		
		
		System.out.println("\"Hello\"");
		
		String s1 = "abcd";
		
		System.out.println("s1.lastIndexOf - " + s1.lastIndexOf(""));
	}
	
	
/*
 if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
        count++;
 }
 */

	
	
	public static String getXpath(String name) {
		
		String xpath = "//input[@id='"+name+"']";
		
		return xpath;
		
	}

	

}
