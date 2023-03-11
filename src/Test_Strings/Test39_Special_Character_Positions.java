package Test_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test39_Special_Character_Positions {

	public static void main(String[] args) {
		
		//Java Program To Find & Print All Special Characters With Their Positions In A String
		//http://makeseleniumeasy.com/2018/09/13/frequently-asked-java-program-21-java-program-to-find-print-all-special-characters-with-their-positions-in-a-string/
		/*Example:
			Input string: Make%Selenium$Easy#

			Output:
			% at position 5.
			$ at position 14.
			# at position 19.
			Total special characters found:3 */
		
		String s="Make%Selenium$Easy#";
		
		String[] sp= {"%", "$", "#", "?", ">"};
		
		List<String> list=new ArrayList<> (Arrays.asList(sp));
		
		int count=0;
		
		for (String st:list) {
			
			if (s.contains(st)) {
				
				int pos=s.indexOf(st);
				System.out.println(st+" at position "+pos);
				count++;
			}
		}
		
		System.out.println("Total special characters matched is: "+count);

	}

}
