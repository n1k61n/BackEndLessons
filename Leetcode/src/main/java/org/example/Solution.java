package org.example;

import javax.swing.*;
import java.util.*;

public class Solution {

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
