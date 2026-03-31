package com.rohit.Leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate_217 {

    public static boolean containsDuplicate(int[] num) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i=0; i<num.length; i++){

            if( !seen.add(num[i]))
            {
                return  true;
            }
        }
        return false;
    }

    static void main() {
        System.out.println( " Contains Duplicate ");
        int[] num = {1,23,4,5,6,7};
        System.out.println("Ans: " + containsDuplicate(num));

    }
}
