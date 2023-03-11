package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {100,4,200,1,3,2};
		
		Arrays.sort(A);
		
		List<Integer> list = new ArrayList<>();
		
		for (int i=0;i<A.length;i++) {
			if (A[i+1] == A[i]+1) {
			list.add(A[i]);
			
		}
		else {
			list.add(A[i]);
			break;
		}
	}
		System.out.println(list);

}
}
