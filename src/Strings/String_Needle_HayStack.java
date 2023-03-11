package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class String_Needle_HayStack {


		public static void main(String[] args) {
	        final String word = "abc";
	        final String text = "abcxaaabbbccyaxbcayxycab";
	        List<Character> charsActuallyFound = new ArrayList<Character>();
	        StringBuilder match = new StringBuilder();

	        for (char c : text.toCharArray()) {
	            if (word.contains(String.valueOf(c)) && !charsActuallyFound.contains(c)) {
	                charsActuallyFound.add(c);
	                match.append(c);
	                if (match.length()==word.length())
	                {
	                    System.out.println(match);
	                    match = new StringBuilder();
	                    charsActuallyFound.clear();
	                }
	            } else {
	                match = new StringBuilder();
	                charsActuallyFound.clear();
	            }
	        }
	    }
	}

