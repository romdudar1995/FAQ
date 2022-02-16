package Array;

public class DuplicatesStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "Java", "Python", "java", "C++" };

		

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i].toLowerCase().equals(arr[j].toLowerCase())) {
					System.out.println(arr[i] + " is duplicate");
				}

			}

		}

		
		
		
		
		
	}

}
