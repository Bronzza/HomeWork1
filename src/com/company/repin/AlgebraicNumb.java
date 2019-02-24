package com.company.repin;

public class AlgebraicNumb {


    public static int fibonachi(int n) {
        return ((n == 0) ? 0 : ((n == 1)) ? 1 : fibonachi(n - 1) + fibonachi(n - 2));
    }

    public static int factorial(int nomer) {
        int result;
        if (nomer == 1) {
            return 1;
        }
        result = factorial(nomer - 1) * nomer;
        return result;
    }
}

