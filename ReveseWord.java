package com.pri;

import java.util.Scanner;

public class ReveseWord {
		public static void main(String[] args) {
			String s2 = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s1 = sc.nextLine();
			String[] ch = s1.split(" ");
			for (int i = 0; i < ch.length; i++) {
				System.out.println("");
			}
		
			for (int j = ch.length - 1; j >= 0; j--) {
				s2 = s2 + ch[j] + " ";
			}
			System.out.print( s2);
		}
	}


