import java.util.Scanner;

public class FibonacciScanner {

	public static void main(String[] args) {
		
      Scanner scan1=new Scanner(System.in);
		
		System.out.println("Enter the number till which Fibonacci series needs to be printed");
		
		int a=scan1.nextInt();
		
		fibo(a);

	}
	
	public static void fibo(int x)
	{
		int a=0;
		int b=1;
		int c;
		
		for (int i=1;i<=x;i++)
		{
		  c=a+b;
		  
		  System.out.println(a);
		  
		  a=b;
		  b=c;
	    }
		
	}

}
