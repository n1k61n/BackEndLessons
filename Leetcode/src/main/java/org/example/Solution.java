package org.example;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {


//1.Любая живая клетка, у которой меньше двух живых соседей, погибает,
// как будто из-за недостаточной численности населения.
// 2.Любая живая клетка с двумя или тремя живыми соседями продолжает
// существовать в следующем поколении
// 3.Любая живая клетка, имеющая более трех живых соседей, погибает,
// как будто из-за перенаселения.
// 4.Любая мертвая клетка, имеющая ровно три живых соседа, становится
// живой клеткой, как бы путем размножения.
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] copy = new int[m][n];
        int neigbors;
        for(int i =0 ; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                neigbors = countNeighbors(board, i, j);
                if(board[i][j] == 1 && neigbors < 2) copy[i][j] = 0;
                else if(board[i][j] == 1 && (neigbors == 2 || neigbors == 3)) copy[i][j] = 1;
                else if(board[i][j] == 1 && neigbors > 3 ) copy[i][j] = 0;
                else if(board[i][j] == 0 && neigbors == 3 ) copy[i][j] = 1;
                else  copy[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < copy.length; i++)
            board[i] = Arrays.copyOf(copy[i], copy[i].length);
    }

    public int countNeighbors(int[][] board, int x, int y) {
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


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer  = new int[n];

        int prefix = 1;
        for(int i = 0; i < n ; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix  = 1;
        for(int i = n-1; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }

    public int lastStoneWeight(int[] stones) {
        // Создаём max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Пока в куче больше одного камня
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();  // самый тяжёлый
            int second = maxHeap.poll(); // второй по тяжести

            if (first != second) {
                maxHeap.add(first - second); // разницу возвращаем в кучу
            }
        }

        // Возвращаем вес последнего камня или 0
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 1;
        int result = i * k;
        while( i < nums.length && Arrays.binarySearch(nums, result)  >= 0){
            i++;
            result = i * k;
        }
        return result;
    }
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            int mod = ((num % value) + value) % value;
            freq.put(mod, freq.getOrDefault(mod, 0) + 1);
        }

        int mex = 0;
        while (true) {
            int mod = mex % value;
            if (freq.getOrDefault(mod, 0) > 0) {
                freq.put(mod, freq.get(mod) - 1);
                mex++;
            } else {
                break;
            }
        }

        return mex;
    }
}
