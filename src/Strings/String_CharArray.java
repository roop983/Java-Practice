package Strings;

public class String_CharArray {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Javatpoint";  
        char[] chArr = s1.toCharArray();  
        int len = chArr.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (char ch1:chArr) {  
            System.out.println(ch1);  
        }  
        
        //OR
        /*for (int i = 0; i < len; i++) {  
            System.out.println(ch[i]);  
        }  */

	}

}
