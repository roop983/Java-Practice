package Test_Strings;


public class Test21_Decrypt_String  {

	public static void main(String[] args) {
		
		String s="1326#";
		
		char c=s.charAt(0);
		
		// System.out.println(String.valueOf(c));
		
		//int j=c-1;
		
		System.out.println((char)97);
		
		StringBuilder sb = new StringBuilder();
        int size = s.length();
        for(int i=0; i< size;i++){
            if(i+2 < size && s.charAt(i+2) == '#'){
                sb.append((char) ((Integer.parseInt(s.substring(i, i+2)) - 1)+ 'a') );
             
                i=i+2;
            }
           
            else sb.append( (char) ( (Integer.parseInt(String.valueOf(s.charAt(i))) - 1) + 'a') );
           
        }
        
        System.out.println(sb.toString());

	}

}
