package com.GutTasks;

import java.util.Scanner;

public class Student_Marks_and_Grade_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
            return;
        }

        int[] marks = new int[n];
        int total = 0;

        // Input marks
        System.out.println("Enter marks for " + n + " subjects (0-100):");

        for (int i = 0; i < n; i++) {

            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Marks must be between 0 and 100.");
                return;
            }

            total += marks[i];
        }

        // Calculate percentage
        double percentage = (double) total / n;

        // Grade calculation
        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        // Output
        System.out.println("\n----- Student Report -----");
        System.out.println("Name       : " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);
        System.out.println("Grade      : " + grade);

        sc.close();
    }
}
