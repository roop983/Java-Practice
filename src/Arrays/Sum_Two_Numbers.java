package Arrays;

public class Sum_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,2,4};
		int target = 6;
		int count =0;
		
		for (int i =0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				
				if(A[i]+A[j] == target && i!=j) {
					System.out.println(i+" "+j);
					count ++;
					//break;
				}
			}
			
			if (count ==1) {
				break;
			}
		}

	}

}
