package Strings;

public class String_Replace_Regex {

	public static void main(String[] args) {
		
		String s="A man123, a plan, a canal: Panama";
		
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		
		//String st=s.replaceAll("\\s+", "").toLowerCase(); //replace space
		
		System.out.println(actual);

	}

}
