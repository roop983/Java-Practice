package Arrays;

public class Integer_Reverse {

	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5}; 
		
		System.out.print("Array in reverse order:");
		
		for (int i=intArr.length-1;i>=0;i--) {
			
			System.out.print(intArr[i]+ " ");
		}

	}

}
