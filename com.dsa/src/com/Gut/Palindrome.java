package com.Gut;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
