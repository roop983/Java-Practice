package Tests_Numbers;

public class Test23_Power_Of_Number {
	
	static boolean powerOfTwo(int n){
		
		if (n ==0) {
			return false;
		}
		while (n != 1) {
			if (n%2!= 0) {
				return false;
			}
			else {
			n = n/2;
			}
				
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =8;
		Boolean b = powerOfTwo(number); 
		System.out.println(b);

	}

}
