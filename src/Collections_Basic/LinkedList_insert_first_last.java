package Collections_Basic;

import java.util.*;

public class LinkedList_insert_first_last {

	public static void main(String[] args) {
		
		LinkedList<String> l_list=new LinkedList<> ();
		
		l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
   System.out.println("Original linked list:" + l_list);   
   
   l_list.addFirst("Purple");
   l_list.addLast("Orange");
   l_list.add(0, "Apple");
   
   System.out.println("Updated linked list:" + l_list);   
		

	}

}
