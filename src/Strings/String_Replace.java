package Strings;

public class String_Replace {

	public static void main(String[] args) {
		
		//The difference between replace() and replaceAll() method is that:
		//the replace() method replaces all the occurrences of old char with new char 
		//while replaceAll() method replaces all the occurrences of old string with the new string. 
		//Basically replace() works with replacing chars and replaceAll() works with replacing part of strings.
		
		String str = new String("My .com site is BeginnersBook.com");
		System.out.print("String after replacing all com with net: " );
		System.out.println(str.replace("com", "net")); //java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.


		System.out.println("**********************");
		System.out.println(str.replaceFirst("com", "net"));// This method replaces the part of a string with a new specified string. 
			
		System.out.print("Replacing whole String: " );
		System.out.println(str.replaceAll("(.*)Beginners(.*)", "Welcome"));
		
		System.out.println("**********************");
		
		String str1 = new String("Site is BeginnersBook.com");
		System.out.print("String after replacing all 'o' with 'p' :" );
		System.out.println(str1.replace('o', 'p'));
		
		//Here we are displaying the modified string using print statements 
		//but we didn’t actually changed the string str, 
		//to achieve that we need to assign the returned string of replace() method in a string and then that string can have the permanent changes.
		
		

	}

}
