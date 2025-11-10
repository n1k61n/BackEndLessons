package org.example;

import java.util.HashSet;
import java.util.List;


public class Robot {
    HashSet<String> words = new HashSet<>(List.of("thank", "you", "for", "teaching", "me"));
    // your code here
    public String learnWord(String word){
        String result = "";
        if(word.matches("[A-Za-z]*") && !word.isEmpty()) {
            if (words.contains(word.toLowerCase())) {
                result = "I already know the word " + word;
            } else {
                words.add(word.toLowerCase());
                result = "Thank you for teaching me " + word;
            }
        }
        else{
            result = "I do not understand the input";
        }

        return result;
    }
}
