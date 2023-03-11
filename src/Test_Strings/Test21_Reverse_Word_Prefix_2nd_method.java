package Test_Strings;

public class Test21_Reverse_Word_Prefix_2nd_method {

	public static void main(String[] args) {
		
		String word="abcdefg";
		
		char ch='d';
		
		int i=word.indexOf(ch);
		
		System.out.println(i);
		
		if (i!=-1) {
		
		String word_part1=word.substring(0, word.indexOf(ch)+1);
		String rev=new StringBuilder(word_part1).reverse().toString().concat(word.substring(i+1));
		System.out.println(rev);
		}
		else
		
		System.out.println(word);

	}

}
