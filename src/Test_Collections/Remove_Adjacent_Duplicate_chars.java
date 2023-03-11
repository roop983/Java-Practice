package Test_Collections;

import java.util.ArrayList;
import java.util.List;

public class Remove_Adjacent_Duplicate_chars {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<> ();
		
		String s="abbaca";
		
		int i=0;
		
		int count=0;
		
		String[] stAr=s.split("");
		
		for (String c:stAr) {
			list.add(c);
		}
		
		//System.out.println(list);
		
		//while( i<list.size() ){
		for ( i=0;i<list.size();i++)  {
			//System.out.println(list.get(i));
			count++;
			
		while (count>0) {
			if (i+1==list.size()) {
				break;
			}
			if ((list.get(i)).equals(list.get(i+1))) {
				//list.remove(list.get(i));
				String st=list.get(i);
				//list.removeIf(str -> str.contains(st));
				list.remove(i);
				list.remove(i);
				//System.out.println(list);
				i=-1;
				count=0;
				break;
			
			}
			count=0;
			//break;
		}
		//i++;
		}
		
		/*
		while (j<list.size()) {
			
			for ( i=0;i<list.size();i++)  {
				j++;
				if ((list.get(i)).equals(list.get(i+1))) {
					//list.remove(list.get(i));
					String st=list.get(i);
					list.removeIf(str -> str.contains(st));
					//System.out.println(list.get(i));
					i=0;
					break;
				
				}
			}
		}
			
			*/
		
		//list.removeIf(str -> str.contains("a"));
		System.out.println(list);

	}

}
