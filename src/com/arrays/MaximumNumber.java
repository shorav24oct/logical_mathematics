package com.arrays;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] arr = Utility.input();
        int max = maximum(arr);
        System.out.println("Maximum no is: " + max);
    }

    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
