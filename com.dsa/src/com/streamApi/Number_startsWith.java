package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number_startsWith {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 33, 22, 13, 31, null);
		List<Integer> nums = list.stream().filter(i -> String.valueOf(i).endsWith("1")).collect(Collectors.toList());
		System.out.println(nums);
	}

}
