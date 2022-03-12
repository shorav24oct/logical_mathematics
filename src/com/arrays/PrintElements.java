package com.arrays;

import java.util.Scanner;

public class PrintElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i = 0; i < n; i++){
            System.out.println("enter " + i + "th of an array");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }



}
