package Array;

public class AverageLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,2,3,4,5,6};
		
		System.out.println(averageNumber(a));
		
		
	}
	
	static double averageNumber(int a[]) {
		
		double sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];
			
		}
		
		return sum/a.length;
		
		
		
		
	}

}
