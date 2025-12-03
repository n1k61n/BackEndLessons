package org.example;


import java.util.Arrays;

public class Main {
    final static String[] TOY_NAMES = {"Race Car", "Dollhouse", "Lego Set", "Puzzle Mat", "Robot Kit",
            "Water Gun", "Toy Soldier", "Play Dough Tub", "Marble Run", "Kite",
            "Frisbee", "Slime Container", "Drum Set", "Hula Hoop", "Skip Rope"};

    final static String[] COLORS = {"Red", "Blue", "Yellow", "Green", "Pink", "Black", "White", "Purple"};

    static void main(String[] args) {
        String[] arrays = generateInsertStatements(100);
        for(String sql : arrays) {
            System.out.println(sql);
        }
    }

    static String[] generateInsertStatements(int count) {
        String[] statements = new String[count];
        for (int i = 0; i < count; i++) {
            String toyName = TOY_NAMES[(int) (Math.random() * TOY_NAMES.length)];
            String color = COLORS[(int) (Math.random() * COLORS.length)];

            double price = Math.random() * 100;
            int stock = (int) (Math.random() * 250);
            String sql = "INSERT INTO toys (toys_name, color, price, stock) VALUES ('%s', '%s', %.2f, %s),".formatted(toyName, color, price, stock);
            statements[i] = sql;
        }

        return statements;
    }


}


