package com.Gut;

import java.util.ArrayList;
import java.util.List;

public class Top_kfrquent_words {

	public static void main(String[] args) {
		String[] names = { "Apple", "banana", "apple", "Banana", "apple", "mango", "Mango", "mango" };
		List<String> list = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			int k=0;
			
			for (int j = i ; j < names.length; j++) {
				if (names[i].toLowerCase().equals(names[j].toLowerCase())) {
					k++;
				}
			}
			if(k==2) {
				list.add(names[i]);
			}
		}
		System.out.println(list);
	}

}
