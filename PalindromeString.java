package com.pri;
import java.util.Scanner;
public class PalindromeString {




	
		public static void main(String[] args) {
			String s = "malayalam";
			String s1 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s1 = s1 + s.charAt(i);
			}
			if (s1.equals(s)) {
				System.out.println(s1+" "+"is a palindrome");
			} else {
				System.out.println("not a palindrome");
			}
		}
	
}
