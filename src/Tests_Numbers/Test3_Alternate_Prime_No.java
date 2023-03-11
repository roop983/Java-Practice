package Tests_Numbers;

public class Test3_Alternate_Prime_No {

	public static void main(String[] args) {
		 int n=50;
	     int c;
	     
	     int skip_count=0;
	   
	     int i, j;
	     System.out.println("Alternate Prime numbers are: " );
	     
	     for (i=1;i<=n;i++) {
	    	 c=0;
	    	 
	     for (j=1; j<=i; j++) {
	    
	    	 if (i%j==0) {
	    		 c++;
	    	 }
	     }
	   

	     if (c==2) {
	    	
	    	 skip_count++;
	    	 
	    	 if (skip_count==1)
	    	 System.out.println(i );
	    	 
	    	 else
	    		 skip_count=0; 
	    	
	     }
	     
	    /* else {
	    	 System.out.println(i +" is not a prime no");
	     }*/
	     
	     }
	     
	     

		

	


	}

}