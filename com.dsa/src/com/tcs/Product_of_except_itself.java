package com.tcs;

public class Product_of_except_itself {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			int prod = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					prod *= arr[j];
				}
			}
			System.out.print(prod + " ");
		}
		
	}

}
