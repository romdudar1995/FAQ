package Array;

public class Middle_of_Array {

	public static void main(String[] args) {


		int a[]= { 1,2,3,3,5,3 };
		
		int len=a.length;
		
		System.out.println(len);
		
		

		
		if(len%2 == 0)
		{
			System.out.println("2 middle elements");
			int finx=(len/2-1);   //2
			int sinx=(len/2);     //3
			System.out.println("Middle of array: " +a[finx] + " "+a[sinx]);
		}
		else
		{
			System.out.println("1 middle element");
			int inx=(len/2-1/2);
			
			System.out.println("Middle of array is: "+a[inx]);
		}
		
		
		

	}

}
