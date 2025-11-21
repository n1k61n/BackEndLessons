package org.example;

import java.util.*;

public class Kata {


    public static int[] mergeArrays(int[] first, int[] second) {
        TreeSet<Integer> merged = new TreeSet<>();
        for (int i : first) merged.add(i);
        for(int i : second) merged.add(i);
        return merged.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static String findNeedle(Object[] haystack) {
        int pos = 0;
        for(int i = 0; i < haystack.length; i++){
            if("needle".equals(haystack[i])) {
                pos = i;
            }
        }
        return "found the needle at position " + pos;
    }
}
