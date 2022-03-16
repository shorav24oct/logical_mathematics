package com.arrays;

/**
 * I/P: arr[] = {10, 5, 8, 20}
 * O/P: 0 // index of 10
 *
 * I/P: arr[] = {20, 12, 5, 8, 20}
 * O/P: 1 // index of 12
 *
 * I/P: arr[] = {20, 20, 20}
 * O/P: -1 // no second largest element
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        int element = secondLargestElement(arr);
        System.out.println("second largest element is: " + arr[element]);
    }

    /**
     * naive approach
     */
    public static int secondLargestElement(int[] arr) {
        int largest = LargestElement.getLargestElementEff(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1)
                    res = i;
                else if (arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }
}
