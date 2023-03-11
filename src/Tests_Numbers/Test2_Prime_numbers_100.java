package Tests_Numbers;

public class Test2_Prime_numbers_100 {

	public static void main(String[] args) {
		
		 int n=10;
	     int c;
	   
	     int i, j;
	     System.out.println("Prime numbers are: " );
	     
	     for (i=1;i<=n;i++) {
	    	 c=0;
	    	 
	     for (j=1; j<=i; j++) {
	    
	    	 if (i%j==0) {
	    		 c++;
	    	 }
	     }
	   
	     
	     if (c==2) {
	    	 System.out.println(i );
	     }
	     
	    /* else {
	    	 System.out.println(i +" is not a prime no");
	     }*/
	     
	     }
	     
	     

		

	


	}

}
