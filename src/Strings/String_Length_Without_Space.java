package Strings;

public class String_Length_Without_Space {

	public static void main(String[] args) {
		
		String st="hi guys    this is a string";
		
		//1st Method
		
		String st_no_space=st.replaceAll("\\s+",""); 
		
		System.out.println(st_no_space.length());
		
		//2nd Method
		
		int length=st.length();
		int c=0;
		
		for(int i=0;i<=length-1;i++) {
			
			if (st.charAt(i) != ' ' && st.charAt(i) != '\t') {
				c++;
			}
			
		}
		
		System.out.println(c);
		
		
		//3rd Method
		
		String st1=st.replaceAll(" ",""); 
		
		System.out.println(st1.length());
		
		//4th Method
		
		StringBuilder sb=new StringBuilder();
		
		String[] stAr=st.split("\\s+");
		
		for (String st1_1:stAr) {
			sb.append(st1_1);
		}
		
		System.out.println(sb.toString().length());
	}

}

