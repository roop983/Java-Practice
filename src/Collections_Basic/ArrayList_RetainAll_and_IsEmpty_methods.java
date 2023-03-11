package Collections_Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_RetainAll_and_IsEmpty_methods {

	public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
		
     System.out.println("Is ArrayList Empty: "+list.isEmpty());  
     
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		

		
		List<String> list1=new ArrayList<String>();
		
		list1.add("XXX");
		list1.add("Abc");
		list1.add("ZZZ");
		list1.add("Ravi");
		
		list.retainAll(list1); //retain elements which are same on both sets.
		
	/*	System.out.println("After performing retainAll() operation, the updated list is: "+list);
		System.out.println();*/
	     System.out.println("Is ArrayList Empty: "+list.isEmpty());  
	     
		Iterator it=list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
