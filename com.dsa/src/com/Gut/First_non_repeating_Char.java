package com.Gut;

import java.util.Scanner;

public class First_non_repeating_Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		
		for(int i=0;i<s.length()-1;i++) {
			int count =1;
			char ch =s.charAt(i);
			for(int j=i+1;j<s.length()-1;j++) {
				char ch2 = s.charAt(j);
				if(ch==ch2) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch);
				break;
			}
		}
		
	}

}
