package com.pri;

import java.util.Scanner;

public class ReverseString {



		public static void main(String[] args) {

			System.out.println("enter the string");// how many number you want to
													// enter
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			String s1 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s1 = s1 + s.charAt(i);
			}
			System.out.println(s1);
		}
	}



