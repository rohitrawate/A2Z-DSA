package com.rohit.Leetcode;

//https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;

public class TwoSum1 {
    public  static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer>  seen = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            if( seen.containsKey(target - nums[i]) && i != seen.get(target-nums[i]) )
            {
                System.out.println("ans: "+  i +" : "+ seen.get(target - nums[i]));
                return new int[] { i, seen.get(target - nums[i]) };
            }

            seen.put(nums[i], i );
        }

        return new int[2];
    }

    static void main() {
        int[] arr= {2,7,11,15};
        int target = 13;
        twoSum(arr, target);

    }
}
