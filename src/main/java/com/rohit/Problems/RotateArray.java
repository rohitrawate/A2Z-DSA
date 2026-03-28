package com.rohit.Problems;

import java.util.Arrays;

public class RotateArray {
    static void main() {
        System.out.println("Rotate Array");

        int arr[] = {1,2,3,4,5,6,7};  // n=7
        int d= 3;
        int n = arr.length;
        System.out.println("1: " + Arrays.toString(reverse(arr, 0, d - 1)));
        System.out.println("2: " + Arrays.toString(reverse(arr, d , n - 1)));
        System.out.println("3: " + Arrays.toString(reverse(arr, 0, n - 1)));
    }

    public static int[] reverse(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
