package com.mathematical;

public class TrailingZerosInFactorial {
    // naive solution
    static int trailZeros(int no){
        int fact = 1;
        for(int i = 2; i <= no; i++)
            fact = fact * i;

        int res = 0;
        while(fact % 10 == 0){
            res++;
            fact = fact / 10;
        }
        return res;
    }

    //better solution
    static int countTrailZeros(int no) {
        int result = 0;
        for (int i = 5; i <= no; i = i * 5)
            result = result + no / i;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("No of Leading zero's: " + countTrailZeros(251));
    }
}
