import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
       Scanner scan1=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int actual_num=scan1.nextInt();
		
		int temp=actual_num;
		
		int digits=0;
		
		double sum=0;
		
		int lastDigit;
		
		while(temp > 1) {
			
			temp=temp/10;
			
			digits++;
			
		}
		
		System.out.println(digits);
		
		temp=actual_num;
		
		while(temp > 1) {
			
			lastDigit=temp%10;
			sum =sum + Math.pow(lastDigit, digits);
			temp=temp/10;
			
		}
		
		if (sum == actual_num)
			
		System.out.println(actual_num+" Number is Armstrong");
		
		else
		
		System.out.println(actual_num+" Number is not Armstrong");

	}

}
