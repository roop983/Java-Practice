import java.util.Scanner;

public class LargestFactor {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=scan.nextInt();
		
		int t;
		int a=0;
		int largest=0;
		
		for (int i=1;i<num;i++) {
			
			
			
			if (num%i==0) {
				largest=a>i?a:i;
				a=largest;
		}
			

	}
		
		System.out.println(largest);

}
}