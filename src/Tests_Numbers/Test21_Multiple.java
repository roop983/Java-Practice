package Tests_Numbers;

public class Test21_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =15;
		
		for (int i=1; i<=n;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%5==0 || i%10==0) {
					System.out.println("Buzz");
				}

			else if(i%3==0 || i%6==0 || i%9==0 || i%12==0) {
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(i);
			}
			
		}
	}

}
