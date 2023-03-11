
public class Test_Number {

	public static void main(String[] args) {
		int num=123;
		
		int length = String.valueOf(num).length();
		int c;
		for (int i=length;i>=1;i--)
			
		{
			 c=i;
			 System.out.println(c);
			
		}
		
		System.out.println("************");
		
		
		String s=String.valueOf(num);
		
		for (int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		

	}

}
