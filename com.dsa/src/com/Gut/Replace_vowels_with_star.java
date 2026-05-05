package com.Gut;

public class Replace_vowels_with_star {
    public static void main(String[] args) {
        String s = "Sasidhar";
        StringBuilder result = new StringBuilder();

        for (char c : s.toLowerCase(). toCharArray()) {
            if ("aeiouAEIOU".contains(String.valueOf(c))) {
                result.append('*');
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
    }
}