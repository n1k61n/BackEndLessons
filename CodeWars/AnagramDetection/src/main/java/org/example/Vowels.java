package org.example;

public class Vowels {

    public static int getCount(String str) {
        int count = 0;
        for(char c : str.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'u' || c== 'i' || c=='o') count++;
        }
        return count;
    }
}
