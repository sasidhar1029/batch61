package com.tcs;
import java.util.Scanner;
public class KShifs {
	public static void Shifs(int start, int end, int[] arr) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int start = 0;
		int end = arr.length - 1;
		Shifs(start, end, arr);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter k value");
		int k=sc.nextInt();
		Shifs(start, k - 1, arr);
		Shifs(k, end, arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
