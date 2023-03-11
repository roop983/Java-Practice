import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=scan1.nextInt();
		
		 int count=0;
		 
		 for ( int i=1; i<=num;i++)
		 {
			 
				if (num%i==0)
				{
					count++;
				}			
		}	
		 if (count==2)
		 
		 System.out.println(num+" is prime");
	
		 else 
	     System.out.println(num+" is not prime");
			 

	}


	
}


