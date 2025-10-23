package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
    }
}
