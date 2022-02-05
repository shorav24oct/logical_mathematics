package com.mathematical;

public class Factorial {

    // iterative solution
    public static int factorial(int no){
        int fact = 1;
        for(int i = 2; i <= no; i++)
            fact = fact * i;
        return fact;
    }

    // recursive solution
    public static int factorialRecursive(int no) {
        if (no == 0)
            return 1;
        return no * factorial(no - 1);
    }

    public static void main(String[] args) {
        System.out.println("Iterative factorial is: " + factorial(5));
        System.out.println("recursive factorial is: " + factorialRecursive(6));
    }

}
