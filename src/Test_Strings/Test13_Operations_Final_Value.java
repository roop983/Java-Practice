package Test_Strings;

public class Test13_Operations_Final_Value {

	public static void main(String[] args) {
		
		/*There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

*/
		
		String[] stArr= {"--X","X++","++X"};
		
		int val=0;
//    	for( int i=0;i<stArr.length;i++) 
//    	{
//    		if(stArr[i].charAt(1)=='+') {
//		OR
		
		for( String s: stArr) 
    	{
    		if(s.charAt(1)=='+') {
    			
    			val++;
    		}
    		
    		else 
    		{
    			val--;
    		}
    	}
    
    	
    	System.out.println(val);
    	
    	System.out.println("*****OR*******");
    	
    	String[] stArr1= {"--X","X++","++X"};
    	
    	int sum=0;
    
    	for (String s:stArr1) {
    		
    		//if (s.equals("X++") || s.equals("++X")) 
    		if (s.contains("+")) 
    			sum=sum+1;
    			else
    			sum=sum-1;	
    		
    	}
    	
    	System.out.println(sum);
    	
		
		

	}

}
