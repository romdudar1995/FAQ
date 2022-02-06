package Java;

import java.util.Random;

public class Random_Num_Str {

	public static void main(String[] args) {
		
		
		Random rand=new Random();
		
		int rand_int = rand.nextInt(1000);
		System.out.println(rand_int);
		
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);
		
			
		System.out.println(Math.random());
		
		
		String email = "myemail+"+rand_int+"@gmail.com";
		
		
		System.out.println(email);
		
		
	}

}
