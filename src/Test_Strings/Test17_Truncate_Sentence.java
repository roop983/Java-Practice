package Test_Strings;

public class Test17_Truncate_Sentence {

	public static void main(String[] args) {
		
		String test="Hello how are you Contestant";
		
		int k=3;
		
		//String result="";
		
		StringBuilder sb =new StringBuilder();
		
		String[] array=test.split("\\s");
		
		for (int i=0;i<k;i++) {
			
			//result=result+array[i]+" ";
			sb.append(array[i]).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
