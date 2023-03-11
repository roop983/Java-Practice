package Collections_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Get_and_Set_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		//accessing the element    
		String st=list.get(0);
		
		System.out.println("Name is: "+st);
		
		System.out.println("Before updating the list: "+list);
		
	/*	for (String names:list) {
			System.out.println(names);
		}*/
		
		  //changing the element 
		list.set(0, "Suraj");
		
		System.out.println("After updating the list: "+list);
		
		
			for (int i=0;i<list.size();i++) {
			
			if (list.get(i)=="Chavi") {
				
				list.set(i,"Ram");
				
			}
		}
			
			System.out.println("After updating the list: "+list);
			
			System.out.println("Printing list as String: ");
		
			for (String s: list) {
				
				System.out.println(s);
			}
		
	

	}

}
