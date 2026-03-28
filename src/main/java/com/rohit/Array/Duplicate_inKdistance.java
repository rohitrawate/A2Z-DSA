package com.rohit.Array;

// https://www.geeksforgeeks.org/dsa/check-given-array-contains-duplicate-elements-within-k-distance/
/*
    Given an integer array arr[] and an integer k, determine whether there exist two indices i and j
    such that arr[i] == arr[j] and |i - j| ≤ k. If such a pair exists, return 'Yes', otherwise return 'No'.
 */

import java.util.HashSet;

public class Duplicate_inKdistance {
    static void main() {
        System.out.println("duplicate withinK distance");

        int[] arr = {1, 2, 3,1, 4, 1, 2, 3, 4};
        int k = 3;

        boolean ans = checkDuplicatesWithinK(arr, k);
        System.out.print("Answer: " + ans );
    }

    public static boolean checkDuplicatesWithinK(int[] arr, int k){

        HashSet<Integer>  set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if( set.contains(arr[i])){
                 return true;
            }

            set.add(arr[i]);

            if( i >= k)
            {
                set.remove(arr[ i-k ]);
            }
        }
        return  false;
    }
}
