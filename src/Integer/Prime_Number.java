package Integer;

public class Prime_Number {

	public static void main(String[] args) {
		
		int num=10;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not Prime number");	
			}
		}
		else 
		{
			System.out.println("Not Prime number");
		}
		
		
	}

}
