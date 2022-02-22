package Collection;

public class CollectionsTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Collection is an interface which come under collection framework
		 * 
		 * Collections is a predefined class which contains utility methods 
		 * by which we can perform certain operation on collection objects
		 * 
		 * 
		 *                       Collection (I)
		 *   List(I)				Set(I) 				Queue(I)
		 *   
		 *   
		 *   List (I) is child of Collection (I)
		 *   - insertion order should be preserved (zberezheno)
		 *   - duplicates allowed
		 * 	 ArrayList			LinkedList 		Vector <- Stack
		 * 
		 * 
		 * 	 Set (I)
		 * 	 - insertion order NOT preserved
		 *   - duplicates NOT allowed
		 *   HashSet			LinkedHashSet
		 * 
		 * 
		 *   Queue(I)
		 *   - First in first out or prior to processing
		 *   PriorityQueue 
		 * 
		 * */
		
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
		 *  Manipulation is slow because every element shifted after performing some action.
		 *  Better for storing and accessing data. Retrieving data
		 * 
		 *  LinkedList internally uses a doubly linked list.
		 *  Manipulation is faster, no shifting required in memory.
		 *  Better for manipulating data. Insertion, deletion.
		 *  Previous node address | Node | Next node address
		 *  
		 * */
		
		
		
		/*
		 *  Map (I) not collection interface but under collection framework
		 *  {101: Harry, 102: Ron}
		 *  - unique key, value can be duplicated
		 *  HashMap			LinkedHashMap
		 *  
		 *  Map - collection of entries (keys + values)
		 * 
		 * 
		 * 
		 * */
		
		/*
		 * Collection methods
		 * add(Object o)
		 * addAll(Collection c)
		 * remove(Object o)
		 * removeAll(Collection c)
		 * retainAll(Collection c) remove everything except Collection c
		 * clear()
		 * isEmpty()
		 * size()
		 * contains(Object o)
		 * containsAll(Collection c)
		 * toArray(Collection c)
		 * 
		 * List methods
		 * add(index, Object o)
		 * addAll(index, Collection c)
		 * remove(index)
		 * get(index) - return object
		 * set(index, Object o) - update
		 * 
		 * 
		 * */
	

	}

}
