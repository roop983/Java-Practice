package Arrays;

public class Element_frequency_Integer_Array {

	public static void main(String[] args) {
		
		int[] A= {1, 2, 8, 3, 2, 2, 2, 5, 1 };
	
		
		int[] Fr=new int[A.length]; // For taking counts
		
		int visited=-1;
		
		for (int i=0;i<A.length;i++) {
			
			int count=1;
			
			for (int j=i+1;j<A.length;j++)
			{
				if (A[i]==A[j]) {
					count++;
					Fr[j]=visited;
				}
			}
			
			if (Fr[i]!=-1) {
				Fr[i]=count;
			}
		}
		
		for (int i=0;i<Fr.length;i++) {
			
		
			
			if (Fr[i]!=-1 ) {
				
				
				System.out.println(A[i]+"--"+Fr[i]);
				
				
			}
		}

	}

}
