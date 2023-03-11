
public class PerfectSquare {

	public static void main(String[] args) {
		
		double t;
		
		int num=25;
		
		
		for (int i=1;i<=num;i++) {
			
			t=i*i;
			if ( t == num) {
			System.out.println("Square root of "+num+ " is: "+t/i);
			}
		}

	}

}
