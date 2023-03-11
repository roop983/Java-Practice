import java.util.Scanner;

public class ASCII_Program {

	public static void main(String[] args) {
		

		char ch1='A';
		char ch2='c';
		char ch3_1='a';
		System.out.println((int)ch3_1);
		
		int ascii_value1=(int )ch1; ///casting or converting a charter into int type  
		
		int ascii_value2=ch2;
		
	    int ascii_value3='C';
		
		int ascii_value4='d';
		
		char c= (char)106;
		
		char ch3=1;
		int d=(int)ch3 + 'a';
		
		System.out.println(ascii_value1);
		System.out.println(ascii_value2);
		
		System.out.println(ascii_value3);
		System.out.println(ascii_value4);
		
		System.out.println(c);
		
		System.out.println(d);
	
		
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		
		char ch=sc.next().charAt(0);
		
		int input=ch;
		
		System.out.print("Ascii value for "+ch+" is: "+ input);  

	}

}
