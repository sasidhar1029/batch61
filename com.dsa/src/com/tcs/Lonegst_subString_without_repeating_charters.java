//package com.tcs;
//
//import java.util.HashMap;
//
//public class Lonegst_subString_without_repeating_charters {
//
//	public static void main(String[] args) {
//		String s = "abcabcbb";
//		System.out.println(lengthOfLongestSubstring(s));
//	}
//
//	public static String lengthOfLongestSubstring(String s) {
//		int left = 0;
//		int maxlength = 0;
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (int right = 0; right < s.length(); right++) {
//			char ch = s.charAt(right);
//			if (map.containsKey(ch)) {
//				left = Math.max(left, map.get(ch) + 1);
//			}
//			map.put(ch, right);
//			maxlength = Math.max(maxlength, right - left + 1);
//		}
//		String max= maxlength.valueOf()
//		return maxlength;
//	}
//
//}
