package Strings;

public class String_ValueOf {

	public static void main(String[] args) {
		
		// Java String valueOf() method
				int i =10;
				String St=String.valueOf(i); //valueOf() method returns the String representation of the boolean, char, char array, int, long, float and double arguments.
				System.out.println("String Value Of Example1: "+St+30);
				System.out.println("String Value Of Example2: "+20+50+St+30);
				System.out.println(20+50+St+30);
				
				char[] ch= {'a', 'b', 'c', 'd'};
				float f = 10.10f; //float value
				long l = 111L; //long value
				double d = 2222.22; //double value
				char ch1 = 'A'; //char value
				boolean bool=true;
				
				String st1=String.valueOf(ch);
				
				String st2=String.valueOf(f);
				
				String st3=String.valueOf(l);
				
				String st4=String.valueOf(d);
				
				String st5=String.valueOf(ch1);
				
				String st6=String.valueOf(bool);
				
				System.out.println(st1);
				System.out.println(st2);
				System.out.println(st3);
				System.out.println(st4);
				System.out.println(st5);
				System.out.println(st6);
				
				//Printing only even indexes of character array
				String t="";
				for (int k=0;k<ch.length;k=k+2) {
					
					t=t+String.valueOf(ch[k]);
				}
				System.out.println(t);
			

				
	}

}
