package Tests_Numbers;

public class Test16_Greatest_Common_Factor {

	public static void main(String[] args) {
		int n1=56;
		int n2=32;
		
		int largest=0;
		int smallest=n1<n2?n1:n2;
	

	//System.out.println("All factors are:");

	for (int i=1;i<=smallest;i++)
	{
		if (n1%i==0 && n2%i==0)
		{				
			largest=i;
		}
		
	}
	
	System.out.println("Greatest Largest factor is: "+largest);

}

}
