package Test_Strings;

public class Test29_Check_Summation_Two_Words {

	public static void main(String[] args) {
		
		
		/*The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
Output: true
Explanation:
The numerical value of firstWord is "acb" -> "021" -> 21.
The numerical value of secondWord is "cba" -> "210" -> 210.
The numerical value of targetWord is "cdb" -> "231" -> 231.
We return true because 21 + 210 == 231.*/
		
		String word1="acb";
		
		String word2="cba";
		
		String target_word="cdb";
		
		StringBuilder sb1=new StringBuilder();
		
		for (int i=0;i<word1.length();i++) {
			
			sb1.append(word1.charAt(i) -'a');
		}
		
		//System.out.println(sb1.toString());
		
		int sum1=Integer.parseInt(sb1.toString());
		
	//	sb1.setLength(0); //clear or empty a string builder
		sb1=new StringBuilder();
		
		System.out.println(sum1);
		
			for (int i=0;i<word2.length();i++) {
			
			sb1.append(word2.charAt(i) -'a');
		}
		
		int sum2=Integer.parseInt(sb1.toString());
		
		System.out.println(sum2);
		
		//sb1.setLength(0); //clear or empty a string builder
		sb1=new StringBuilder();

		for (int i=0;i<target_word.length();i++) {
		
		sb1.append(target_word.charAt(i) -'a');
	}
	
		int target_sum=Integer.parseInt(sb1.toString());
	
		System.out.println(target_sum);
		
		
		Boolean result=((sum1+sum2)==target_sum)?true:false;
		
		//Boolean b1=(count==26)?true:false;  
		
		System.out.println(result);
		
		

	}

}
