package org.example;

import java.util.Arrays;
import java.util.HashMap;


public class Kata {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> aset = new HashMap<>();
        HashMap<Character, Integer> bset = new HashMap<>();

        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i  =0; i < a.length(); i++){
            char ac = a.charAt(i);
            char bc = b.charAt(i);

            aset.put(ac, aset.getOrDefault(ac, 0) + 1);
            bset.put(bc, bset.getOrDefault(bc, 0) + 1);
        }
        return aset.equals(bset);
    }
}