package org.example;

public class Regex {
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
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        return s.matches("tree fiddy|3.50|three fifty");
    }
    public final static boolean isDigit(String s) {
        return s.matches("[0-9]");
    }
}
