package Collections_Basic;
import java.util.*;

public class HashMap_Methods {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String> ();
		
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); 
		   map.put(null,"Banana");
		   map.put(4,"Banana");
		   map.put(5,"Papaya");
		   map.put(6,null);

		   System.out.println(map.get(2)); 
		   
		   System.out.println("Iterating Hashmap..."); 
		   //To get the key and value elements, we should call the getKey() and getValue() methods. 
		   //The Map.Entry interface contains the getKey() and getValue() methods. 
		   //But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.
		  
		   
		   for (Map.Entry m: map.entrySet()) {
			   
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		   
		   map.putIfAbsent(6, "Orange");
		   map.putIfAbsent(103, "Guava");  
		   map.put(7, "Watermelon");
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		   
		   HashMap<Integer,String> map1=new HashMap<Integer,String>();  
		      map1.put(104,"Ravi");  
		      map1.put(105,"Ravi");
		      
		    map.putAll(map1); //copy all of the mappings from the specified map to another map.
		    
		    System.out.println("After invoking putAll() method ");  
		    for (Map.Entry m: map.entrySet()) {
				   
				   System.out.println(m.getKey()+" "+m.getValue());
			   }
		    
		 // Removing all the elements from the linked map
		    map1.clear();
		    System.out.println("The New map: " + map1);
		    
		    // Cloning or copy of a HashMap instance.
		    HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		    new_hash_map = (HashMap)map.clone();     
		    System.out.println("Cloned map: " + new_hash_map);        
			   
		   

	}

}
