package com.pri;

public class RemoveWhites {

		public static void main(String[] args) {
			String s = "priya Biradar d";
			char[] ch = s.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != ' ' && ch[i] != '\t') {
					sb.append(ch[i]);
				}
			}
			System.out.println(sb);
		}
	
}
