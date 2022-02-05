package com.mathematical;

public class CountNoOfDigits {

    public static int noOfDigits(int no){
        int count = 0;
        while(no > 0){
            no = no/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("No of Digits: " + noOfDigits(123));
    }
}
