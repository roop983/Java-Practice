
public class PrimeNumbers_Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int countskip=0;
		
		 int j;
		 
		 for (j=1;j<=100; j++)	  
		 {
		   for ( int i=1; i<=j;i++)
		    {
			 
				if (j%i==0) count++;
				
		    }
		   if (count==2)
			   
		   {
				 
			   countskip++;
			 
			 if (countskip==1) 
			 {
				 System.out.println(j);
			 }
				 else {
					 countskip=0; 
				 }
			 
		 
		   } 
		   count=0;
		   
		 
	}
		
	}
	
}


