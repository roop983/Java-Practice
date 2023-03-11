import java.util.Scanner;

public class Addition_NonStatic_Method {
	
	int z;
	
	 public int add(int x,int y)
	{
		z=x+y;
		return z;
	}
	

	public static void main(String[] args) {
		
		Addition_NonStatic_Method AD =new Addition_NonStatic_Method();
		
        Scanner scan1=new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		
		int a=scan1.nextInt();
		
		System.out.println("Enter the 2nd number");
		
		int b=scan1.nextInt();
	
		int c= AD.add(a,b);
		
		System.out.println(c);

	}
	
	
	

}
