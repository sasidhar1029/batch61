package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_The_String_Length {

	public static void main(String[] args) {
		List<String> listofStrings = Arrays.asList("Sasi","Surya","Triven","snakeRaju");
		
		List<String> updateStrings = listofStrings.stream()
				.sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());
		System.out.println(updateStrings);
	}

}
