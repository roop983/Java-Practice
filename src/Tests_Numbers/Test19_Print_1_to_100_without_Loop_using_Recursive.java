package Tests_Numbers;

public class Test19_Print_1_to_100_without_Loop_using_Recursive {
	
	static void printnum(int num) {
		
		if (num<=100) {
			
			System.out.print(num +" ");
			num++;
			printnum(num); // Recursive
		}
		
	}
	
	static void printrangenum(int start_num, int end_num) {
		
		if (start_num<=end_num) {
			
			System.out.print(start_num +" ");
			start_num++;
			printrangenum(start_num,end_num); // Recursive
		}
		
	}
	

	public static void main(String[] args) {
		
		printnum(1);
		System.out.println("*************");
		printrangenum(1,45);

	}

}
