package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m = new HashMap();
//		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Marry");
		m.put(105, "Tye");
		
		m.put(103, "X");
		m.put(106, "Tye");
		
		System.out.println(m); // {101=John, 102=David, 103=X, 104=Marry, 105=Tye, 106=Tye}
		
		m.get(101); // John
		m.remove(106); // removed Tye 
		
		m.containsKey(101); // true
		
		m.containsValue("David"); // true
		
		m.keySet(); // return all the keys [101, 102 ...]
		
		m.values(); // return all the values  [John, David ...]
		
		m.entrySet(); // return all entries
		
		

		
		
		System.out.println(m);
	}

}
