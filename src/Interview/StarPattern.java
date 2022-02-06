package Interview;

public class StarPattern {

	public static void main(String[] args) {
		// https://www.edureka.co/blog/30-pattern-programs-in-java/

//		*
//		**
//		***
//		****
//		*****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");      
			}
			System.out.println();

		}
		
		
//		*****
//		****
//		***
//		**
//		*

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {     // remove =
				System.out.print("*");
			}
			System.out.println();
		}

//		for(int b=0; b<=4; b++) {
//			System.out.println("*");
//		}



	}

}
