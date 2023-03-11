package Tests_Numbers;

public class Test14_Largest_Factor {

	public static void main(String[] args) {
		
		int n=12;
		
		int largest=0;
		System.out.println("All factors are:");

		for (int i=1;i<n;i++)
		{
			if (n%i==0)
			{
				
				largest=largest>i?largest:i;
				System.out.println(largest);
			}
			
		}
		
		System.out.println("Largest factor is: "+largest);

	}

}
