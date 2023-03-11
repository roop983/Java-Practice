package Test_Strings;

import java.util.Arrays;

public class Test16_Sort_Sentence {

	public static void main(String[] args) {
		
		//String[] array = new String [] {"Myself2", "Me1", "I4","and3"};
		
		String test="is2 sentence4 This1 a3";
		
		String[] array=test.split(" ");
		
		//String[] array = new String [] {"is2", "sentence4", "This1","a3"}; 
		
		char[] chArr=new char[array.length];
		
		String result="";
		
		int i=0;
		
		for (String st: array) {
			
			String s=st.substring(st.length()-1);
			char c=s.charAt(0);
			chArr[i]=c;
			i++;
		}
		
		Arrays.sort(chArr);
		
		for (int j = 0; j < chArr.length; j++)   
		{       
		System.out.println(chArr[j]);   
		}   
		
		for (int k = 0; k < chArr.length; k++)   
		{       
		      for (String st1:array) {
		    	  
		    	  int len=st1.length();
		    	  
//		    	  if (st1.charAt(len-1)==chArr[k]) {
//		    		  
//		    		  result=result+st1.substring(0, len-1)+" ";
//		    	  }
		    	  
		    	  if(st1.contains(String.valueOf(chArr[k]))) {
		    		  result=result+st1.substring(0, len-1)+" ";
		    	  }
		    		  
		    	  }
		      
		     
		    	  
		}  
		
		System.out.print(result.stripTrailing());   
		System.out.println();
		
		
		char ch='0';
		
		char ch1='2';
		
		int t=(int) ch;
		int t1=(int) ch1;
		
		System.out.println(t);
		
		System.out.println(t1);
		
		System.out.println((int)('2'-'0'));
		
		
		String[] stAtr1 = {"5", "3", "1", "6", "2"};
		
		
		
		
		
		
		
		
		
		
		
	}

}
