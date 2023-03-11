package Test_Strings;

public class Test43_Count_words_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stAr = {"pay","attention","practice","attend"};
		
		String pref = "at";
		int count =0;
		
		for(String s: stAr) {
			
			if(s.indexOf(pref) == 0) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
