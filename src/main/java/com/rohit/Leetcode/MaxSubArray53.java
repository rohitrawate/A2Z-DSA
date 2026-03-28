package com.rohit.Leetcode;
//  https://leetcode.com/problems/maximum-subarray/description/
public class MaxSubArray53 {

    public static int maxSubArr(int[] num) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int ele : num)
        {
            currSum += ele;
            maxSum = Math.max(currSum, maxSum);
            System.out.println("sum: "+currSum +"\n MaxZ: "+maxSum);

            if( currSum < 0 ){
                currSum = 0;
            }
        }
        return maxSum;
    }

    static void main() {
        System.out.println("MaxSubArray : 53");

        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArr(num);
        System.out.println();
    }
}
