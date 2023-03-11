package Strings;

public class String_Split_StringArray {

	public static void main(String[] args) {

		String st="java string split method by javatpoint";
		
		String[] strArr=st.split("\\s");
		
		for (String st1:strArr) {
			
			System.out.println(st1);
		}
		
		System.out.println("******************************");
		
       String[] strArr1=st.split("\\s", 1);
		
		for (String st1:strArr1) {
			
			System.out.println(st1);
		}
		
		System.out.println("******************************");
		
	
			
			for (String st1:st.split("\\s", 2)) {
				
				System.out.println(st1);
			}
			
			
System.out.println("**************4tg****************");
		
	
			
			for (String st1:st.split("\\s", -1)) {  // Same as Limit: 0 , same as no value given
				
				System.out.println(st1);
			}
			
			
			
			
	System.out.println("******************************");
		
	 String[] strArr2=st.split("t", 3);
		
	 
			for (String st1:strArr2) {
				
				System.out.println(st1);
				
				
			}
			System.out.println("Length of the String: "+strArr2.length); // Gives Array Length
			
			
			System.out.println("******************************");
			
			
			
			String s = " ,ab;gh,bc;pq#kk$bb";
			String[] str = s.split("[,;#$]");
			
			
			for (int i=0; i<str.length;i++) {
				
				System.out.println("Str["+i+"]"+str[i]);
				
			}


	}

}
