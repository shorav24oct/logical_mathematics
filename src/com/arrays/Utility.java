package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
    public static int[] input() {
        System.out.println("Enter Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element of array ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sum(int[] arr){
        return Arrays.stream(arr).sum();
    }
}
