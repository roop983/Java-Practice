package Collections_Basic;
import java.util.*;

public class HashMap_ExtractValue {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		   hash_map.put(1,"Red");
		  hash_map.put(2,"Green");
		  hash_map.put(3,"Black");
		  hash_map.put(4,"White");
		  hash_map.put(5,"Blue");
		  
		  String val=hash_map.get(1);
		  
		  // check the value
		   System.out.println("Value for key 1 is: " + val);
		   
		   
		   HashMap < String, Integer > hash_map1 = new HashMap < String, Integer > ();
			  hash_map1.put("Red", 1);
			  hash_map1.put("Green", 2);
			  hash_map1.put("Black", 3);
			  hash_map1.put("White", 4);
			  hash_map1.put("Blue", 5);
			  
			  Integer int_val=hash_map1.get("Red");  
			  
			  // check the value
			   System.out.println("Value for key 1 is: " + int_val);
			   
		
			   Collection<Integer> it=hash_map1.values();
			   
			   for (int i:it) {
				   
				   System.out.println(i);
			   }
			   
	}

}
