package Strings;

import java.util.Arrays;

public class String_words_reversal {

	public static void main(String[] args) {
		String st = "India Is My Country";
			  
			
			String[] str=st.split("\\s");
			StringBuffer stbuff = new StringBuffer();
			
			for(int i=str.length-1;i>=0;i--) {
				stbuff.append(str[i]).append(" ");
			}
			System.out.print(stbuff.toString().trim());
			
			System.out.print("\n"+"*************"+"\n");
			for(int i=str.length-1;i>=0;i--) {
				System.out.print(str[i].concat(" "));
			}
			
			
		}

	}


