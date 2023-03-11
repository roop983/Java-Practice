package Arrays;

public class Element_Left_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4};
		
		//int[] B= new int[A.length];
		int n=1,j;
		
		System.out.println("Original array: ");  
        for (int i = 0; i < A.length; i++) {  
            System.out.print(A[i] + " ");  
        }  
        
		//Rotate the given array by n times toward left  
		for (int i=0;i<n;i++) {
			//Stores the first element of the array  
			int t=A[0];
		for ( j=0;j<A.length-1;j++) {
			 
			
			A[j]=A[j+1];
		
			
		}
		 //First element of array will be added to the end  
		A[j]=t;
		
		}
		System.out.println();  
		 System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< A.length; i++){  
	            System.out.print(A[i] + " ");  
	        }  
		
		
		
		
		
    }} 