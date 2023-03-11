package Tests_Numbers;

public class Test5_Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		//System.out.println(a);
		//System.out.println(b);
		for (int i=1;i<=10;i++) {
			
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			
			
		}

	}

}
