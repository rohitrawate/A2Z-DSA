package com.rohit.Problems;

import java.util.Arrays;

public class RemoveDuplicates {
    static void main() {
        System.out.println("Remove duplicates");

        int arr[] = {1,1,2,2,3,3,3,5,5};
        int ans = uniqueElements(arr);
        System.out.println("Ans :"+ ans);
        System.out.println("arr: "+ Arrays.toString(arr));
    }
    public static int uniqueElements(int[] arr){
        int i =0;
        for ( int j = 1;  j < arr.length ; j++) {
            if( arr[j] != arr[i] ){
                arr[i+1] = arr[j];   // ++i = j
                i++;
            }
        }
        return  i+1;
    }
}
