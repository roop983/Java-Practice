import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the 1st number");
		
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=scan.nextInt();
		
		int largest_num=num1>num2?num1:num2;
		int smallest_num=num1<num2?num1:num2;
		
		int t1,t2, largest_factor=0;
		
		int i=1;
		
		while (i<=smallest_num) {
			
			t1=largest_num%i;
			
			t2=smallest_num%i;
				
			if(t1==t2) {
				largest_factor=i;
				}
			
			i++;
			
		}
		
		System.out.println(largest_factor);

	}

}
