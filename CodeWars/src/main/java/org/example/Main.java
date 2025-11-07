package org.example;

public class Main {
    public static void main(String[] args) {
//        String input = "Kod: 12345, tarix: 2025";
//        Pattern pattern = Pattern.compile("[0-9]+");
//        Matcher matcher = pattern.matcher(input);
//
//        while(matcher.find())
//            System.out.println(matcher.group());
//
//        String input = "Əlaqə: test@example.com və info@site.az";
//        Pattern pattern = Pattern.compile("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}");
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()) {
//            System.out.println("Tapılan email: " + matcher.group());
//        }

//        String numbers = "1";
//        System.out.println(Regex.isDigit(numbers));

// List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        String digits = "312";
//        System.out.println(explode(digits));

    }

    public static String explode(String digits) {
        StringBuilder repeated = new StringBuilder();
        for(Character c : digits.toCharArray()){
            repeated.append(String.valueOf(c).repeat(Character.getNumericValue(c)));
        }
        return repeated.toString();
    }
}


