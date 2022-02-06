package com.logical;

public class Main {

    public static void main(String[] args) {
        double a = 4.3;
        double b = 1.0 / 0;
        double c = 0.0;
        double d = -0.0;
        double e = -2.3;

        System.out.println(Math.floor(a));

        // Input Infinity, Output Infinity
        System.out.println(Math.floor(b));

        // Input Positive Zero, Output Positive Zero
        System.out.println(Math.floor(c));

        // Input Negative Zero, Output Negative Zero
        System.out.println(Math.floor(d));

        // Input -2.3, Output -3.0
        // Nearest Integer(-3.0) < less than (-2.3)
        System.out.println(Math.floor(e));
    }
}
