package Strings;

public class String_ToString_usage {

	public static void main(String[] args) {
		
		double d=1.2222222;
		String s=Double. toString(d);
		System. out. println(s);
		//OR
		System. out. println(String.valueOf(d));
		
		int a=10;
		String b=Integer.toString(a);
		System. out. println(b);
		
		//OR
		String c =String.valueOf(a);
		System. out. println(c);

	}

}
