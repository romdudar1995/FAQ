package Java;

public class Count_Character_Occurance_ABC {

	public static void main(String[] args) {

		String s="abcacbaa";
		
		int totalcount = s.length();  //total len
		
		int totalcount_afterRemove_A = s.replace("a", "").length();  // total len after removing a's
		int totalcount_afterRemove_B = s.replace("b", "").length();
		int totalcount_afterRemove_C = s.replace("c", "").length();
		
		
		int countA=totalcount-totalcount_afterRemove_A;
		int countB=totalcount-totalcount_afterRemove_B;
		int countC=totalcount-totalcount_afterRemove_C;
		
		System.out.println("a," + countA + "\nb," + countB + "\nc," + countC);
		

	}

}
