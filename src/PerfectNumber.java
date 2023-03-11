import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=scan.nextInt();
		
		int t;
		
		int sum=0;
		
		
		for (int i=1;i<num;i++) {
			
		  t=num%i;
		  
		  if (t==0)
			  sum=sum+i;		  
		} 
		if (sum == num)
		
		 System.out.println(num+" is a Perfect Number");
		
		else 
			
			System.out.println(num+" is not a Perfect Number");

	}

}
