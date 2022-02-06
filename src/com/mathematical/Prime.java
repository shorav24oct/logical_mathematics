package com.mathematical;

public class Prime {
    // iterative sol
    static boolean isPrime(int no) {
        if (no == 1)
            return false;

        for (int i = 2; i <= no; i++)
            if (no % i == 0)
                return false;

        return true;
    }

    // more efficient method
    static boolean isPrime2(int no) {
        if (no == 1) return false;
        if (no == 2 || no == 3) return true;
        if (no % 2 == 0 || no % 3 == 0) return false;

        for (int i = 5; i * i <= no; i = i + 6)
            if (no % i == 0 || no % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Prime: " + isPrime2(1031));
    }
}
