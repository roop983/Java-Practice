package Test_Strings;

//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
public class Test46_Lexicographic_Strings_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="welcometojava";
		
		int k =3;
		
		String smallest = s.substring(0,k);
		
		String largest = s.substring(0,k);
		
		int j = k;
		
		String temp1 = "";
		
		for(int i =1;i<=(s.length()-k);i++) {
			
			 temp1 = s.substring(i, j+1);
			if (smallest.compareTo(temp1) < 0) {
				smallest = smallest;
				
			}
			else {
				smallest = temp1;
				
			}
			
			if (largest.compareTo(temp1) > 0) {
				largest = largest;
				
			}
			else {
				largest = temp1;
				
			}
			j++;
		}
		
		
		System.out.println(smallest);
		System.out.println(largest);
		
		String st = "He is a very very good boy, isn't he?";
		String[] specialChars = {"!", ",", ".", "_", "'", "@"};
		
		for (String st1 : specialChars) {
			if (st.indexOf(st1) != -1) {
				st = st.replaceAll(st1, " ");
			}
		}
		
		//String[] stAr = st.replace("'", " ").replace(",", "").replace("?", "").split("\\s");
		
		String[] stAr = st.replace("?","").split("\\s+");
		System.out.println(stAr.length);
		
		for(String st2: stAr){
            System.out.println(st2);
       }
				

	}

}
