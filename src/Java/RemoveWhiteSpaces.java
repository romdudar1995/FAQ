package Java;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {


		String str = "Java programming   selenium   automation";
		
		
		System.out.println("Before: "+str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("After: "+str);
		

	}

}
