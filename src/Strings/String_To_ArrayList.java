package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_To_ArrayList {

	public static void main(String[] args) {
		String st="92,93,94,95,92";
		
		String[] stArr=st.split(",");
		
		//List nl =new ArrayList();
		
		List<String> nl=new ArrayList<String>();
		nl=Arrays.asList(stArr);
		
		for(String s: nl){
            System.out.println(s);
        }
		
		
		
		

	}

}
