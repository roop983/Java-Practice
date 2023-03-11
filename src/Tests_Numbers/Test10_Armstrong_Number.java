package Tests_Numbers;

public class Test10_Armstrong_Number {

	public static void main(String[] args) {
		
		int n=371;
		
		int digits=0;
		
		double sum=0;
		
		int lastDigit, temp;
		
		 temp=n;
		
		while (temp > 0 ) {
			
			temp=temp/10;
			digits++;
		}
		
		temp=n;
		
		while (temp > 0 ) {
			
			lastDigit=temp%10;
			sum=sum + Math.pow(lastDigit, digits);
			temp=temp/10;
			
		}
		
		if (n==sum) {
			System.out.println("Number: "+n+" is Armstrong");
		}
		
		else
		{
			System.out.println("Number: "+n+" is not Armstrong");
		}

	}

}
