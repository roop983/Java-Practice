import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		
		int actual_num=scan.nextInt();
		
		int temp=actual_num;
		
		int lastdigit;
		
		int rev=0;
		
		
		while (temp !=0) {
			
			lastdigit = temp%10;
			
			rev=(rev*10)+lastdigit;
			
			temp =temp/10;
			
		}
		
		if (actual_num==rev)
		
		System.out.println("Number is Pallindrom: "+ rev);
			
		else
		System.out.println("Number is not Pallindrom: "+ rev);
	}

}
