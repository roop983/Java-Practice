package Collections_Basic;

import java.util.*;

public class LinkedList_convert_to_ArrayList {

	public static void main(String[] args) {
		List<String> l_list=new LinkedList<> ();
		
		l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
   System.out.println("Original linked list:" + l_list); 
   
   //1st way
   ArrayList<String> a_list=new ArrayList<> ();
   
   for (String st: l_list) {
	   
	   a_list.add(st);
   }
   
   System.out.println("New ArrayList :" + a_list); 
   
   
   //2nd way
   List<String> list = new ArrayList<String>(l_list);

   for (String str : list){
     System.out.println(str);
   }
   
   System.out.println("New List:" + list); 
   
   
   List<String> list2 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++"));
   
   System.out.println(list2);
   

	}

}
