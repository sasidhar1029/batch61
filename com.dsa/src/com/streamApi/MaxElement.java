package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxElement {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 334, 23, 2, 42, 3, 23, 6, 4);
		Integer max = nums.stream().max(Comparator.naturalOrder()).orElse(0);
		System.out.println(max);
	}

}
