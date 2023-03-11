import java.util.Scanner;

public class AdditionScanner {

	public static void main(String[] args) {
		
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		
		int a=scan1.nextInt();
		
		System.out.println("Enter the 2nd number");
		
		int b=scan1.nextInt();
		
		int c=sum(a,b);
		System.out.println("Sum of the numbers: "+c);
				

	}
	
	 static int sum(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}

	

}
