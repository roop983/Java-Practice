package Collections_Basic;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_and_Missing_Elements {

	public static void main(String[] args) {
		
		int[] intAr= {1,2,4,5,4};
		
		int missing,duplicate=0,sum=0;
		
		int len=intAr.length;
		
		int n=len;
		
		int total=n*(n+1)/2;
		
		System.out.println(total);
	
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i=0;i<len;i++) {
			
			if (!list.contains(intAr[i])) {
				
				list.add(intAr[i]);
				sum=sum+intAr[i];
			}
			
			else
			{
				duplicate=intAr[i];
			}
		}
		
		 missing=total-sum;
		
		System.out.println(missing+" "+duplicate);
		
		//System.out.println(total);
		
	//	System.out.println(sum);
		
		

	}

}
