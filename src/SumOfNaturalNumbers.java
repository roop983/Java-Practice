import java.util.Scanner;

public class SumOfNaturalNumbers {
	
     
	public static void SumNaturalNumbers(int num) {
		
		 int sum=0;
		
		for (int i=1;i<=num;i++) {
			
			 sum = sum +i;
		}
	System.out.println("Sum of First N Natural Numbers is = "+ sum);
		//return sum;
	}
	

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		//System.out.print("Sum of First N Natural Numbers is = " +SumNaturalNumbers(num));
		
		SumNaturalNumbers(num);

	}

}
