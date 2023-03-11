package Tests_Numbers;

public class Test1_Prime_number {

	public static void main(String[] args) {
		
     int n=4;
     
     int c=0;
     
     for (int i =1; i<=n; i++) {
    	 
    	 if (n%i==0) {
    		 c++;
    	 }
     }
     
     if (c==2) {
    	 System.out.println(n +" is a prime no");
     }
     
     else {
    	 System.out.println(n +" is not a prime no");
     }

	}

}
