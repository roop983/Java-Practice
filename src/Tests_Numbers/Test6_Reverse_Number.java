package Tests_Numbers;

public class Test6_Reverse_Number {

	public static void main(String[] args) {
		
		int num=121;
		
		int rev=0;
		
		int lastDigit;
		
		while (num!=0) {
			
			lastDigit=num%10;
			rev=(rev*10)+lastDigit;
			num=num/10;
		}
		
		System.out.println(rev);

	}

}
