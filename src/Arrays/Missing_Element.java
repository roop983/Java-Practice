package Arrays;

public class Missing_Element {

	public static void main(String[] args) {
		

		int[] inArr= {4,1,2,3,6};
		
		int len=inArr.length;
		
		int n=len+1;
		
		//sum of n natural numbers using formula n=n*(n+1)/2
		int total=n*(n+1)/2;
		
		int sum=0;
		
		for (int i=0;i<len;i++) {
			
			sum=sum+inArr[i];
		}
		
		
		System.out.println("Missing element is: "+(total-sum));
		
		
		

	}

}
