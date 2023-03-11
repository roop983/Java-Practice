package Collections_Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList_Iterator_Remove_Element {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Sona");
		
		Iterator<String> itr=list.iterator();
		
		while (itr.hasNext()) {
			
			String list_temp=itr.next();
			System.out.println(list_temp);
			
			if (list_temp.equals("Ravi")) {
			
			itr.remove();
			//list.add("Sangita"); // This operation cannot be done, while iterating. 
			//Will throw java.util.ConcurrentModificationException
			// To make this work, declare List as CopyOnWriteArrayList
			
			}
			
		}
		
	
		
		System.out.println("Updated List: "+list);
		

	}

}
