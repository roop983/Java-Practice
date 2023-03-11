package Tests_Numbers;

public class Test7_Pallindrom_number {

	public static void main(String[] args) {
		
		//https://leetcode.com/problems/palindrome-number/
		/*Example 2:

			Input: x = -121
			Output: false
			Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.*/
		
		int orig_num=121;
		
		String s=String.valueOf(orig_num);
		
		//System.out.println(s);
		
		int rev=0;
		
		int lastDigit;
		
		int num=orig_num;
		
		if (s.contains("-1")) {
			
			System.out.println("Number is not pallindrome");
		}
		else
		{
		
			while (num!=0) {
			
			lastDigit=num%10;
			rev=(rev*10)+lastDigit;
			num=num/10;
			}
		
			if (orig_num==rev) {
				System.out.println("Number:"+orig_num+ " is Pallindrome");
			}
			else {
			
			System.out.println("Number:"+orig_num+ " is not Pallindrome");
			}
		}
			

	}

}
