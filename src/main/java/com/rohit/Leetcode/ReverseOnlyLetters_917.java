package com.rohit.Leetcode;

import java.util.Arrays;
// https://leetcode.com/problems/reverse-only-letters/description/

public class ReverseOnlyLetters_917 {
    static void main() {
        String str = "RO9HI2T23";
        String ans  = reverseOnlyLetters(str);
        System.out.println("ANS: "+ans);
    }

    public static String reverseOnlyLetters(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while(left < right) {

            if(!Character.isLetter(arr[left]))
            {
                left++;
            } else if ( !Character.isLetter(arr[right]))
            {
                right--;
            }
            else{
                char temp  = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;
                right--;
                System.out.println("arr : "+Arrays.toString(arr));
            }
        }
        return new String(arr);
    }
}
