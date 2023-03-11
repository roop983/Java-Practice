package Arrays;

public class Element_right_rotation {

	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		
		
	       //n determine the number of times an array should be rotated.   
		int n=2,j;
		
		 //Displays original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < A.length; i++) {     
            System.out.print(A[i] + " ");     
        }   
        
        
        
      //Rotate the given array by n times toward right    
		for (int i=1;i<=n;i++) {
			
			int last = A[A.length-1];
			
			for (j=A.length-1;j>0;j--) {
				
				A[j]=A[j-1];
			}
			
			A[j]=last;
		}
		
		
		System.out.println();    
		 //Displays resulting array after rotation    
		System.out.println("Array after right rotation: ");    
		for (int i=0;i<A.length;i++) {
			
			System.out.print(A[i]+ " ");
		}

	}

}

