package Strings;

import java.util.Arrays;

public class Swap_Strings {

	public static void main(String[] args) {
		
		String a ="Love";
		String b = "You";
		a=a+b; //LoveYou
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(b);
		System.out.println(a);
		}

	}


