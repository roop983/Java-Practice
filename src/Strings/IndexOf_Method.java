package Strings;

public class IndexOf_Method {

	public static void main(String[] args) {
		String s1="This is index of example";
		
		String str1 = new String("Oh! This is a BeginnersBook tutorial");
		
		System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15)); // 1st occurence of character B in the string after 15th char
		  System.out.println("Index of B in str1 after 30th char:"+str1.indexOf('B', 30)); // It returns -1 if char does not found  
		
		//passing substring  
		int index1=str1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		int index1_1=s1.indexOf("th");
		System.out.println("Index value is: "+"  "+index1_1);
		
		System.out.println(index1+"  "+index2);
		
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index1+"  "+index3);
		
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  i.e. 1st occurence of character B in the string
		System.out.println(index4);//3  
		
		index4 = s1.indexOf("example", 20); // It returns -1 if substring does not found  
        System.out.println("index of substring "+index4);    
        
        int index5 = s1.indexOf('e', 10); //Returns the index of this char  
        System.out.println("index of char "+index5);  
        
        int index6=s1.lastIndexOf('e');
        System.out.println(index6);


	}

}
