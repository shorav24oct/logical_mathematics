package com.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = Utility.input();
        int largest = getLargeElement(arr);
        System.out.println("Largest Element is: " + arr[largest]);
    }

    // naive approach
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

    // efficient solution
    public static int getLargeElement(int[] arr){
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[res])
                res = i;
        }
        return res;
    }
}
