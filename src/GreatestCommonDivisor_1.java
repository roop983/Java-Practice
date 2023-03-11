
public class GreatestCommonDivisor_1 {

	public static void main(String[] args) {
		
		int x=36;
		int y=72;
		int gcd=0;
		
		for (int i=1;i<=x && i<=y;i++) {
			
			if (x%i==0 && y%i==0)
				gcd=i;
		}
		
		System.out.println(gcd);

	}

}
