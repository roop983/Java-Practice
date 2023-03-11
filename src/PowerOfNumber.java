
public class PowerOfNumber {

	public static void main(String[] args) {
		
		int num=2;
		int pow=5;
		
		int sum=num;
		
		//for (int i=pow;i>1;i--) {
		for (int i=1;i<pow;i++) {
			
			sum=sum*num;
		}
		
		  System.out.println(num+"^"+pow+" = "+sum);

	}

}
