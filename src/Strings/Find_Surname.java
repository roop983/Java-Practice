package Strings;

import java.util.Arrays;

public class Find_Surname {

	public static void main(String[] args) {
		String str[] =  
			{  
			"Praveen Kumar",  
			"Yuvraj Singh",  
			"Harbhajan Singh",  
			"Gurjit Singh",  
			"Virat Kohli",  
			"Rohit Sharma",  
			"Sandeep Singh",  
			"Milkha Singh"  
			};  
			  
			String surName = "Singh";  
			
//			for (String s: str) {
//				if (s.contains(surName)) {
//					System.out.println(s);
//				}
//			}
			
			//OR
			
			for (String s: str) {
				String extractedSurName = s.substring(s.length()-surName.length());
				
				if (extractedSurName.equals(surName)) {
					System.out.println(s);
				}
			}
			
		}

	}


