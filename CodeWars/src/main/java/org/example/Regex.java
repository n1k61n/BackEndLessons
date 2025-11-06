package org.example;

public class Regex {
/*
Given a string, determine if it's a valid identifier.

Here is the syntax for valid identifiers:
Each identifier must have at least one character.
The first character must be picked from: alpha, underscore, or dollar sign. The first character cannot be a digit.
The rest of the characters (besides the first) can be from: alpha, digit, underscore, or dollar sign. In other words, it can be any valid identifier character.
Examples of valid identifiers:
i
wo_rd
b2h
Examples of invalid identifiers:
1i
wo rd
!b2h
 */

    public static boolean isValid(String idn) {
        return idn.matches("^[A-Za-z0-9_\\$]");
    }


    public static boolean validateEuro(String serialNumber) {
        int sum = 0;
        sum += serialNumber.charAt(0) - 'A';
        sum += serialNumber.charAt(1) - 'A';
        sum += 2;
        for(int i = 2; i < serialNumber.length(); i++){
            sum += serialNumber.charAt(i) - '0';
        }
        while(sum > 9){
            int d = 0;
            while(sum > 0){
                d += sum % 10;
                sum /= 10;
            }
            sum = d;
        }
        return sum == 7;
    }

    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }

    public static boolean validateUsr(String s) {
        return s.matches("[0-9a-z_]{4,16}");
    }

    public static boolean isLockNessMonster(String s){
        return s.matches("tree fiddy|3.50|three fifty");
    }

    public final static boolean isDigit(String s) {
        return s.matches("[0-9]");
    }

    public static String removeUrlAnchor(String url) {
        return "";
    }
}
