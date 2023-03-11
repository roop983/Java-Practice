package Arrays;

public class Move_Zeroes_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {2, 0, 5, 0,1, 8, 0};
		
		int t;
		
		int i =0;
		int j = A.length-1;
		

		
		while(i<j) {
			
			if (A[i] == 0 && A[j] == 0) {
				j--;
			}
			else if (A[i] ==0 &&  A[j]!=0) {
				t = A[i];
				A[i]=A[j];
				A[j] = t;
				i++;
				j--;
			} else if (A[i] != 0 &&  A[j]==0) {
				i++;
				j--;
				
			}else if (A[i] != 0 &&  A[j]!=0) {
				
				i++;
			}
			
			
		}
		
		
		
		for (int k=0;k<A.length;k++) {
			System.out.println(A[k]);
		}

	}

}
