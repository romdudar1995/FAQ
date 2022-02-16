package String;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {


		String str = "Java programming   selenium   automation";
		
		
		System.out.println("Before: "+str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("After: "+str);
		
		// OR
		
		
		String noSpacesStr = "";
		for(int i=0; i<str.length(); i++) {
			
			if((str.charAt(i) != ' ') && (str.charAt(i) != '\t')) {
				noSpacesStr = noSpacesStr + str.charAt(i);
			}
			
		}
		
		System.out.println("noSpacesStr " + noSpacesStr);
		

	}

}
