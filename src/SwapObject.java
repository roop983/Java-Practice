import java.util.Scanner;

public class SwapObject {
	
	int a,b;

	public static void main(String[] args) {
		
		//creating object of the class  
		SwapObject sn=new SwapObject();
		Scanner sc = new Scanner(System.in);               
		System.out.print("Enter the first number: ");  
		sn.a=sc.nextInt();
		
		System.out.print("Enter the first number: ");  
		sn.b=sc.nextInt();
		
		//prints result before swapping  
		System.out.println("Before swapping: a= " + sn.a + ", b= " + sn.b);  
		//function calling  
		sn.swapNum(sn);  
		
		
			

	}

	private void swapNum(SwapObject stn) {

			int temp;
			temp=stn.a;
			stn.a=stn.b;
			stn.b=temp;
			
			//prints result after swapping  
			System.out.println("After swapping: a= " + stn.a + ", b= " + stn.b);  
		
	}

}
