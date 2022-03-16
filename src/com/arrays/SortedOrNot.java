package com.arrays;

/**
 * I/P: arr[] = {8, 12, 15}
 * O/P: true
 * <p>
 * I/P: arr[] = {100, 20, 200}
 * O/P: false
 */
public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        boolean result = isSortedEff(arr);
        System.out.println("Given array is sorted: " + result);
    }

    // naive approach
    // time complexity Big-O(n^2)
    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    // efficient solution
    // time complexity Big-O(n)
    public static boolean isSortedEff(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
}
