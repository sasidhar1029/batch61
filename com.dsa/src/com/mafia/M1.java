package com.mafia;

public class M1 {

	public static int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b= a%b;
			a=temp;
		}
		return a;
	}
	public static int findGcd(int [] arr) {
		int min=arr[0];
		int max = arr[0];
		for(int a:arr) {
			if(a>max) {
				max=a;
			}
			else if(a<min) {
				min=a;
			}
			
		}
		return gcd(min,max);
	}
	public static void main(String[] args) {
		int [] arr = {3,5,6,9,12};
		System.out.println("gcd:"+findGcd(arr));
	}

}
