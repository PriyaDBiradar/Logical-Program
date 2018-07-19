package com.pri;

import java.util.Scanner;

public class DuplicateString2 {


	

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s = sc.next();

			char[] ch1 = s.toCharArray();
			char[] ch2 = {'a'};
			for (int i = 0; i < ch1.length; i++) {
				boolean flag = true;
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.print(ch1[i]);
				}
			}
		

}}
