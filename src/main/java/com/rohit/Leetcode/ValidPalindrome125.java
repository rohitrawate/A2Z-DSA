package com.rohit.Leetcode;

//  https://leetcode.com/problems/valid-palindrome/description/
// Intuition: Two Pointers
public class ValidPalindrome125 {

    public boolean isPalindrome(String str) {
        int left=0, right= str.length()-1;

        while( left < right)
        {
            while( left < right && !Character.isLetterOrDigit(str.charAt(left)) )
            {
                left++;
            }
            while( left < right && !Character.isLetterOrDigit(str.charAt(right)))
            {
                right--;
            }

            while(Character.toLowerCase(str.charAt(left))
                    != Character.toLowerCase(str.charAt(right)) )
            {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    static void main() {
        System.out.println("IsValid Palindrome");
    }
}
