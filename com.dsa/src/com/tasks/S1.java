package com.tasks;

public class S1 {

	public static void main(String[] args) {
		String s = "education";
		String vowels ="";
		char Result =' ';
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels =c+vowels;
			}
		}
		int z=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				Result =vowels.charAt(z);
				z++;
			}else {
				Result +=c;
			}
		}
	
		System.out.println(vowels);
		System.out.println(Result);
		
		
	}

}
