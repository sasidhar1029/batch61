package com.Gut;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_words_by_first_letter {
	public static void main(String[] args) {
		String[] name = 
			{"Apple","apricot","banana"
					,"Blueberry","cherry","avocado"};
		List<String> A= new ArrayList<>();
		List<String> B= new ArrayList<>();
		List<String> C= new ArrayList<>();
		for(int i=0;i<name.length;i++) {
			if(name[i].toLowerCase().startsWith("a")) {
				A.add(name[i]);
			}
			else if(name[i].toLowerCase().startsWith("b")){
				B.add(name[i]);
			}
			else if(name[i].toLowerCase().startsWith("c")) {
				C.add(name[i]);
			}
		}
		Map<String,List<String>> map = new HashMap<>();
		map.put("A", A);
		map.put("B", B);
		map.put("C", C);
		System.out.println(map);
	}

}
