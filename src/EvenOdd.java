import java.util.Scanner;

 

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=scan.nextInt();
		
		findEvenOdd(num); //Enter the number upto which you want to find odd or even
	}
		
		public static void findEvenOdd(int N)
		{
			
			for (int i=1;i<=N;i++)
			{
			       if (i%2==0)
			
				System.out.println("Number is even: "+i);
			
			else
				System.out.println("Number is odd: "+i);
			
			}
				
		}
	

	}


