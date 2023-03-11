package Tests_Numbers;

public class Test11_Armstrong_Numbers_100 {

	public static void main(String[] args) {
		int n=1634;
		
		int digits;
		
		double sum;
		
		int lastDigit, temp;
		
		System.out.println("Armstrong Numbers are:");
		
		for (int i=0;i<=2000;i++) {
			
			sum=0;
			temp=i;
			lastDigit=0;
			digits=0;
			
			while (temp > 0 ) {
				
				temp=temp/10;
				digits++;
			}
			
			temp=i;
			
			while (temp > 0 ) {
				
				lastDigit=temp%10;
				sum=sum + Math.pow(lastDigit, digits);
				temp=temp/10;
				
			}
			
			if (i==sum) {
				System.out.println(i);
			}
			
		}
		 
			
		
		

	}

}
