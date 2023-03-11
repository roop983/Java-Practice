package Test_Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Alternate_PrimeNumbers {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<> ();
		
		int count=0;
		
		for (int i=1;i<=1000;i++) {
			
			for (int j=1;j<=i;j++) {
				
				if (i%j==0) {
					count++;
				}
				
				
			}
			if (count==2) {
				
				
				list.add(i);
			}	
			count=0;
		}
		
		
		for (int i=0;i<list.size();i=i+2) {
			
			System.out.println(list.get(i));
		}

	}

}
