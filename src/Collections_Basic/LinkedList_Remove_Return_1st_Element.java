package Collections_Basic;

import java.util.LinkedList;

public class LinkedList_Remove_Return_1st_Element {

	public static void main(String[] args) {
LinkedList<String> l_list=new LinkedList<> ();
		
		l_list.add("Red");
        l_list.add("Green");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Purple");
        l_list.add("Black");
   System.out.println("Original linked list:" + l_list);   
   
   String st=l_list.removeFirst();
   l_list.removeLast();
   l_list.removeFirstOccurrence("Green");
   
   System.out.println("Removed 1st FirstElement:" + st);  
   
   System.out.println("Updated linked list:" + l_list);   
   
   System.out.println("Removed 1st FirstElement again:" + l_list.pop()); 
   
   System.out.println("Updated linked list:" + l_list); 

	}

}
