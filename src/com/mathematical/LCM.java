package com.mathematical;

public class LCM {
    static int lcm(int a, int b) {
        int result = Math.max(a, b);

        while (true) {
            if (result % a == 0 && result % b == 0)
                break;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("LCM is: " + lcm(12, 15));
    }
}
