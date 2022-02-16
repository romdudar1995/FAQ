package Integer;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		
		for(int i=1; i<=num; i++) {		// it 1					it 2				it 3
			System.out.print(t1+" ");  // 0              		1					1
			int sum = t1 + t2;         // sum = 0+1 = 1			sum = 1+1 = 2		sum = 1+2=3
			t1=t2;					   // t1 = 1				t1 = 1				t1 = 2
			t2 = sum;				   // t2 = 1				t2 = 2				t2 = 3
		}
		

	}

}
