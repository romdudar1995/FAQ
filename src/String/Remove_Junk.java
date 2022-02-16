package String;

public class Remove_Junk {

	public static void main(String[] args) {


		String s1 = "@$!@$$##$!Java$#@$";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		

	}

}
