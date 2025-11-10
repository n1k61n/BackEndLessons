package org.example;

import java.util.Arrays;

public class Board {
    private int[][]board;


    public Board(int[][] board) {
        this.board = board;
    }

    public void printBoard(){
        for(int[] row : board){
            for(int j : row){
                System.out.print(j==1 ? "x" : " ");
            }
            System.out.println();
        }
    }

    public void nextGeneration() {
        int m = board.length;
        int n = board[0].length;
        int[][] next = new int[m][n];
        for(int i = 0 ; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                int liveNeigbors = countNeighbors( i, j);
                if(board[i][j] == 1 && (liveNeigbors < 2 || liveNeigbors > 3)) next[i][j] = 0;
                else if(board[i][j] == 1 && (liveNeigbors == 2 || liveNeigbors == 3)) next[i][j] = 1;
                else if(board[i][j] == 0 && liveNeigbors == 3 ) next[i][j] = 1;
                else  next[i][j] = board[i][j];
            }
        }
        board = next;
    }

    public int countNeighbors(int x, int y) {
        int count = 0;
        int m = board.length;
        int n = board[0].length;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (j == 0 && i == 0) continue;
                int ni = x + i;
                int nj = y + j;
                if (ni >= 0 && ni < m && nj >= 0 && nj < n && board[ni][nj] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
