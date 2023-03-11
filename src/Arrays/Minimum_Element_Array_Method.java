package Arrays;

//Java Program to demonstrate the way of passing an array  
//to method.  
public class Minimum_Element_Array_Method {

	//creating a method which receives an array as a parameter  
	static void min(int[] arr) {
		
		int min=arr[0];
		
		for (int i=1;i<arr.length;i++) {
			
			if (min > arr[i]) {
				min=arr[i];
			}
			
			
		}
		System.out.println(min);
	}
	
	
	public static void main(String[] args) {
		
		int[] intArr= {1,32,6,70,40,90,2}; //declaring and initializing an array  
		
		min(intArr); //passing array to method  

	}

}
