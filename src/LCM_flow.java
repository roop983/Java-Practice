
public class LCM_flow {

	public static void main(String[] args) {
		
		int num1=12;
		int num2=25;
		
		int gcd=1;
	
		
		for (int i=1;i<=num1 && i<=num2;i++) {
			
			if (num1%i ==0 && num2%i==0)
				
				gcd=i;
			
		}
		
		int lcm=(num1*num2)/gcd;
		
		int hcf=(num1*num2)/lcm;
		
		System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
		
		System.out.println("HCF of "+num1+" and "+num2+" is: "+hcf);



	}

}
