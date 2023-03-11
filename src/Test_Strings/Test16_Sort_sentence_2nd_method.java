package Test_Strings;

public class Test16_Sort_sentence_2nd_method {

	public static void main(String[] args) {
		
		String test="is2 sentence4 This1 a3";
		
		String[] stAr=test.split(" ");
		
		String[] stAr_sorted=new String[stAr.length];
		
		StringBuilder sb=new StringBuilder();
		
		for (String s:stAr) {
			
			String st=s.substring(s.length()-1);
			int t=Integer.parseInt(st);
			System.out.println(t);
			stAr_sorted[t-1]=s.substring(0,s.length()-1);
			
		}
		
		for (String s:stAr_sorted) {
			sb.append(s).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
