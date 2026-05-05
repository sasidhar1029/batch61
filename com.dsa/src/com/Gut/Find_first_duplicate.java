package com.Gut;
//Day-5
public class Find_first_duplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 2, 4, 3 };
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(arr[i] + " ");
				break;

			}
		}
	}

}
