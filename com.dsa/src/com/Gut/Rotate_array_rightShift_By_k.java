package com.Gut;

public class Rotate_array_rightShift_By_k {

	public static void RotateRightBy_k(int k) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;

		for (int i = 1; i <= k; i++) {
			int temp = arr[n - 1];
			for(int l = n - 1; l > 0; l--) {
				arr[l] = arr[l - 1];
			}
			arr[0] = temp;

		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		RotateRightBy_k(2);
	}

}
