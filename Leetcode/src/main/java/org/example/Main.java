package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Solution sol = new Solution();
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        sol.gameOfLife(board);

    }
}
