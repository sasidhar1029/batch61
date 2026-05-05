package com.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 3, 2, 5, 4, 6, 3, 5, 6);
		HashSet<Integer> set = new HashSet<>();


		List<Integer> uNums = numbers.stream().filter(set::add).collect(Collectors.toList());
		System.out.println(uNums);
	}

}
