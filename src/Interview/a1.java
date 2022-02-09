package Interview;

import java.util.Arrays;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java16aabb83
		// avaj16bbaa83
		
		
		String str = "java16aabb83aaa2bbb";
		
		String a[] = str.split("\\s+");
		
		for(int i=0; i<a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(a));

		
//		System.out.println(a.length());
//		System.out.println(a.charAt(0));
		
		
		
		
		

	}

}
