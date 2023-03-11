package Test_Strings;

public class Test20_Reverse_Sentence_String {

	public static void main(String[] args) {
		
		String test="Alice does not even like bob";
		
		//test=test.replaceAll("\\s+"," ");
		
		//String res="";
		StringBuilder sb=new StringBuilder();
		
		String[] array=test.split("\\s+");
		
		
		for (String s:array) {
			//s=s.trim();
			System.out.println(s);
		}
		

		for (int i=array.length-1;i>=0;i--) {
			
			
			//res=res+array[i]+" ";
			sb.append(array[i]).append(" ");
			
		}
		
		
		
		System.out.println(sb.toString().trim());
		
		
		/*
		String s1="java   string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){ 
			w=w.stripTrailing();
		System.out.println(w);  
		}  
		
		*/

	}

}
