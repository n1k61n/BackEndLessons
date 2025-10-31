package org.example.kata;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * John has invited some friends. His list is:
 *
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 * Could you make a program that
 *
 * makes this string uppercase
 * gives it sorted in alphabetical order by last name.
 * When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.
 *
 * So the result of function meeting(s) will be:
 *
 * "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
 * It can happen that in two distinct families with the same family name two people have the same first name too.
 *
 * Notes
 * You can see another examples in the "Sample tests".
 */

public class Meeting {

    public static String meeting(String s) {
        return Arrays.stream(s.split(";"))
                .map(str -> str.split(":"))
                .sorted((a, b) -> {
                    int cmp = a[1].compareToIgnoreCase(b[1]); // Compare last names
                    return (cmp != 0) ? cmp : a[0].compareToIgnoreCase(b[0]); // Then first names
                })
                .map(name -> "(" + name[1].toUpperCase() + ", " + name[0].toUpperCase() + ")")
                .collect(Collectors.joining(""));

    }
}
