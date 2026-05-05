package com.examples;

public class SortThe_String {

	public static void main(String[] args) {
		String s = "sasidhar";
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (char c : arr) {
			System.out.print(c + "");
		}
	}

}
