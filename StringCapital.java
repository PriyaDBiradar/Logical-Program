package com.pri;

import java.util.Scanner;

public class StringCapital {

	
		public static void main(String[] args) {

			System.out.println("enter the string");// how many number you want to
													// enter
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			char[] ch = s.toCharArray();
			String s1 = "";
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					s1 = s1 + (char) (ch[i] - 32);
				}
			}
			System.out.println(s1);

		}
	

}
