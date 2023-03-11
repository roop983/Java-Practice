import java.util.Scanner;

public class ArmstrongNumbers_100 {

	public static void main(String[] args) {
		 
			
			int result;
			
			int temp;
			int sum=0;
			
			int lastDigit;
			
			for (int i=1;i<=2000;i++) {
				
				 result=i;
			
			  while(result !=0) {
				
				lastDigit=result%10;
				temp=lastDigit*lastDigit*lastDigit;
				sum=sum+temp;
				result=result/10;
			}
			
			if (sum == i)
				
			System.out.println(i);
		
			
			sum=0;
			
			}

		}

	}
