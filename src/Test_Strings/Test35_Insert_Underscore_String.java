package Test_Strings;

public class Test35_Insert_Underscore_String {

	public static void main(String[] args) {
		
		//put _ between a small and capital character in a string
		
		String s="abcAdfFhT";
		
		StringBuilder sb=new StringBuilder();
		
		for (int i=0;i<s.length()-1;i++) {
			
			if (Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i+1))) {
				
				sb.append(s.charAt(i)).append("_");
				//sb.append("_");
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb.append(s.charAt(s.length()-1)).toString());

	}

}
