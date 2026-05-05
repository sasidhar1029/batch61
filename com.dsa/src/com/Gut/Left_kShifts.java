package com.Gut;

public class Left_kShifts {

	public static void swap(int start, int end, int[] arr) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = arr.length - 1;
		swap(start, end, arr);
		int k = 1;
		swap(start,k-1,arr);
		swap(k, end, arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
