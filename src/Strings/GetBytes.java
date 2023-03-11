package Strings;

public class GetBytes {

	public static void main(String[] args) {
		
		String s1="ABCDEFG";
		byte[] barr=s1.getBytes();
		
		for (int i=0;i<=barr.length-1;i++) {
			
			System.out.println(barr[i]);  
		}
		// Getting string back   
		String s2=new String(barr);
		
		System.out.println(s2);  
	}

}
