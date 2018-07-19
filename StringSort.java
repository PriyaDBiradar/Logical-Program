package com.pri;


	public class StringSort {
		public static void main(String[] args) {
			String s = "trdsea";
			int temp = 0;
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] > ch[j]) {
						temp = ch[i];
						ch[i] = ch[j];
						ch[j] = (char) temp;
					}
				}
			}
			System.out.println("sorting order");
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
				// System.out.println(ch[ch.length-1]);
			}
		}
	}


