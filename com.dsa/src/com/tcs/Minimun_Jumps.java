package com.tcs;

import java.util.Arrays;

public class Minimun_Jumps {

	public static void main(String[] args) {
		int[] arr1 = { 3, 1, 1 };
		int[] arr2 = { 6, 5, 4 };
		for (int i = 0; i < arr1.length; i++) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int j = 0; j < arr2.length; j++) {
				int temp = arr2[j];
				arr2[j] = arr2[arr2.length - 1];
				arr2[arr2.length - 1] = temp;
				int sum =arr1[i]+arr2[j];
				
			}
		}
		for (int a : arr1) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a : arr2) {
			System.out.print(a + " ");
		}
	}

}
