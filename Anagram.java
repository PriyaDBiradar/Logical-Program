package com.pri;

public class Anagram {

	
	public static void main(String[] args) {
			String s1 = "sun";
			String s2 = "uns";
			String s3="";
			if (s1.length() == s2.length()) {
				for (int i = 0; i < s1.length(); i++) {
					for (int j = 0; j < s2.length(); j++) {
	                  if(s1.charAt(i)==s2.charAt(j)){
	                	 s3=s3+s1.charAt(i); 
	                  }
					}
				}
			}
			if(s1.equals(s3)){
				System.out.println(s3+" "+ "is a anagram");
			}
			else{
				System.out.println("not a anagram");
			}
		}

}
