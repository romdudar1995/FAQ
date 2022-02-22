package Collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList(); // can store diffent types of objects	
//		ArrayList<Integer> ali = new ArrayList<Integer>();
//		ArrayList<String> als = new ArrayList<String>();
//		List all = new ArrayList(); // List is a parent interface of ArrayList
	
		/* Default size = 10 */
		
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al); //  [100, Welcome, 15.5, A, true]
		al.size(); // 5
		
		al.remove(1); // 1 is index
		al.remove("Welcome"); // value
		
		
		al.add(2, "Python"); // index, value
			
		al.get(2);
		
		al.set(2, "Java");
		
		al.contains("Java"); // true or false
		
		al.isEmpty(); // false
		
		// for loop
		for(int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		
		// for each loop
		for(Object e : al) {
			System.out.println(e);
		}
		
		// iterator()
//		Iterator it = al.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	
	
	}

}
