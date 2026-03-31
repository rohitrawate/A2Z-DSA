package com.rohit.Leetcode;

public class BuySell_Stock_121 {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_profit = 0;

        for ( int ele : prices)
        {
            if( ele < min)
            {
                min = ele;
            }
            else {
                max_profit = Math.max(max_profit, ele - min);
            }
        }
        return max_profit;
    }

    static void main() {
        int[] arr = {7,1,5,3,6,4};
        int ans  = maxProfit(arr);
        System.out.println("Buy Max Profit: "+ ans);
    }
}
