package Java;

public class aa {

	public static void main(String[] args) {


	int a[]= { 1,3,4,5,6,7 };
	
	int len=a.length;
	
	System.out.println("Even numbers: ");
	for(int i=0;i<len;i++)
		if(a[i]%2 == 0)		
			System.out.println(a[i]);
	
	System.out.println("Odd numbers: ");
	for(int i=0;i<len;i++)
		if(a[i]%2 != 0)		
			System.out.println(a[i]);
	
	
		
	
	
		
		
		

	}

}
