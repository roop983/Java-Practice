
public class PerfectNumbers_100 {

	public static void main(String[] args) {
	
        int t;
		
		int sum=0;
		
		
	for (int j=1;j<=1000;j++) {
		
		for (int i=1;i<j;i++) {
			
		  t=j%i;
		  
		  if (t==0)
			  sum=sum+i;		  
		} 
		if (sum == j)
		
		 System.out.println(j);
		
		sum =0;
	}
	


	}

}
