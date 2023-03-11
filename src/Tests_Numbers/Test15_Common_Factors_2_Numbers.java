package Tests_Numbers;

public class Test15_Common_Factors_2_Numbers {

	public static void main(String[] args) {
			int n1=56;
			int n2=32;
			
			
			int smallest=n1<n2?n1:n2;
			System.out.println("All common factors are:");	

		for (int i=1;i<smallest;i++)
		{
			if (n1%i==0 && n2%i==0)
			{				
				System.out.println(i);
			}
			
		}
		
		

	}

}
