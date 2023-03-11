package Arrays;

public class Middle_Element_Integer {

	public static void main(String[] args) {
		int[] intArr= {1,20,3,45,54,60,7}; 
		
		int len1 = intArr.length;
		
		int pos = ((len1+1)/2)-1;
		
		
		System.out.println(intArr[pos]);
		
		int middle_element;
		
		//Finding the middle element from a reversed Array
		
		if ((intArr.length)%2 == 0) {
			
			System.out.println("Middle element cannot be computed as its a even elements array");
			
		}
		
		else
		{
	
		
			/*for (int i=intArr.length-1;i>=0;i--)
			{
			
			System.out.println(intArr[i]);
			}*/
		
		middle_element=intArr[(intArr.length-1)/2];
		
		
		
		System.out.println("******************");
		System.out.println("Middle Element in the odd Array is: "+middle_element);
		
		}
		System.out.println("******************");
		System.out.println("******************");
		
		int[] intArr1= {1,20,3,45,54,60}; 
		
		int middle_element1, middle_element2;
		
		float median;
		
		int len=intArr1.length;
		
		middle_element1=intArr1[len/2];
		
		middle_element2=intArr1[(len/2)-1];
		
		median= (middle_element1+middle_element2)/2;
		
		
		System.out.println("Median of the 2 middle elements in the even Array is: "+median);

	}

}
