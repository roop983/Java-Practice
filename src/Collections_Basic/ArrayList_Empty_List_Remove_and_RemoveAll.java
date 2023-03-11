package Collections_Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Empty_List_Remove_and_RemoveAll {

	public static void main(String[] args) {
  List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		//Adding an element at the specific position  
		list.remove("Chavi");

		list.remove(0);
		
	
		System.out.println("Updated list after removing the elements :"+list);
		System.out.println();
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("XXX");
		list1.add("Abc");
		list1.add("ZZZ");
		
		//Adding second list elements to the first list  
       
	   list.addAll(list1);
		
		System.out.println("After adding the 2nd list elements to the 1st: "+list);
		System.out.println();
	
		
		
		list.removeAll(list1);
			
			System.out.println("After removing the 2nd list elements to the 1st: "+list);
			System.out.println();
		
		
		
		List<String> list2=new ArrayList<String>();
		
		list2.add("IJKL");
		list2.add("LMNO");
		
		
		list.addAll(3, list2);
		
		System.out.println("After adding the 3rd list elements to the 1st: "+list);
		System.out.println();
		
		
		//Removing elements on the basis of specified condition  
		
		list.removeIf(str -> str.contains("LMNO"));
		
		//list.remove("LMNO");
		
		System.out.println("Updated list after removing as per the condition: "+list);
		System.out.println();
		
		//Removing all the elements available in the list  
        list.clear();
        
        System.out.println("Updated list after removing as per the condition: "+list);
		System.out.println();
		
		//2nd way of emptying the list
		//Removing all the elements available in the list  
		
		list.add("Asha");
		list.add("Hiran");
		

		System.out.println("Updated list before removing: "+list);
		
        list.removeAll(list);
        
        System.out.println();
        System.out.println("Updated list after removing as per the condition: "+list);
	
		
		

	}

}