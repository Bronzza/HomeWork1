package com.company.repin;

public class ToPower {
    public static double raisToPower(int number, int pow) {
        double result = 1;
        if (pow == 1) {
            return number;
        }
        for (int i = 0; i < Math.abs(pow); i++) {
            result *= number;
        }
        if (pow > 0) {
            return (int) result;
        }
        return 1 / result;
    }


}
