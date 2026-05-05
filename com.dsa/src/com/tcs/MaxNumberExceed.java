package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberExceed {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxWeight = sc.nextInt();
		
		Arrays.sort(arr);
		int count =0;
		int sum=0;
		for(int i=0;i<n;i++) {
			if(sum+arr[i]<=maxWeight) {
				sum+=arr[i];
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
