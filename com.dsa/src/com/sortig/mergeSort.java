package com.sortig;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		
		int []arr = {6,5,4,3};
		divide(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void divide(int[] arr) {
		if(arr.length==1) {
			return;
		}
		int[] left =new int[arr.length/2];
		int[] right = new int[arr.length-left.length];
		int i;
		for(i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i++];
		}
		divide(left);
		System.out.println("left side:"+Arrays.toString(left));
		divide(right);
		System.out.println("right side:"+Arrays.toString(right));
		mergeSort(left,right,arr);
	}
	
	public static void mergeSort(int[]left,int[] right,int[] arr){
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j<right.length ) {
			if(left[i]<right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
	}

}
