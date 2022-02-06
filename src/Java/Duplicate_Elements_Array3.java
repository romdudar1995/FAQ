package Java;

public class Duplicate_Elements_Array3 {

	public static void main(String[] args) {



		int a[] = { 0,0,1,1,1,2,2,3,3,4 };
		
		int a2[]= {};
		
		int len=a.length;
		int count=0;
		
		for(int i=0; i<len; i++) 
		{
			for(int j=i+1; j<len; j++)
			{
				if(a[i] == a[j])
				{		
					
	//				a = ArrayUtils.remove(a, a[i]);     // Apache Commons ArrayUtils
		
				}
			}
		}
//		System.out.println("Found "+count+" duplicate number/s");
		
		System.out.println(a);

	}

}