package Arrays;

public class Second_Largest_Element {

	public static void main(String[] args) {
		int[] A= {5,2,1,7,8};
		
		int t=0;
		
		int n=2;
		
		//Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < A.length; i++) {     
            System.out.print(A[i] + " ");    
        }    
		
		for (int i=0;i<A.length;i++) {
			
			
			for (int j=i+1;j<A.length;j++) {
				
				if (A[i]< A[j]) {
					t=A[i];
					A[i]=A[j];
					A[j]=t;
				}
			}
			
			
		}
		System.out.println();    
        
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in descending order: ");    
		
		for (int i=0;i<A.length;i++) {
			
			System.out.print(A[i]+ " ");
	
		}
		System.out.println();  
		
		System.out.print("2nd Largest Element: "+A[n-1]);
		

	}

}
