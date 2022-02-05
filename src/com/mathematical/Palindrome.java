package com.mathematical;

public class Palindrome {
    public static boolean isPalindrome(int no){
        int reverse = no;
        int rem = 0;
        int result = 0;
        while(no > 0){
            rem = no % 10;
            result = result * 10 + rem;
            no = no / 10;
        }
        return (reverse == result);
    }

    public static void main(String[] args) {
        System.out.println("is palindrome or not: " + isPalindrome(866));
    }
}
