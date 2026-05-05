package com.pattern;

public class P12 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {
			int inis=0;
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<inis;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			inis+=2;
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<2*n-(2*i+2);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
