package Strings;

import java.util.Arrays;

public class Find_No_Words {

	public static void main(String[] args) {
		String st = "    India Is My Country";
			  
			
			String[] str=st.trim().split("\\s");
			
			for(String s:str) {
				System.out.println(s);
			}
			System.out.println(str.length);
			
		}

	}


