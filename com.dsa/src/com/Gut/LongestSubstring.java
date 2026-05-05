package com.Gut;
import java.util.HashSet;
public class LongestSubstring {
	public static String longestSubstring(String s) {
		int i = 0, j = 0;
		int start = 0, max = 0;
		HashSet<Character> set = new HashSet<>();
		while (i < s.length()) {

			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				if (i - j + 1 > max) {
					max = i - j + 1;
					start = j;
				}
				i++;
			} else {
				set.remove(s.charAt(j));
				j++;
			}
		}
		return s.substring(start, start + max);
	}
	public static void main(String[] args) {
		String s = "abcabcbccsasaxb";
		System.out.println(longestSubstring(s));
	}
}