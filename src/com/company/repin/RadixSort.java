package com.company.repin;

public class RadixSort {
    public static void radixSort(int arr[]) {
        final int radix = String.valueOf(Integer.MAX_VALUE).length();
        int digitPlace = 1;
        int n = arr.length;
        int result[] = new int[n];

        int largestNum = getMax(arr);


        int count[] = new int[radix];
        while (largestNum / digitPlace > 0) {
            for (int i = 0; i < radix; i++) {
                count[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                int tmpIndex = Math.abs((arr[i] / digitPlace) % radix);
                count[tmpIndex]++;
            }
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                int tmpIndex = Math.abs((arr[i] / digitPlace) % radix);
                result[count[tmpIndex] - 1] = arr[i];
                count[tmpIndex]--;
            }
            for (int i = 0; i < n; i++) {
                arr[i] = result[i];
            }
            digitPlace *= 10;
        }
    }

    private static int getMax(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
