package com.rohit.Problems;

public class SecondLargest {
    void main(){
        System.out.println("2nd Largest");
        int[] arr = {1,4,2,7,7,5};
        int res  = secondLargest(arr);
        System.out.println("Ans : "+ res);
    }

    private int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1; // Assuming there is no negative number

        for(int i=1; i< arr.length; i++){
            if( arr[i] >  largest){
                secondLargest = largest;
                largest = arr[i];
            } else if( arr[i] < largest && arr[i] > secondLargest ){
                secondLargest = arr[i];
            }
        }
            return secondLargest;
    }

}
