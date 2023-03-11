package Arrays;

public class Largest_Element_Array_Method {


		//creating a method which receives an array as a parameter  
		public static void max(int[] arr) {
			
			int max=arr[0];
			
			for (int i=1;i<arr.length;i++) {
				
				if (max < arr[i]) {
					max=arr[i];
				}
				
				
			}
			System.out.println(max);
			
		}
		
		
	public static void main(String[] args) {
        int[] intArr= {1,32,6,70,40,90,2}; //declaring and initializing an array  
		
		max(intArr); //passing array to method  

	}

}
