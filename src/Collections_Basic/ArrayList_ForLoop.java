package Collections_Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		for (String names:list) {
			System.out.println(names);
		}
		
		System.out.println("Retrieving a specfic element:");
		for (int i=0;i<list.size();i++) {
			
			if (list.get(i).equals("Chavi")) {
				
				System.out.println(list.get(i));
				break;
			}
		}
		

	}

}
