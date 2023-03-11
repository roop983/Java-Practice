package Arrays;

public class Sum_and_Avg_of_Elements {

	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5,7}; 
		int sum=0;
		
		
		for (int i=0;i<intArr.length;i++) {
		sum=sum+intArr[i];

	}
		
		System.out.println("Sum of Elements of given array : "+sum); 
		
		Double d=Double.valueOf(sum);

		System.out.println("Average of Elements of given array : "+d/(intArr.length)); 
		
		System.out.println((double)sum/intArr.length);

}
}
