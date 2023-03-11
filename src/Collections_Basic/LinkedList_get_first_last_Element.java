package Collections_Basic;

import java.util.LinkedList;

public class LinkedList_get_first_last_Element {

	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<> ();
		
		l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
   System.out.println("Original linked list:" + l_list);   
   
   String first_element=l_list.getFirst();
   String last_element=l_list.getLast();
   
   //Object f=l_list.getFirst();
   
   System.out.println("First Element is: "+first_element);
   
   System.out.println("First Element is: "+last_element);
		

	}

}
