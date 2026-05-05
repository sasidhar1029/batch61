package com.Gut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum_of_even_numbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		Integer sum = numbers.stream().reduce(0,(a,b)->b%2==0?a+b:a);
		System.out.println(sum);
	}

}
