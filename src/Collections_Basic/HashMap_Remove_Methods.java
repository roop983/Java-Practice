package Collections_Basic;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Remove_Methods {

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
		   map.putIfAbsent(103, "Guava");  
		   
		   System.out.println("Iterating Hashmap..."); 
		   //To get the key and value elements, we should call the getKey() and getValue() methods. 
		   //The Map.Entry interface contains the getKey() and getValue() methods. 
		   //But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.
		  
		   for (Map.Entry m: map.entrySet() ) {
			   
			   System.out.println(m.getKey()+" "+m.getValue());
		   }

		 //key-based removal  
		    map.remove(103);  
		    System.out.println("Updated list of elements: "+map);  
		    
		    
		    //key-value pair based removal  
		    
		    map.remove(null, "Banana");
		    System.out.println("Updated list of elements: "+map);  
		    
		    //Replace elements
		    System.out.println("Updated list of elements:*****"); 
		    
		   map.replace(2, "Pears");
		   
		   for (Map.Entry m:map.entrySet()) {
			   
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		   
		   System.out.println("Updated list of elements:$$$$");  
		   
		   //Replace elements by passing old and new value
		   map.replace(2, "Pears", "Avocadoes");
		   
		   for (Map.Entry m:map.entrySet()) {
			   
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		   

		//ReplaceAll
		   
		   map.replaceAll((k,v)->"Fruits");
		   
		   for (Map.Entry m:map.entrySet()) {
			   
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		   
	}

}
