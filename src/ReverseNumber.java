import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=S1.nextInt();
		
		// int num=1234;
		 int rev=0;
		 int lastdigit;
		 
		 
		 while (num !=0)
		 {
		 
		 lastdigit=num%10;
		 rev=(rev*10) + lastdigit;
		 num=num/10;
		 
		 
		 }
		 System.out.println(rev);

	}

}
