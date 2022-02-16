package Array;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8};
		
		int merge[] = new int [a.length+b.length];
		int c=0;
		
		for(int i=0; i<a.length; i++) {
			merge[i] = a[i];
			c++;
		}
		
		for(int j=0; j<b.length; j++) {
			merge[c++] = b[j];
			
		}
		
		System.out.println(Arrays.toString(merge));
		

	}

}
