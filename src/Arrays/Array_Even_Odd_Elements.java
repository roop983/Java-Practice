package Arrays;

public class Array_Even_Odd_Elements {

	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5}; 
		
		System.out.println("Even Elements present in the Array are: ");  
		for (int i=0;i<intArr.length;i++) {
			
			if (intArr[i]%2==0) {
				
				System.out.print(intArr[i]+ " ");
				
			}
			
			
		}
		System.out.println();
		System.out.println("Odd Elements present in the Array are: ");  
		for (int i=0;i<intArr.length;i++) {
			
			if (intArr[i]%2!=0) {
				
				System.out.print(intArr[i]+ " ");
				
			}
			
			
		}
	}

}
