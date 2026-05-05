package com.Gut;

import java.util.Scanner;

class MyThread extends Thread {

    int n;

    MyThread(int n){
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("\n========== PRIME NUMBERS ==========");
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n===================================");
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Prime_and_palindrome {

    public static void printPalindrome(int n) {
        System.out.println("\n======= PALINDROME NUMBERS ========");

        for (int i = 0; i <= n; i++) {
            int temp = i, rev = 0;

            while (temp != 0) {
                int d = temp % 10;
                rev = rev * 10 + d;
                temp /= 10;
            }

            if (i == rev) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n===================================");
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        System.out.println("===================================");

        MyThread t = new MyThread(n);
        t.start();

        // Wait for prime thread to finish (important clarity)
        t.join();

        printPalindrome(n);

        sc.close();
    }
}
