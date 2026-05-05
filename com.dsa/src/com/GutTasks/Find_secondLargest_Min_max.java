package com.GutTasks;

public class Find_secondLargest_Min_max {
//Time Complexity -> O(N)
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5 };
		int max = arr[0];
		int min = arr[0];
		int secondLargest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondLargest = max;
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != max) {
				secondLargest = arr[i];
			}
		}

		System.out.println("Max Element : " + max);
		System.out.println("Min Element : " + min);
		System.out.println("SecondLargest Element : " + secondLargest);
	}

}
