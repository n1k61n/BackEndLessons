package org.example;

public class Kata {
    public static String multiTable(int num) {
        String[] result = new String[10];
        for(int i = 0; i < 10; i++){
            result[i] = String.format("%s * %s = %s", i + 1, num, (i + 1) * num);
        }
        return String.join("\n",result);
    }
}
