package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_palindrome_Strings {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("sasi", "madam", "mom", "sun");
		List<String> palindrome = words.stream().filter(s -> {
			return s.toLowerCase().contentEquals(new StringBuilder(s.toLowerCase()).reverse());
		}).collect(Collectors.toList());
		System.out.println(palindrome);

	}

}
