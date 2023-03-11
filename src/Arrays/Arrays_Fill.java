package Arrays;
import java.util.*;

public class Arrays_Fill {

	public static void main(String[] args) {
		
		int[] intAr= {1,2,3,4};
		
	//	Arrays.fill(intAr,7); // Assigns value as 7 for all the elements in the Array
		
		Arrays.fill(intAr,0, 3,1); // From Index=0 (Inclusive), To Index=3 (Exclusive) 
		//Fills up value as:1 for the range of elements between these 2 indexes 
		System.out.println("Updated 1st Array is: ");
		for (int i =0;i<intAr.length;i++) {
			
			System.out.print(intAr[i]+ " ");
		}
		
		int[] intAr1= new int[5];
		
		for (int i=5;i>0;i--) {
			
			intAr1[5-i]=i;
			
			
			Arrays.fill(intAr1, 1,4, 8);
			
			
			
		}
		System.out.println();
		System.out.println("Updated 2nd Array is: ");
			for (int i =0;i<intAr1.length;i++) {
			
			System.out.print(intAr1[i]+ " ");
		}
			
			System.out.println();
			
		Object[] num=new Object[100];
		
		Arrays.fill(num, new Object() {
		
		int count=0;
		
		@Override
		public String toString() {
			
			return Integer.toString(count++);
		}
		});
		
		System.out.println(Arrays.toString(num));
			

	}

}
