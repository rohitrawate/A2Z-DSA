package com.rohit.Leetcode;

import java.util.Arrays;

public class ProductExceptSelf_238 {
    static void main() {

        int[] num = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(num);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] num){
        int left = 1;
        int right = 1;
        int[] prefix = new int[num.length];
        Arrays.fill(prefix, 1);

        for (int i = 0; i <num.length ; i++)
        {
            prefix[i] = left;
            left = left * num[i];
        }

        int suffix = 1;
        for (int j = num.length-1; j>=0  ; j--)
        {
            prefix[j] = prefix[j] * suffix;
            suffix    = suffix * num[j];
        }

        return prefix;
    }

}
