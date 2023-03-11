package Collections_Basic;

import java.util.*;

public class HashMap_contains {

	public static void main(String[] args) {
		Map < String, Integer > hash_map = new HashMap < String, Integer > ();
		  hash_map.put("Red", 1);
		  hash_map.put("Green", 2);
		  hash_map.put("Black", 3);
		  hash_map.put("White", 4);
		  hash_map.put("Blue", 5);
		  hash_map.put("Green", 5);
		  // print the map
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is key 'Green' exists?");
		  
		  if (hash_map.containsKey("Green")) {
			  System.out.println("yes! - " + hash_map.get("Green")); // get value of key: Green
		  }
		  
		 
		  if (hash_map.containsValue(4)) {
			   //value exists
			   System.out.println("Yes! ");
			  } else {
			   //value does not exists
			   System.out.println("no!");
			  }

	}

}
