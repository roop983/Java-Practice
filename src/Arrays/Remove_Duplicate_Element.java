package Arrays;

import java.util.Arrays;

public class Remove_Duplicate_Element {

	public static void main(String[] args) {
		int[] A= {1,2,3,2,1,3,3 };
		
		Arrays.sort(A); //sorting array  
		
		//int[] temp=new int[A.length];
		
		int j=0;
		
		for (int i=0;i<A.length-1;i++) {
			
			
			if (A[i]!=A[i+1]) {
				//temp[j]=A[i];
				A[j]=A[i];
				j++;
				
			}
		}
		
		//temp[j]=A[A.length-1];
		A[j]=A[A.length-1];
		
	
		// Printing part of original array  
		for (int i=0;i<=j;i++) {
			
			
			//A[i] = temp[i];  
			System.out.print(A[i]+ " ");
			
		
		
			
		}
		
		/*Printing  the temp Array
		
		for (int i=0;i<=j;i++) {
			
			System.out.println(temp[i]);
		}*/

	}

}
