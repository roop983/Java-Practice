package Collections_Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_contains {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		if (list.contains("Vijay")) {
			System.out.println("Element Found");
			
		}
			else
			{
			System.out.println("Element not Found");
		}
		

	}

}
