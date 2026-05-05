package com.Gut;

public class Check_String_contain_vowels {

	public static void main(String[] args) {
		String s = "Sasidhar";
		boolean status = false;
		String n = "aeiou";
		for (char c : s.toLowerCase().toCharArray()) {
			if (n.contains(String.valueOf(c))) {
				status = true;
				break;
			}
		}
		System.out.println(status);
	}

}
