package com.Gut;

import java.util.HashMap;

public class Find_freq_char {

	public static void main(String[] args) {
		String  s ="javaStream";
		
		HashMap<Character,Long> map = new HashMap<>();
		
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0l)+1);
		}
		System.out.println(map);
	}

}
