package org.example;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
8kyu
Removing Elements
Take an array and remove every second element from the array. Always keep the first element
 and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
 */
public class Kata {

    private static final String[] fruits = {
            "kiwi","pear","kiwi","banana","melon","banana","melon","pineapple","apple","pineapple",
            "cucumber","pineapple","cucumber","orange","grape","orange","grape","apple","grape","cherry",
            "pear","cherry","pear","kiwi","banana","kiwi","apple","melon","banana","melon",
            "pineapple","melon","pineapple","cucumber","orange","apple","orange","grape","orange","grape",
            "cherry","pear","cherry","pear","apple","pear","kiwi","banana","kiwi","banana",
            "melon","pineapple","melon","apple","cucumber","pineapple","cucumber","orange","cucumber","orange",
            "grape","cherry","apple","cherry","pear","cherry","pear","kiwi","pear","kiwi",
            "banana","apple","banana","melon","pineapple","melon","pineapple","cucumber","pineapple","cucumber",
            "apple","grape","orange","grape","cherry","grape","cherry","pear","cherry","apple",
            "kiwi","banana","kiwi","banana","melon","banana","melon","pineapple","apple","pineapple"
    };
    public static String subtractSum (int n) {
        //return fruit name like "apple"
        return "";
    }


    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for(int i = words.length - 1; i >=0 ; i--){
            res.append(words[i]);
        }

        return String.join(" ", res);
    }



    public static boolean isUpperCase(String s) {
        for(char c  : s.toCharArray()){
            if(c >= 'a' && c<= 'z') {
                return false;
            }
        }
        return true;
    }



    public static Object[] removeEveryOther(Object[] arr) {
        int size = arr.length;
        List<Object> res = new ArrayList<>();
        for(int i = 0; i < size; i++){
            if(i % 2 == 1) continue;
            res.add(arr[i]);
        }
        return res.toArray();
    }


    public static int  [] digitize(long n) {
        if(n == 0) return new int[1];
        List<Integer> res = new ArrayList<>();
        while(n > 0){
            res.add((int) (n % 10));
            n /= 10;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
