package com.Gut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group_Anagrams {

    public static void main(String[] args) {

        String[] names = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> l1= new ArrayList<>();
        

        boolean[] boo = new boolean[names.length];

        for (int i = 0; i < names.length; i++) {

            if (!boo[i]) {

                List<String> A = new ArrayList<>();

                char[] ch = names[i].toCharArray();
                Arrays.sort(ch);

                for (int j = 0; j < names.length; j++) {

                    if (!boo[j]) {
                        char[] ch1 = names[j].toCharArray();
                        Arrays.sort(ch1);

                        if (Arrays.equals(ch, ch1)) {
                            A.add(names[j]);   
                            boo[j] = true;
                        }
                    }
                }
                l1.add(A);

            }
        }
        System.out.println(l1);
        
    }
}