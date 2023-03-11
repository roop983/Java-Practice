import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
	     Double num=s1.nextDouble();
	     
	     //Double square =num1*num1;
	     
	     Double square =Math.pow(num, 2);
	     
	     Double squareRoot = Math.sqrt(square);
	     
	     System.out.println("Square of "+num+" is: "+square);
	     
	     System.out.println("Squareroot of "+square+" is: "+squareRoot);
		 

	}

}
