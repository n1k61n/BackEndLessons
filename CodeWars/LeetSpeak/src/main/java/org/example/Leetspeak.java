package org.example;


import java.util.HashMap;
import java.util.Map;

public class Leetspeak extends Encoder {

    private final Map<Character, String> dictionary = new HashMap<>();

    public Leetspeak() {
        dictionary.put('a', "4");
        dictionary.put('e', "3");
        dictionary.put('l', "1");
        dictionary.put('m', "/^^\\");
        dictionary.put('o', "0");
        dictionary.put('u', "(_)");
    }

    @Override
    public String encode(String input) {
        if (input == null) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();

        for (char ch : input.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            if (dictionary.containsKey(lower)) {
                encoded.append(dictionary.get(lower));
            } else {
                encoded.append(ch);
            }
        }

        return encoded.toString();
    }
}
abstract class Encoder{
    public abstract String encode(String source);
}