package com.company.repin;

class AlgebraicNumb {


    public static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    public static int factorial(int nomer) {
        if (nomer == 0 || nomer == 1) return 1;
        else {
            int result = 2;
            for (int i = 3; i <= nomer; i++) {
                result *= i;
            }
            return result;
        }
    }
}
