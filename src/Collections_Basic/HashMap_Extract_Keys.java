package Collections_Basic;
import java.util.*;

public class HashMap_Extract_Keys {

	public static void main(String[] args) {
		Map<Integer,String> hash_map= new HashMap<Integer,String>();  
		  
		  hash_map.put(1,"Red");
		  hash_map.put(2,"Green");
		  hash_map.put(3,"Black");
		  hash_map.put(4,"White");
		  hash_map.put(5,"Blue");
		  
		// get keyset value from map
		  Set<Integer> keyset= hash_map.keySet();
		  
		  // check key set values
		   System.out.println("Key set values are: " + keyset);  
		   
		// checking collection view of the map
		   
		 System.out.println("Collection view is: "+ hash_map.values());
		   
		 HashMap<String, List> hash_map1= new HashMap<String, List>();  
		  
		  

	}

}
