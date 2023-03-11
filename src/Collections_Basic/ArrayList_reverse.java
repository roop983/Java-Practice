package Collections_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_reverse {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		
		list1.add("Ravi");
		list1.add("Chavi");
		list1.add("Vijay");
		list1.add("Ravi");
		list1.add("Chavi");
		
		System.out.println("List before reversing :\n" + list1);  
		
		Collections.sort(list1, Collections.reverseOrder());
		
		System.out.println("Printing the elements in reverse order :\n"+list1);
		
		System.out.println("****************");
		
	   
		

	}

}
