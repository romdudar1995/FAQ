package Java;

import java.util.Arrays;

public class Sort_Elements_Array_ZERO {

	public static void main(String[] args) {


		int a[]= {4,0,1,0,3};
		
		System.out.println("Array before sorting: " + Arrays.toString(a));
		
		int n=a.length;
		
		
		for(int i=0; i<n-1; i++)   //number of passes
		{
			for(int j=0; j<n-1; j++)   //iteration
			{
			
			if(a[j] == 0)       //4 == 0 false
			{
				int temp = a[j];  // 0 = 0
				a[j]=a[j+1]; 	  // 1 = 1       
				a[j+1]=temp; 	  // 0 = 0
			}
							
			}
		}

		
		System.out.println("Array after sorting: " + Arrays.toString(a));
		
	}

}
