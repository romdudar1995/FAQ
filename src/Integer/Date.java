package Integer;

import java.time.LocalDateTime;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime myObj = LocalDateTime.now();
		System.out.println(myObj);

		String email = "myemail" + myObj + "@gmail.com";
		System.out.println(email);

	}

}
