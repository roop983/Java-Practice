class Account
{
	String name;
	float amt;
	int acc_no;
	
	void insert (float amount,String N, int Acnt)
	{
		name=N;
		amt=amount;
		acc_no=Acnt;
	}
	
	void deposit (float Amnt1)
	{
		amt=amt+Amnt1;
		System.out.println("Amount Deposited is: "+Amnt1+" and updated Balance is:"+amt);
	}
	
	void withdraw (float Amnt2)
	{
		if (amt < Amnt2)
		{
			System.out.println("Insufficient Balance");
		}
		else if (amt > Amnt2)
		{
			amt=amt-Amnt2;
		}
		System.out.println("Withdrawn Amount is:"+Amnt2+" and updated Balance is:"+amt);
	}
	
	void display ()
	{
		System.out.println("Name: "+name+", Account_No: "+acc_no+", Amount:"+amt);
	}
	
	
}



public class Bank_deposit_withdraw {

	public static void main(String[] args) {
		
		Account A=new Account();
		A.insert(1000,"Roops",123);
		A.deposit(2000);
		A.withdraw(500);
		A.display();

	}

}
