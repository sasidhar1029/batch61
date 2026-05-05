package com.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GetDuplicates {

	public static void main(String[] args) {
		List<Integer> duplicatesElements = Arrays.asList(1, 2, 2, 3, 4, 3, 4, 5, 6, 7);
		HashSet<Integer> set = new HashSet<>();

		List<Integer> list = duplicatesElements.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(list);
	}

}
