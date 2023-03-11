package Collections_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraList_Copy_and_Shuffle {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Ravi");
		list1.add("Chavi");
		list1.add("Vijay");
		list1.add("Ravi");
		list1.add("Chavi");
		
		
		List<String> list2=new ArrayList<String>();
		
		//1st way of copy
		list2.addAll(list1);
		
		System.out.println("Adding all elements from list1 :"+list2);
		
		
		// 2nd way of copy
		
		List<String> list3=new ArrayList<String>();
		
		list3.add("1");
		list3.add("2");
		
		
		List<String> list4=new ArrayList<String>();
		
		list4.add("A");
		list4.add("B");
		list4.add("C");
		
		// Copy List3 to List4
		Collections.copy(list4, list3);
		
		
		System.out.println("List3 :"+list3);
		System.out.println("List4 :"+list4);
		
		Collections.shuffle(list1);
		
		  System.out.println("List after shuffling:\n" + list1); 

	}

}
