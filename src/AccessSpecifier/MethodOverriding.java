package AccessSpecifier;

class Bank {
	
	 int interestRate() {
		return 0;
	}
}

class SBIBank extends Bank{
	
	int interestRate() {
		return 8;
	}
	
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBIBank sbi = new SBIBank();
		System.out.println(sbi.interestRate());
		

	}

}
