package Test_Strings;

import java.util.Arrays;

public class Test16_Sort_Sentence2 {

	public static void main(String[] args) {
		
		//String[] array = new String [] {"Myself2", "Me1", "I4","and3"};
		
		String test="is2 sentence4 This1 a3";
		
		String[] input=test.split(" ");
		
		String[] output= new String[input.length];
		
		for(String s: input) {
			int arrayIndex = Integer.parseInt(s.substring(s.length()-1))-1;
			
			output[arrayIndex] = s.substring(0,s.length()-1); 
		}
		
		for(int i =0;i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
		
		
		
	}

}
