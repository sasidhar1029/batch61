package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_secondMin {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,123,323,68,67,967,556,324);
		Optional<Integer> secondMin =nums.stream().distinct().sorted().skip(2).findFirst();
		System.out.println(secondMin);
	}

}
