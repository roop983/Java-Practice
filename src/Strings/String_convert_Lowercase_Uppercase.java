package Strings;

public class String_convert_Lowercase_Uppercase {

	public static void main(String[] args) {
		
		String str1="With Great Power comes great Strength";  
		
		
		StringBuilder newStr=new StringBuilder(str1);
		
		char ch=Character.toLowerCase(str1.charAt(0));
		
		 System.out.println(ch);
		 
		 boolean bool=Character.isUpperCase(str1.charAt(1));
		 
		 System.out.println(bool);
		
		int len=str1.length();
		
		//Main Part is below
		
		 for(int i = 0; i < str1.length(); i++) {    
			
			if (Character.isLowerCase(str1.charAt(i))) {
				
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
				
				
			}
			
			else if (Character.isUpperCase(str1.charAt(i))) {
					
					newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		 
		 System.out.println(newStr.toString());
		 
		 String s=newStr.toString();
		 System.out.println(s);
		 

	}
	
}


