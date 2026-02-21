package com.rohit.Sorting;

import java.util.Arrays;

public class MergeSort {

    static void main() {
        System.out.println("Merge Sort");

        int [] arr = {12,34,6,87,23,54};
        int low = 0;
        int high = arr.length-1;

         mergeSort( arr, low , high);

        System.out.println("ans : "+ Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid =  ( high + low) /2 ;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid +1, high);
        merge(arr, low, mid, high);

    }
//        return res;
//    }
    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[ high-low + 1];

         int left = low;
         int right = mid +1;
         int index = 0;

         while( left <= mid && right <=  high) {
             if ( arr[left] <= arr[right]) {
                 temp[index++] = arr[left++];
             } else {
                 temp[index++] = arr[right++];
             }
         }

         while(left <= mid){
             temp[index++] = arr[left++];
         }
         while( right <= high ){
             temp[index++] = arr[right++];
         }

         for(int i=low; i<=high; i++) {
             arr[i] = temp[i - low];
         }

         Arrays.toString(arr);

    }
}
