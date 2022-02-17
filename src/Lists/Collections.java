package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
	
		
		/*
		 *  List		  Set			   Map
		 *  ArrayList	  HashSet		   HashMap
		 *  LinkedList    LinkedHashSet    LinkedHashMap
		 * 
		 * 
		 *  List allows to store duplicate objects. Set only unique objects.
		 *  List works on index based.
		 *  List when frequently using elements
		 *  
		 *  ArrayList internally uses a dynamic array to store elements. 
		 *  Manipulation is slow because every element shifted after performing some avtion.
		 *  Better for storing and accessing data.
		 * 
		 *  LinkedList internally uses a doubly linked list.
		 *  Manipulation is faster, no shifting required in memory.
		 *  Better for manipulating data.
		 * */
		
		ArrayList arrayList = new ArrayList<String>();
		
	    //parent parent = new Child();
		List<String> list = new ArrayList<>();
		// In case of final we are able to add or update values but no able to reassign list (have to use unmodifiable list)
		LinkedList ll = new LinkedList(); 
		
		list.add("First");
		
		System.out.println(list);
		

	}

}
