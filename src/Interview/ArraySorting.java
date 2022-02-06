package Interview;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		// normal sort

		int a[] = { 5,4,3,2,1 };
		
		System.out.println("original array - "+ Arrays.toString(a));
		
			
		System.out.println("normalSorting - " + Arrays.toString(ArraySorting.normalSorting(a)));
		
		System.out.println("reverseSorting - " + Arrays.toString(ArraySorting.reverseSorting(a)));

	
		
	}
	
	
	
	public static int[] normalSorting(int[] a) {
		
		for(int i=0; i<a.length-1; i++)   //number of passes
		{
			for(int j=0; j<a.length-1; j++)   //iteration
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
		
		return a;
	}
	
	
	public static int[] reverseSorting(int[] a) {
		
		for(int i=0; i<a.length-1; i++)  
		{
			for(int j=0; j<a.length-1; j++)   
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
		
		return a;
	}
	
	

}
