package Arrays;

import java.util.Arrays;

public class Integer_sort_Desc_2nd_Approach {

	public static void main(String[] args) {
		
		int[] A= {5,2,1,7,8};
		
		Arrays.sort(A);
		
		for (int i=A.length-1;i>=0;i--) {
			System.out.print(A[i]+" ");
		}

	}

}
