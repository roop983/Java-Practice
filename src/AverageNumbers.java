import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		
		int count=0;
		
		double avg;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the 1st number");
		
		double num1=scan.nextDouble();
		
		count++;
		System.out.println("Enter the 2nd number");
		double num2=scan.nextDouble();
		
		count++;
		
		System.out.println("Enter the 3rd number");
		double num3=scan.nextDouble();
		
		count++;
		
		 avg=(num1+num2+num3)/count;
		
		System.out.println(avg);
		

	}

}
