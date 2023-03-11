package Tests_Numbers;

public class Test12_Perfect_Square {

	public static void main(String[] args) {
		
		int n=25;
		
		int t;
		
		for (int i=0;i<=n;i++) {
			
			t=i*i;
			
			if (t==n) {
				System.out.println(+n+" is a perfect square of: "+i);
				
				System.out.println("Square root of: "+n+ " is "+t/i);
			}
			
			
				
		}

	}

}
