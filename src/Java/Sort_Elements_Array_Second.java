package Java;

import java.util.Arrays;

public class Sort_Elements_Array_Second {

	public static void main(String[] args) {


		int a[]= {4,5,1,5,3};
		
		System.out.println("Array before sorting: " + Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0; i<n-1; i++)   //number of passes
		{
			for(int j=0; j<n-1; j++)   //iteration
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}

	
		System.out.println("Array after sorting: " + Arrays.toString(a));
		
		
		for(int b=n-1; b>0 ; b--)
		{
			if(a[b] != a[b-1])
			{
				System.out.println("Second: " + a[b-1]);
				break;
			}
		}
		
		
	}

}
