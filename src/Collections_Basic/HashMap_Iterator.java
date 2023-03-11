package Collections_Basic;
import java.util.*;
import java.util.Map.Entry;

public class HashMap_Iterator {

	public static void main(String[] args) {
		
		Map<Integer,String> hash_map= new HashMap<Integer,String>();  
		   hash_map.put(1,"Red");
		  hash_map.put(2,"Green");
		  hash_map.put(3,"Black");
		  hash_map.put(4,"White");
		  hash_map.put(5,"Blue");

		 //Iterator over the keys using Keyset() 
		  
		 Iterator<Integer> it=hash_map.keySet().iterator();
		 
		 while (it.hasNext()) {
			 
			 int key=it.next();
			 
			 System.out.println("key="+key+" , "+"value="+hash_map.get(key));
			 
		 }
		 
		 System.out.println("****************");
		 
		//Iterator over the set (pairs) using Entryset() 
		 
		 Iterator<Entry<Integer,String>> it1=hash_map.entrySet().iterator();
		 
		 while(it1.hasNext()) {
			 
			 Entry<Integer, String> entry=it1.next();
			 System.out.println("key="+entry.getKey()+" , "+"value="+entry.getValue());
			 
		 }
		 
		 System.out.println("****************");
		 
		 
		 
		  for (Map.Entry m: hash_map.entrySet()) {
			   
			   System.out.println("key="+m.getKey()+" , "+"value="+m.getValue());
		   }
		 
		  System.out.println("****************");
		 //iterate hashmap using java8 feature:  for each and lambda :
		 
		 hash_map.forEach((k,v) -> System.out.println("key="+k+" , "+"value="+v));
		 
	}

}
