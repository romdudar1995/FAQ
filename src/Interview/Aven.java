package Interview;

import java.util.Scanner;

public class Aven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a = {2, 4, 4, 6, 4, 2, 6,};
	
	int len = a.length; // 7
	
	int sum=0;
	
	for(int i=0; i<len; i++) {
		
		sum=sum+a[i];
		
	}
	
	int avg = sum / len;
	
	System.out.println("Avg = " + avg);



		

	}

}
