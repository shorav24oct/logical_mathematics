package com.arrays;

import java.util.Scanner;

public class FindRepeatNo {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        int repeatedNo = repeat(arr);
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
}
