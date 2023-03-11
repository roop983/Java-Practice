package Collections_Basic;

import java.util.*;

public class HashSet_from_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        list.add("Ajay");  
        
       //Set<String> set=new HashSet(list);  //ignores duplicate elements but doesnt maintains insertion order
        
        
        Set<String> set =new LinkedHashSet(list);  //ignores duplicate elements and maintains insertion order
        
        set.add("Harsh");
        
        Iterator<String> it =set.iterator();
        
        while (it.hasNext()) {
        	
        	System.out.println(it.next());
        	
 
        }

	}

}
