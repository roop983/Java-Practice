
public class Boxing_UnBoxing_AutoBoxing {

	public static void main(String[] args) {
		
		//Boxing means converting primitives into objects
		
		int i=10;
		
		Integer iref=new Integer(i); // Boxed Constructing an object
		
		int j=iref.intValue(); //UnBoxing (Extracting the value from the object)
		
		System.out.println(j);
		
		Integer kref=i; //AutoBoxing : This line is auto-translated internally by the compiler as : Integer kref=new Integer(i)
		
		System.out.println(kref);
		
		int k=kref; //Auto Unboxing
		
	}

}
