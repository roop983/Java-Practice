package Collections_Basic;

import java.util.*;  

public class ArrayList_Iterator_ListIterator_Backward {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Chavi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Chavi");
		
		Iterator itr=list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*******OR********");  
		
		list.forEach(System.out::println); //Another way of printing the list
		
		
		System.out.println("***************");  

		ListIterator<String> itr1=list.listIterator();
		
		System.out.println("Traversing elements in forward direction");    
		while(itr1.hasNext()) {
			
			System.out.println("index:"+itr1.nextIndex()+" value is: "+itr1.next());
		}
		
		System.out.println("Traversing elements in backward direction");    
		while (itr1.hasPrevious()) {
			
			System.out.println("index:"+ itr1.previousIndex()+ " value is:"+ itr1.previous());
		}

	}

}
