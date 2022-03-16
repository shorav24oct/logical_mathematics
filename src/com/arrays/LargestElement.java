package com.arrays;

/**
 * I/P: arr[] = {10, 5, 8, 20}
 * O/P: 3 // index of 20
 */
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        int largest = getLargestElementEff(arr);
        System.out.println("Largest Element is: " + arr[largest]);
    }

    /**
     * Naive Approach
     * Time Complexity O(n^2)
     */
    public static int getLargestElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }

    /**
     * efficient solution
     * Time Complexity O(n)
     */
    public static int getLargestElementEff(int[] arr){
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[res])
                res = i;
        }
        return res;
    }
}
