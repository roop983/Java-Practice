package Collections_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Array_to_ArrayList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String> ();
		
		list.add("Smita");
		list.add("Jay");
		list.add("Veeru");
		
		System.out.println("Converting ArrayList to Array" );  
		
		
		String[] stArr=list.toArray(new String[list.size()]); // Convert List to Array
		
		for (String st:stArr) {
			
			System.out.println(st);
		}
		
		
		
		
		System.out.println("###################" ); 
		System.out.println("###################" ); 
		
		System.out.println("Converting Array to ArrayList: " ); 
		
		System.out.println("1st way of coversion: " ); 
		
		List<String> list1=new ArrayList<String> ();
		
		
		list1=Arrays.asList(stArr);
		
		//OR
		
		
		// list1=Arrays.asList("Ramya","Vijay", "Hari");
		
		/* Very Important */
		//list1.remove("Veeru"); // When List is made from Arrays.asList, it makes it as an immutable /not modifiable list. 
		//And hence remove operation will be an unsupported operation. This needs to be converted to ArrayList/ Linke List as shown 
		// in the 3rd way of conversion
		
		System.out.println(list1); 
		
		
		System.out.println("2nd way of coversion: " ); 
		
		//2nd way of converting Array to List
		
		String[] strArr2={"Java","Python","PHP","C++"};
		
		System.out.println("Printing Array: "+Arrays.toString(strArr2));  // Printing the Array
		
		
		List<String> list1_1=new ArrayList<> ();
		
		for (String st1:strArr2) {
			
			list1_1.add(st1);
			
		}
		
		System.out.println(list1_1);
		
		System.out.println("3rd way of coversion: " ); 
		
		List<String> list1_3 = new ArrayList(Arrays.asList("Apple", "Banana", "Grapes"));
		
		//ANother way
		
	//	List<String> list1_4 = new ArrayList(Arrays.asList(strArr2));
		   
		   System.out.println(list1_3);
		   
		   list1_3.remove("Apple");
		   System.out.println("After removal: "+ list1_3);
		
		System.out.println("###################" ); 
List<Integer> list2=new ArrayList<> ();
		
		list2.add(10);
		list2.add(Integer.valueOf(20));
		list2.add(30);
		
		System.out.println("Printing the Integer values from List");  
		for (Integer in:list2) {
			
			System.out.println(in);
		}
		
		
		//Character Array to List and viceversa
		
		String s = "asdasdasda";
	    char[] chars = s.toCharArray();

	    //      List<Character> list = Arrays.asList(chars); // this does not compile,
	    List<char[]> asList = Arrays.asList(chars); // because this DOES compile.

	    //OR
	    List<Character> listC = new ArrayList<Character>();
	    for (char c : chars) {
	        listC.add(c);
	    }
		
		//And this is how you convert List back to array:

		    Character[] array = listC.toArray(new Character[listC.size()]);
		
		
//OR
		    Character[] vowelArr= {'a', 'e', 'i', 'o', 'u'};
			
			List<Character> listChars = new ArrayList<>();
			listChars = Arrays.asList(vowelArr);

		

	}

}
