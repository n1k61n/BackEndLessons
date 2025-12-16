package org.example;

import java.util.Arrays;

public class Main {

    static void main(String[] args){





    }



    static  int addedInteger(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            return 0;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return nums2[0] - nums1[0];
        
    }

}


