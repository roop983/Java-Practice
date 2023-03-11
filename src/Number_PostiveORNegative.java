import java.util.Scanner;

public class Number_PostiveORNegative {

	public static void PositiveNegative(double num) {
		
		if (num > 0)
			System.out.println("The number is positive");
		else if (num < 0)
			
			System.out.println("The number is negative");
		else
			System.out.println("The number is 0");
	}
	

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		double num=scan.nextDouble();
		
		PositiveNegative(num);

	}

}