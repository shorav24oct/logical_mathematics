package com.arrays;

import java.util.Arrays;

/**
 *  I/P: arr = {10, 5, 7, 30}
 *  O/P: arr = {30, 7, 5, 10}
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        System.out.println("Before reverse: " + Arrays.toString(arr));
        System.out.println("After reverse: " + Arrays.toString(reverse(arr)));
    }

    // time complexity theta(n)
    public static int[] reverse(int[] arr){
        int n = arr.length;;
        int low = 0;
        int high = n - 1;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}
