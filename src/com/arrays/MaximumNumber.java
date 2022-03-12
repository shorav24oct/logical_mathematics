package com.arrays;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] arr = input();
        int max = maximum(arr);
        System.out.println("Maximum no is: " + max);
    }

    public static int[] input() {
        System.out.println("Enter Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + "th element of array");
            arr[i] = sc.nextInt();
        }
        return arr;
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
