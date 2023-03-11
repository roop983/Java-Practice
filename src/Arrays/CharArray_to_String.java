package Arrays;

public class CharArray_to_String {

	public static void main(String[] args) {
		
		char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
		
		// Method 1: Using String object
		String st=new String(ch);
		System.out.println(st);
		
		// Method 2: Using valueOf method
		String st1=String.valueOf(ch);
		System.out.println(st1);

	}

}
