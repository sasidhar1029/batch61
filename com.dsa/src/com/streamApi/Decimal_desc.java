package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Decimal_desc {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(21.22, 22.42, 33.12, 33.54, 35.33, 95.3, 03.3, 94.24);
		List<Double> d = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(d);
	}

}
