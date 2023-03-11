package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Integer_Duplicate {

	public static void main(String[] args) {
		
		int[] intArr= {1,2,2,4,5,2,1,6,8,8};
		
		Arrays.sort(intArr);
		 System.out.println("Duplicate elements in given array: ");  
		 
		List<Integer> list =new ArrayList<>();
		
		for (int i=0;i<intArr.length;i++) {
			
			for (int j=i+1;j<intArr.length;j++) {
				
				if(intArr[i]==intArr[j] ) {
					if(!list.contains(intArr[i])) {
						list.add(intArr[i]);
					}
					
				}
			}
				
		}
		
		System.out.println(list);

	}

}
