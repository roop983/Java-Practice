package Arrays;

public class Print_Even_Position_Elements {

	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5}; 
		
		System.out.println("Elements of given array present on even position: ");  
		for (int i=1;i<intArr.length;i=i+2) {
			
			System.out.print(intArr[i]+ " ");
			
		}
		System.out.println();
		System.out.println("Elements of given array present on odd position: ");  
		for (int i=0;i<intArr.length;i=i+2) {
	
			
			System.out.print(intArr[i]+ " ");
			
		}
	}

}
