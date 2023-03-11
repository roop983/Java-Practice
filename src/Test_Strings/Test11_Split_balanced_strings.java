package Test_Strings;

public class Test11_Split_balanced_strings {

	public static void main(String[] args) {
		
		String st="LRRLRRLL";
		
		String st1="";
		
	       int count = 0;
	        int res = 0;
	        
	        char c=st.charAt(0);
	        
	        System.out.println("Balanced strings are: ");
	        
	        for(int i = 0; i < st.length(); i++){
	            if(st.charAt(i) == c) 
	                res++;
	            else res--;
	            
	            st1=st1.concat(st.substring(i, i+1));
	            
	            if(res == 0) {
	                count++;
	            System.out.println(st1);
	            st1="";
	            }
	         
	        }   
	        

	        System.out.println("Count of these Balanced strings: "+count);

	}

}
