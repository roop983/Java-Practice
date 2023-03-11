package Tests_Numbers;

public class Test9_100_Perfect_Numbers {

	public static void main(String[] args) {
         
		
		int sum;
		
		System.out.println("Perfect numbers are: ");
		
		for (int k=1;k<100;k++) {
		 
			sum=0;
			for (int i=1;i<k;i++) {
			
				
			if (k%i==0) {
				
				sum =sum+i;
			}
		}
			
			if (sum==k) {
				
				System.out.println(k);
			}
			
		
		}
		
		
			

	}

}
