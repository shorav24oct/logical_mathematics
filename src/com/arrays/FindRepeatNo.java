package com.arrays;

import java.util.Scanner;

public class FindRepeatNo {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        int repeatedNo = repeatEfficient(arr);
        System.out.println("Repeated No is: " + repeatedNo);
    }

    // naive approach
    public static int repeat(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int repeatEfficient(int[] arr){
        int n = arr.length;
        int sumN = ((n-2) * (n-1)) / 2;
        int sum = Utility.sum(arr);
        System.out.println(sum);
        return sum - sumN;
    }
}
