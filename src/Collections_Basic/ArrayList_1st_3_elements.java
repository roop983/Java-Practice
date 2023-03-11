package Collections_Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1st_3_elements {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		
		list1.add("Ravi");
		list1.add("Chavi");
		list1.add("Vijay");
		list1.add("Ravi");
		list1.add("Chavi");
		
		System.out.println("Original List :\n" + list1);  
		
		List<String> list2=list1.subList(0, 3);
		
		
		System.out.println("List of first three elements :\n" + list2);  

	}

}
