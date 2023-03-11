package Collections_Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Empty_check {

	public static void main(String[] args) {
List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		System.out.println("Original array list: " + list);

        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());
        
        list.removeAll(list);
        
        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());
        
        if (list.isEmpty()) {
        	
        	System.out.println("List is empty");
        }
        else
        {
        	System.out.println("List is not empty");	
        }
		
	}

}
