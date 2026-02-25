package com.rohit.Sorting;

import java.util.Arrays;

public class QuickSort {
    public void main(){
        System.out.println("Quick Sort");
        int[] arr = {4,3,1,5,9,7,8};

        quickSort(arr, 0, arr.length-1);
        System.out.println("Arr : " + Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high){
        if( low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while( i < j ){

            while( arr[i] <= pivot && i <= high -1){
                i++;
            }
            while( arr[j] > pivot && j >= low + 1){
                j--;
            }

            if(i < j){
                swap(arr, i, j);
            }
        }
         //  !(i < j)  Not true swap pivot with j index
                swap(arr, low, j);
        return j;   // Correct position/index of pivot i.e j  when   j < i
    }

    public static void swap(int[] arr, int i, int j){
        int temp =  arr[i];
         arr[i]  =  arr[j];
         arr[j]  =  temp;
    }
}
