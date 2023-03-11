package Collections_Basic;
import java.util.*;

public class ArrayList_ListOfLists {

	public static void main(String[] args) {
		
		List<List<Integer>> listOfLists = new ArrayList<>();
		
	
        
        // Creating innerList 
        List<Integer> innerList = new ArrayList<>();
        
        // Adding elements to innerList
        innerList.add(1);
        innerList.add(2);
        innerList.add(3);
        
        // Adding innerList to listOfLists
        listOfLists.add(innerList);
        
        // Creating another inner list 
        List<Integer> innerList2 = new ArrayList<>();
        
        // Adding elements to innerList2
        innerList2.add(100);
        innerList2.add(101);
        innerList2.add(102);
        
        // Adding innerList2 to listOfLists
        listOfLists.add(innerList2);        

        // Printing listOfLists elements
        System.out.println(listOfLists);
        //System.out.println(listOfLists.get(0).get(2));
        
        for (List l:listOfLists) {
        	
        	for (Object i: l) {
        		
        		System.out.print(i + " ");
        	}
        	System.out.println("");
        }
        /*
        for(List innerlist : listOfLists)
        {
            for(Object i : innerlist)
            {
                System.out.print( i+ " ");
            }
            System.out.println("");
        }
        
        */


	}

}
