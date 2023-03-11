
public class SumOfDigits {

	public static void main(String[] args) {
		
		int num=74586;
		int lastDigit;
		int sum=0;
		
		while( num!=0) {
			
			lastDigit=num%10;
			num=num/10;
			sum =sum + lastDigit;
		}
		
		System.out.println(sum);

	}

}
