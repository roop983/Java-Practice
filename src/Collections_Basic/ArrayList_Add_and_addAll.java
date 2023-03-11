package Collections_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Add_and_addAll {

	public static void main(String[] args) {
List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		//Adding an element at the specific position  
		list.add(3, "AAA");
		
		System.out.println("***********"+list);
		
		//Adding an element at the default last position  
		list.add("BBB");
		
		System.out.println("Before updating the list: "+list);
		System.out.println();
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("XXX");
		list1.add("Abc");
		list1.add("ZZZ");
	
		
		//Adding second list elements to the first list  
       
	   list.addAll(list1);
		
		System.out.println("After adding the 2nd list elements to the 1st: "+list);
		
		System.out.println();
		
		
		
		List<String> list2=new ArrayList<String>();
		
		list2.add("IJKL");
		list2.add("LMNO");
		
		System.out.println("After adding the 3rd list elements to the 1st: "+list);
		System.out.println();
		
		list.addAll(3, list2);
		
		System.out.println("After updating the list: "+list);
		
		//List for adding integers
		List<Integer> list3=new ArrayList<Integer>();
		Collections.addAll(list3, 1, 2, 3, 4, 5);
		//Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println("Integer List values are: "+list3);
		
		List<Character> list4=new ArrayList<Character>();
		Collections.addAll(list4, 'a', 'b','c');
		//Collections.addAll(list, 1, 2, 3, 4, 5);
		
		list4.add(2, 'd'); // Element will be shifted
		
		System.out.println("Character List values are: "+list4);
		
		

	}

}