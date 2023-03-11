package Tests_Numbers;

public class Test4_Factorial {

	public static void main(String[] args) {
		int n=4;
		
		int sum=1;
		
		for (int i=n;i>=1;i--) {
			
			sum =sum*i;
			
		}
		
		System.out.println(sum);

	}

}
