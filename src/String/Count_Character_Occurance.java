package String;

public class Count_Character_Occurance {

	public static void main(String[] args) {

		String s="Java Programming Java oops";
		
		int totalcount = s.length();  //total len
		
		int totalcount_afterRemove = s.replace("a", "").length();  // total len after removing a's
		
		int count=totalcount-totalcount_afterRemove;
		
		System.out.println("Number occurances of a is: " + count);
		

	}

}
