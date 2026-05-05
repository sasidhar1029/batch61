package com.Gut;

import java.util.Scanner;

public class Reverse_An_array {

	public static void reverse(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		reverse(arr);

		System.out.println("Reversed array:");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		sc.close();
	}
}
