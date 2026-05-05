package com.Gut;

import java.util.HashSet;

public class Find_All_pairs {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int target = 7;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}

			}
			

		}
	}

}
