class Fact
{
	int c=1;
	int i;
	
	void calculate(int fact_number)
	{
		for (int i=1;i<=fact_number;i++)
		{
			c=c*i;
		}
		
		//System.out.println("Factorial is:"+c);  //This can be used when calling method is with anonymous object  
		
	}
	
	void display()
	{
		System.out.println("Factorial is:"+c);
	}
}


public class Factorial_Method {

	public static void main(String[] args) {
		
		Fact f=new Fact();
		f.calculate(5);
		f.display();
		//new Fact().calculate(5);  // anonymous object  

	}

}
