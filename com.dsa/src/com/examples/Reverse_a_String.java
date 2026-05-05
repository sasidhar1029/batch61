package com.examples;

public class Reverse_a_String {

	public static void main(String[] args) {
		String s = "sasidhar";
		char[] arr = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		StringBuilder rev = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			rev.append(arr[i]);//for better time complexity StringBuilder not suppoted += its have 
			//append method StringBuilder is better than String when are adding it will created everytime
			//new object inString but in StringBilder it will append
		}
		System.out.println(rev);
	}

}
