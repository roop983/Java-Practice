package Test_Strings;

public class Test18_Two_StringArray_Equivalent {

	public static void main(String[] args) {
		
		String[] array1= {"ab", "c"};
		String[] array2= {"a", "bc"};
		
//		String[] array1= {"abc", "d", "defg"};
//		String[] array2= {"abcddefg"};
		
		String res1="";
		String res2="";
		
		for (String s1:array1) {
			
			res1=res1+s1;
			
		}
		
		for (String s2:array2) {
			
			res2=res2+s2;
		}
		
		System.out.println(res1.equals(res2));
		

	}

}
