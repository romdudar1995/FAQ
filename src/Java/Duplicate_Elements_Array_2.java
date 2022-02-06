package Java;

public class Duplicate_Elements_Array_2 {

	public static void main(String[] args) {
	
		

		int a[] = { 0,0,1,1,1,2,2,3,3,4 };
		
		int len=a.length;
		int count=0;
		
		for(int i=0; i<len; i++) 
		{
			for(int j=i+1; j<len; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					
				}
			}
		}
		System.out.println("Found "+count+" duplicate number/s");

	}

}

