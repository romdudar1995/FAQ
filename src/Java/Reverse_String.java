package Java;

public class Reverse_String {

	public static void main(String[] args) {
	
		
		String str="ABCD";
		String rev = "";
		
		
		int len = str.length(); // 4 
		
		for (int i=len-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);   // D
		}
		
		
		System.out.println("Rev string is: " +rev);
		
		
		
		
		
		
		
		//StringBuffer sb=new StringBuffer(str);
		//System.out.print(sb.reverse());
	}

}
