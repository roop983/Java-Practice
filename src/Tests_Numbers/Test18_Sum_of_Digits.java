package Tests_Numbers;

public class Test18_Sum_of_Digits {

	public static void main(String[] args) {
		int n=1238645;
		
		int lastDigit,sum=0;
		
		while (n>0) {
			
			lastDigit=n%10;
			n=n/10;
			sum=sum+lastDigit;
		}
		
		System.out.println(sum);

	}

}
