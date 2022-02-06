package com.mathematical;

public class GCDorHCF {
    static int gcd(int no1, int no2) {
        int result = Math.min(no1, no2);

        while (result > 0) {
            if (no1 % result == 0 && no2 % result == 0)
                break;
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("GCD or HCF is: " + gcd(4, 8));
    }
}
