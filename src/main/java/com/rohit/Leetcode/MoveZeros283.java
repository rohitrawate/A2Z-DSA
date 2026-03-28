package com.rohit.Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/
/*
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
 */
public class MoveZeros283 {

    public static void moveZeroes(int[] nums) {
        int left = 0; // Position to put next Non-zero int

        for (int right=0; right<nums.length ; right++ ) {
            if( nums[right] != 0){
                swap(nums, left, right);
                left++;
                System.out.println(" -> "+Arrays.toString(nums));
            }
        }

    }

    public static void swap(int[] arr,int i, int j ){
        int temp = arr[i];
        arr[i]   = arr[j];
        arr[j]   = temp;
    }

    public static void moveZerosBrute(int[] arr){
        int j=-1;

        for (int i = 0; i <arr.length ; i++) {
            if( arr[i] == 0){
                j = i;
                System.out.println("ans ==0 :"+j);
                break;
            }
        }

        if(j == -1){  // if no zero(0) found
            return;
        }

        for (int i = j+1; i < arr.length; i++) {
            if( arr[i] != 0){
                System.out.println("i  != 0: "+ i);
                swap(arr, i, j);
                j++;
               System.out.println(" -> "+Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    static void main() {
        int[] nums ={0,1,0,3,12};

//        moveZerosBrute(nums);
        moveZeroes(nums);
    }
}
