package Collections_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Asc_Desc_Sort {

	public static void main(String[] args) {
List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
	
		
		System.out.println("Before Sorting: ");
		
		for (String names:list) {
			System.out.println(names);
		}
		
		System.out.println("After Sorting: ");
		
		Collections.sort(list);
		
		for (String names:list) {
			System.out.println(names);
		}
		
		
List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(100);
		list1.add(135);
		list1.add(29);
		list1.add(922);
		
	
		
		System.out.println("Before Sorting: ");
		
		System.out.println("Before updating the list: "+list1);
		
		System.out.println("After Sorting: ");
		
		Collections.sort(list1);
		
		System.out.println("Before updating the list: "+list1);
		
		System.out.println();
		
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}  
		System.out.println();
		
		System.out.println("************");  
		
List<String> list2=new ArrayList<String>();
		
		list2.add("Data Science");   
		list2.add("Testing");   
		list2.add("C#");   
		list2.add("Basic Language");   
		list2.add("UML");   
		list2.add("Algorithms ");  
		
		Collections.sort(list2, Collections.reverseOrder());
		

		System.out.println("Subjects in Descending order are: ");
		
		for(String subjects: list2)  
		{  
		System.out.println(subjects);  
		}  
		System.out.println("************");  
		
List<String> list3=new ArrayList<String>();
		
		list3.add("is");
		list3.add("sentence");
		list3.add("This");
		list3.add("a");
		
		

		
		Collections.reverse(list3);
		
		for (String names:list3) {
			System.out.println(names);
		}
		

	}

}



