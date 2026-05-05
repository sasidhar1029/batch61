package com.tcs;

import java.util.*;

public class ValidParanthsis {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        // Step 1: Create map (closing → opening)
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // Step 2: Traverse string
        for (char c : s.toCharArray()) {

            // If opening bracket → push
            if (!map.containsKey(c)) {
                stack.push(c);
            } 
            // If closing bracket
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                // Check mismatch
                if (top != map.get(c)) {
                    return false;
                }
            }
        }

        // Step 3: Final check
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}