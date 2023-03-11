 package Arrays;

public class Return_Array_from_Method {

	static int[] get() {
		
		int[] intA= {10,34,566};
		
		return intA;
		// Another way
		//return new int[] {10,20,40,534} ;
		
		
	}
	public static void main(String[] args) {
		
		int[] intArr=get();
		
		for (int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]);
		}

	}

}
