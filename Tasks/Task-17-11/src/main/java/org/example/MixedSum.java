package org.example;

import java.util.Arrays;
import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }

    public void test(){
        List<?> lst = Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7);
        System.out.println(sum(lst));
    }
}
