package Lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayL1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array cannot be modified (if you want to add or remove elements to/from an array, 
		// you have to create a new one). 
		// While elements can be added and removed from an ArrayList whenever you want.
		
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	    
	    
	    System.out.println(cars);
	    System.out.println(cars.get(0));
	    
	    cars.set(0, "Opel");
	    cars.remove(3);
	    System.out.println(cars);
	    
	    // cars.clear();         // to remove all elements 
		
	    
	    
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(135);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    
	    Collections.sort(myNumbers);  // Sort myNumbers
	    
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }



	}

}
