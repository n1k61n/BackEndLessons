package org.example;

/*
In this kata you will try to recreate a simple code-breaking game. It is called "Bulls and Cows". The rules are quite simple:
The computer generates a secret number consisting of 4 distinct digits. Then the player, in 8 turns, tries to guess the number.
As a result he receives from the computer the number of matches. If the matching digits are in their right positions, they are "bulls",
if in different positions, they are "cows".

To implement this you will use:
1)a constructor (int) - initiates the game, receives a number and then sets it as the secret number. +

2)and a function "compare with (int)" - compares the given and the secret numbers and then returns a String formated as "X bull/bulls and Y cow/cows".
However, there are some notes:

1)if the given number matches the secret number instead of returning "4 bulls and 0 cows", return "You win!".
Any next attempts to play the game (even with invalid numbers) should return "You already won!"
2)if the amount of turns in this game is more than 8 (invalid turns are not counted) the returned String should be "Sorry, you're out of turns!".
3)After checking the turns you should validate the given number. If it does not correspond to the conditions you should throw an exception :
IllegalArgumentException
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BullsAndCows {
    private int bull;
    private int cow;
    private String secretNumber;
    private static int turns;

    public BullsAndCows(int n) {
        //set the secret number
        this.secretNumber = String.valueOf(n);;
    }

    public String compareWith(int n) {
        if (n < 1000 || n > 9999) {
            throw new IllegalArgumentException();
        }
        String number = String.valueOf(n);
        this.turns++;
        String result = "%s bull and %s cow";
        if (secretNumber.equals(String.valueOf(n)) && turns <= 8) {
            return "You win!";
        }
        if (turns > 8) {
            return "Sorry, you're out of turns!";
        }

        for (int i = 0; i < secretNumber.length(); i++) {
            if (secretNumber.charAt(i) == number.charAt(i)){
                bull++;
            }
            for(int j = 0; j < number.length(); j++){
                if(secretNumber.charAt(i) == number.charAt(j) && i != j){
                    cow++;
                }
            }
        }
        return result.formatted(bull, cow);
    }



}
