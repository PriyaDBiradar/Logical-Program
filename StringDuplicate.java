package com.pri;


	import java.util.Scanner;

	public class StringDuplicate {
		public static void main(String[] args) {
			String s = "priiyya";
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == (s.charAt(j))) {
						 count++;
						System.out.println(s.charAt(i));

						break;

					}

				}
			}
			System.out.print(count);

		}
	
}
