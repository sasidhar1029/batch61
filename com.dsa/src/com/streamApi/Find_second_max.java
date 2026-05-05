package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_second_max {

	public static void main(String[] args) {
		List<Integer>nums = Arrays.asList(1,2,74,32,32,5,4,24,668,4);
		Optional<Integer> secondmax = nums.stream().distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
		
		System.out.println(secondmax);
	}

}
