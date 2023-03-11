package Test_Collections;

import java.util.ArrayList;
import java.util.*;

public class List_of_Lists_Set_Find_Destination_City {

	public static void main(String[] args) {
		
		List<List<String>> listOfLists = new ArrayList<>();
		
	
        
        // Creating innerList 
        List<String> innerList = new ArrayList<>();
        
        // Adding elements to innerList
        innerList.add("London");
        innerList.add("New York");
   
        
        // Adding innerList to listOfLists
        listOfLists.add(innerList);
        
        // Creating another inner list 
        List<String> innerList2 = new ArrayList<>();
        
        // Adding elements to innerList2
        innerList2.add("New York");
        innerList2.add("Lima");
        
        
        // Adding innerList2 to listOfLists
        listOfLists.add(innerList2); 
        
        List<String> innerList3 = new ArrayList<>();
        
        // Adding elements to innerList2
        
        innerList3.add("Lima");
        innerList3.add("Sao Paulo");
        
        // Adding innerList2 to listOfLists
        listOfLists.add(innerList3); 
        
        System.out.println(listOfLists);
        
        Set<String> set=new HashSet<> ();
        for (List<String> l: listOfLists) {
        	
        	set.add(l.get(1));
        }
        
        System.out.println(set);
        
        for (List<String> l: listOfLists) {
        	
        	set.remove(l.get(0));
        }
        
        System.out.println(set);


	}

}
