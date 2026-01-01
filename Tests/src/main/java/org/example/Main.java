package org.example;

public class Main {
    static void main(String[] args){

        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

// [2,0,2,1,1,0]
    //[2,0,1]

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while (mid <= right){
            if(nums[mid] == 0){
                swap(nums, left, mid);
                left++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, right);
                right--;
            }
        }
    }



    static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}


