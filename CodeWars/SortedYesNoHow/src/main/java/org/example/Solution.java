package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static String isSortedAndHow(int[] array) {
        boolean asc = false;
        boolean des = false;
        for(int i = 0; i < array.length-1; i++) {
            if (array[i] <= array[i + 1]) {
                asc = true;
            } else {
                asc = false;
                break;
            }
        }
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] >= array[i+1]){
                des = true;
            }
            else{
                des = false;
                break;
            }
        }
        if(asc){
            return "yes, ascending";
        }
        if(des){
            return "yes, descending";
        }

        return "no";
    }

}


