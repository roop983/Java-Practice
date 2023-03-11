package Arrays;

import java.util.Arrays;

public class Duplicate_Element {

	public static void main(String[] args) {
		int[] A= {1,2,3,2,1,5 };
		
		Arrays.sort(A);
		
		//int[] A= {1,1,2,2,3,5 };
		
		System.out.println("Duplicate Elements are:");
		
		for(int i=0;i<A.length;i++) {
			
			int count=1;
			
			for(int j=i+1;j<A.length;j++) {
				
				if (A[i]==A[j]) {
					count++;
				}
				
			}
			
			if (count >1) {
				System.out.println(A[i]);
			}
		}

	}

}
