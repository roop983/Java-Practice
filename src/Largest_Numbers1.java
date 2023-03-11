import java.util.Scanner;

public class Largest_Numbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the numbers");
			
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int temp;
			
			int largest;
			
		
			 temp=a>b?a:b;
			 largest=temp>c?temp:c;
			 
			 System.out.println("Largest number is: "+largest);
			
			
			
		}
	}
