import java.util.Scanner;

public class Largest_Numbers {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		

		
		if(a>b && a>c)
			System.out.println("a is largest");
		else if (b>a && b>c)
			System.out.println("b is largest");	
		else
			System.out.println("c is largest");		
				
		
	}
}
